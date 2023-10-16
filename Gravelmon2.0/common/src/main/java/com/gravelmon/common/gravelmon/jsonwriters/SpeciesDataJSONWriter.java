package com.gravelmon.common.gravelmon.jsonwriters;

import com.gravelmon.common.gravelmon.games.*;
import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.io.*;
import java.nio.file.*;

public class SpeciesDataJSONWriter {
    public static void writeSpecies(Game game){
        String dir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\data\\cobblemon\\species\\"+game.getName().toLowerCase()+"\\";
        game.getPokemon().forEach(pokemon -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(pokemon, dir, game);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    public static void writePlaceholder() {
        String dir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\spellingFixPack\\data\\cobblemon\\species\\infinity\\";
        EghoPokemon.placeholders.forEach(pokemon -> {
            try {
                Files.createDirectories(new File(dir).toPath());
                writePokemon(pokemon, dir, null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writePokemon(Pokemon pokemon, String dir, Game game) throws IOException {
        if(pokemon.getPrimaryType() == null){
            System.out.println(pokemon.getName());
        }
        String fileContents =
                "{\n" +
                        "  \"implemented\": true,\n" +
                        "  \"name\": \""+pokemon.getCleanName()+"\",\n" +
                        "  \"nationalPokedexNumber\": "+pokemon.getPokedexNumber()+",\n" +
                        "  \"primaryType\": \""+pokemon.getPrimaryType().getName()+"\",\n";
        if(pokemon.getSecondaryType() != null){
            fileContents +="  \"secondaryType\": \""+pokemon.getSecondaryType().getName()+"\",\n";
        }
        fileContents += "  \"abilities\": [\n";
        int abilities = 0;
        for (Ability ability : pokemon.getAbilities()) {
            if(ability.isImplemented()){
                fileContents += "    \""+ability.getName()+"\",\n";
                abilities++;
            }
        }
        if (abilities == 0){
            fileContents += "    \""+Ability.KEEN_EYE.getName()+"\",\n";
        }
        if(pokemon.getHiddenAbility().isImplemented()) {
            fileContents += "    \"h:"+pokemon.getHiddenAbility().getName()+"\"\n";
        } else {
            fileContents += "    \"h:"+Ability.KEEN_EYE.getName()+"\"\n";
        }


        fileContents += "  ],\n" +
                        "  \"baseStats\": {\n" +
                        "    \"hp\": "+pokemon.getStats().getHP()+",\n" +
                        "    \"attack\": "+pokemon.getStats().getAttack()+",\n" +
                        "    \"defence\": "+pokemon.getStats().getDefense()+",\n" +
                        "    \"special_attack\": "+pokemon.getStats().getSpecialAttack()+",\n" +
                        "    \"special_defence\": "+pokemon.getStats().getSpecialDefense()+",\n" +
                        "    \"speed\": "+pokemon.getStats().getSpeed()+"\n" +
                        "  },\n" +
                "  \"behaviour\": {\n" +
                "    \"resting\": {\n" +
                "        \"canSleep\": "+pokemon.canSleep()+",\n" +
                "        \"willSleepOnBed\": "+pokemon.willSleepOnBed()+","+
                "        \"depth\": \"normal\",\n" +
                "        \"light\": \""+pokemon.getLightLevelMinSleep()+"-"+pokemon.getLightLevelMaxSleep()+"\"\n" +
                "    },\n" +
                "    \"moving\": {\n" +
                "        \"fly\": {\n" +
                "            \"canFly\": "+pokemon.canFly()+"\n" +
                "        },\n" +
                "        \"canLook\": "+pokemon.canLookAround()+",\n" +
                "        \"walk\": {\n" +
                "            \"canWalk\": "+pokemon.canWalk()+",\n" +
                "            \"avoidsLand\": "+pokemon.avoidsLand()+"\n" +
                "        },\n" +
                "        \"swim\": {\n" +
                "            \"swimSpeed\": "+pokemon.getSwimSpeed()+",\n" +
                "            \"canSwimInWater\": "+ pokemon.canSwim() +",\n" +
                "            \"canBreatheUnderwater\": "+pokemon.canBreathUnderwater()+"\n" +
                "        },\n" +
                "        \"wanderChance\": "+pokemon.getWanderChance()+"\n" +
                "    }\n" +
                "  },\n" +
                        "  \"catchRate\": "+pokemon.getCatchRate()+",\n" +
                        "  \"maleRatio\": "+pokemon.getMaleRatio()+",\n" +
                        "  \"shoulderMountable\": "+pokemon.isShoulderMountable()+",\n";
        if(pokemon.getShoulderMountEffect()!=null){
            fileContents += "\"shoulderEffects\": [\n" +
                    "    \""+pokemon.getShoulderMountEffect()+"\"\n" +
                    "  ],";
        }
        boolean isFirstForm = true;

        if(pokemon.getForms().size()>0){
            fileContents += "\"forms\": [";
            for(PokemonForm form : pokemon.getForms()){
                if(isFirstForm){
                    isFirstForm = false;
                } else {
                    fileContents += ",\n";
                }
                fileContents += generateForm(form, pokemon);
            }
            fileContents += "\n],\n";
        }
        fileContents += "  \"baseExperienceYield\": "+pokemon.getBaseExperienceYield()+",\n" +
                        "  \"experienceGroup\": \""+pokemon.getExperienceGroup().getName()+"\",\n" +
                        "  \"eggCycles\": "+pokemon.getEggCycles()+",\n" +
                        "  \"eggGroups\": [\n";
        boolean isFirstEggGroupEntry = true;
        for (EggGroup eggGroup : pokemon.getEggGroups()) {
            if(isFirstEggGroupEntry){
                isFirstEggGroupEntry = false;
            } else {
                fileContents+=",\n";
            }
            if(eggGroup.isImplemented()){
                fileContents += "    \""+eggGroup.name().toLowerCase()+"\"";
            } else {
                fileContents += "    \""+EggGroup.UNDISCOVERED.name().toLowerCase()+"\"";
            }

        }
        fileContents += "\n  ],";
        if(!pokemon.getDrops().isEmpty()){
            fileContents +=
                    "\n  \"drops\": {\n" +
                    "    \"amount\": \""+pokemon.getDropAmount()+"\",\n" +
                    "    \"entries\": [\n";
            boolean isFirstDropEntry = true;
            for (ItemDrop itemDrop : pokemon.getDrops()) {
                if(isFirstDropEntry){
                    isFirstDropEntry=false;
                } else {
                    fileContents += ",\n";
                }
                fileContents += "      {\n" +
                        "        \"item\": \""+itemDrop.getItemId()+"\",\n" +
                        "        \"quantityRange\": \""+itemDrop.getQuantityMin()+"-"+itemDrop.getQuantityMax()+"\",\n" +
                        "        \"percentage\": "+itemDrop.getChance()+"\n" +
                        "      }";
            }
            fileContents += "\n    ]\n" +
                    "  },";
        }
        fileContents +="\n  \"moves\": [\n";
        boolean isFirstLearnSetEntry = true;
        for (MoveLearnSetEntry moveLearnsetEntry : pokemon.getLearnSet()){
            if(moveLearnsetEntry.getMove().isImplemented()) {
                if(isFirstLearnSetEntry){
                    isFirstLearnSetEntry=false;
                } else {
                    fileContents += ",\n";
                }
                fileContents += "    \"" + moveLearnsetEntry.getCondition() + ":" + moveLearnsetEntry.getMove().getName() + "\"";
            }
        }
        fileContents += "  ],\n" +
                        "  \"labels\": [\n";
        boolean isFirstLabelEntry = true;
        for (Label label : pokemon.getLabels()){
            if(isFirstLabelEntry){
                isFirstLabelEntry = false;
            } else {
                fileContents +=",\n";
            }
            fileContents += "    \""+label.getName()+"\"";
        }
        fileContents += "\n  ],\n" +
                        "  \"pokedex\": [\n";

        if(pokemon.isNew()){
            fileContents += "    \"cobblemon.species."+pokemon.getCleanName()+".desc\"\n";
        } else {
            int dexEntryCounter = 1;
            for (String entry : pokemon.getDexEntries()){
                fileContents += "    \"cobblemon.species."+pokemon.getCleanName()+".desc"+dexEntryCounter+"\"\n";
                dexEntryCounter++;
            }
        }

        fileContents += "  ],\n";
        if(pokemon.getPreEvolution()!=null){
            fileContents += "  \"preEvolution\": \""+pokemon.getPreEvolution()+"\",\n";
        }

        fileContents = getEvolutions(pokemon, fileContents);

        fileContents +=
                        "  \"baseScale\": "+pokemon.getBaseScale()+",\n" +
                        "  \"hitbox\": {\n" +
                        "    \"width\": "+pokemon.getHitboxWidth()+",\n" +
                        "    \"height\": "+pokemon.getHitboxHeight()+",\n" +
                        "    \"fixed\": false\n" +
                        "  },\n" +
                        "  \"baseFriendship\": "+pokemon.getBaseFriendship()+",\n" +
                        "  \"evYield\": {\n" +
                        "    \"hp\": "+pokemon.getEvYield().getHP()+",\n" +
                        "    \"attack\": "+pokemon.getEvYield().getAttack()+",\n" +
                        "    \"defence\": "+pokemon.getEvYield().getDefense()+",\n" +
                        "    \"special_attack\": "+pokemon.getEvYield().getSpecialAttack()+",\n" +
                        "    \"special_defence\": "+pokemon.getEvYield().getSpecialDefense()+",\n" +
                        "    \"speed\": "+pokemon.getEvYield().getSpeed()+"\n" +
                        "  },\n" +
                        "  \"height\": "+pokemon.getHeight()+",\n" +
                        "  \"weight\": "+pokemon.getWeight()+",\n" +
                        "  \"aspects\": [],\n" +
        "\"features\": [\n";
        boolean isFirstFeatureEntry = true;
        for (PokemonForm form : pokemon.getForms()){
            if(isFirstFeatureEntry){
                isFirstFeatureEntry = false;
            } else {
                fileContents += ",\n";
            }
            fileContents += "\""+form.getCleanName()+"\"";
        }
        fileContents += "\n  ],"+
                        "  \"cannotDynamax\": "+pokemon.cannotDynamax()+"\n" +
                        "}";
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir+pokemon.getCleanName()+".json"));
        writer.write(fileContents);
        writer.close();
        if(pokemon.isModeled()){
            String modelledDir = "C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\model release\\data\\cobblemon\\species\\"+game.getName().toLowerCase()+"\\";
            BufferedWriter writerModeled = new BufferedWriter(new FileWriter(modelledDir+pokemon.getCleanName()+".json"));
            writerModeled.write(fileContents);
            writerModeled.close();
        }
    }

    private static String getEvolutions(Pokemon pokemon, String fileContents) {
        if(!pokemon.getEvolutions().isEmpty()){
            fileContents += "  \"evolutions\": [\n";
            boolean isFirstEvolution = true;
            for (EvolutionEntry evolution : pokemon.getEvolutions()){
                if(isFirstEvolution){
                    isFirstEvolution =false;
                } else {
                    fileContents += ",\n";
                }
                fileContents += "    {\n" +
                        "      \"id\": \""+ pokemon.getCleanName()+"_"+evolution.getResult()+"\",\n" +
                        "      \"variant\": \""+evolution.getKind().getName()+"\",\n" +
                        "      \"result\": \""+evolution.getResult();
                if(!evolution.getAspects().isEmpty()){
                    for(Aspect aspect : evolution.getAspects()){
                        fileContents += " "+ aspect;
                    }
                }
                fileContents +="\",\n" +
                        "      \"consumeHeldItem\": "+evolution.consumesHeldItem()+",\n";
                if(evolution.hasMoves()){
                    fileContents += "      \"learnableMoves\": [";
                    boolean isFirstLearnSetEntry = true;
                    for (MoveLearnSetEntry moveLearnsetEntry : evolution.getMoves()){
                        if(moveLearnsetEntry.getMove().isImplemented()) {
                            if(isFirstLearnSetEntry){
                                isFirstLearnSetEntry=false;
                            } else {
                                fileContents += ",\n";
                            }
                            fileContents += "    \"" + moveLearnsetEntry.getMove().getName() + "\"";
                        }
                    }
                    fileContents += "],\n";
                } else {
                    fileContents +="      \"learnableMoves\": [],\n";
                }
                fileContents += "      \"requirements\": [\n";
                boolean isFirstRequirement = true;
                for(EvolutionRequirementEntry entry: evolution.getRequirements()){
                    if(isFirstRequirement){
                        isFirstRequirement = false;
                    } else {
                        fileContents += ",\n";
                    }
                    if(entry.getCondition().equals(EvolutionRequirementCondition.PARTY_MEMBER.getCondition())){
                        fileContents += "        {\n" +
                                "          \"variant\": \"" + entry.getRequirementKind() + "\",\n" +
                                "          \"" + entry.getCondition() + "\": " + entry.getConditionParameter() + ",\n" +
                                "          \"contains\": true\n" +
                                "        }";
                    } else {
                        fileContents += "        {\n" +
                                "          \"variant\": \"" + entry.getRequirementKind() + "\",\n" +
                                "          \"" + entry.getCondition() + "\": " + entry.getConditionParameter() + "\n" +
                                "        }";
                    }
                }
                fileContents += "\n      ]";
                if(evolution.getRequiredContext() != null){
                    fileContents += ",\n" +
                            "      \"requiredContext\": \""+evolution.getRequiredContext()+"\"";
                }
                fileContents += "   \n }";
            }
            fileContents += "\n  ],\n";
        }
        return fileContents;
    }

    private static String generateForm(PokemonForm form, Pokemon pokemon){

        String formString =
                "    {\n" +
                "      \"name\": \""+form.getFormName()+"\",\n";
        if(!form.getDexEntries().isEmpty()){
            formString +="      \"pokedex\": [\n";
            int dexEntryCounter = 1;
            for (String entry : form.getDexEntries()){
                formString += "    \"cobblemon.species."+pokemon.getCleanName()+".desc"+dexEntryCounter+"\"\n";
                dexEntryCounter++;
            }
            formString += "  ],\n";
        }
        formString +="      \"primaryType\": \""+form.getPrimaryType().getName()+"\",\n";

        if(form.getSecondaryType() != null){
            formString +="      \"secondaryType\": \""+form.getSecondaryType().getName()+"\",\n";
        }
        formString += "      \"abilities\": [\n";
        int abilities = 0;
        for (Ability ability : form.getAbilities()) {
            if(ability.isImplemented()){
                formString += "    \""+ability.getName()+"\",\n";
                abilities++;
            }
        }
        if (abilities == 0){
            formString += "    \""+Ability.KEEN_EYE.getName()+"\",\n";
        }
        if(pokemon.getHiddenAbility().isImplemented()) {
            formString += "    \"h:"+pokemon.getHiddenAbility().getName()+"\"\n";
        } else {
            formString += "    \"h:"+Ability.KEEN_EYE.getName()+"\"\n";
        }


        formString +=

                "      ],\n" +
                "      \"baseScale\": "+form.getBaseScale()+",\n" +
                "        \"hitbox\": {\n" +
                "          \"width\": "+pokemon.getHitboxWidth()+",\n" +
                "          \"height\": "+pokemon.getHitboxHeight()+",\n" +
                "          \"fixed\": false\n" +
                "      },\n" +
                "      \"baseStats\": {\n" +
                "        \"hp\": "+form.getStats().getHP()+",\n" +
                "        \"attack\": "+form.getStats().getAttack()+",\n" +
                "        \"defence\": "+form.getStats().getDefense()+",\n" +
                "        \"special_attack\": "+form.getStats().getSpecialAttack()+",\n" +
                "        \"special_defence\": "+form.getStats().getSpecialDefense()+",\n" +
                "        \"speed\": "+form.getStats().getSpeed()+"\n" +
                "      },\n" +
                "      \"catchRate\": "+form.getCatchRate()+",\n" +
                "      \"maleRatio\": "+form.getMaleRatio()+",\n" +
                "      \"baseExperienceYield\": "+form.getBaseExperienceYield()+",\n" +
                "      \"baseFriendship\": "+form.getBaseFriendship()+",\n" +
                "      \"evYield\": {\n" +
                "        \"hp\": "+form.getEvYield().getHP()+",\n" +
                "        \"attack\": "+form.getEvYield().getAttack()+",\n" +
                "        \"defence\": "+form.getEvYield().getDefense()+",\n" +
                "        \"special_attack\": "+form.getEvYield().getSpecialAttack()+",\n" +
                "        \"special_defence\": "+form.getEvYield().getSpecialDefense()+",\n" +
                "        \"speed\": "+form.getEvYield().getSpeed()+"\n" +
                "      },\n" +
                "      \"experienceGroup\": \""+form.getExperienceGroup().getName()+"\",\n" +
                "      \"eggCycles\": "+form.getEggCycles()+",\n" +
                "      \"eggGroups\": [\n";
        boolean isFirstEggGroupEntry = true;
        for (EggGroup eggGroup : pokemon.getEggGroups()) {
            if(isFirstEggGroupEntry){
                isFirstEggGroupEntry = false;
            } else {
                formString+=",\n";
            }
            if(eggGroup.isImplemented()){
                formString += "    \""+eggGroup.name().toLowerCase()+"\"";
            } else {
                formString += "    \""+EggGroup.UNDISCOVERED.name().toLowerCase()+"\"";
            }
        }
        formString +="      ],\n" +
                "      \"moves\": [\n";
        boolean isFirstLearnSetEntry = true;
        for (MoveLearnSetEntry moveLearnsetEntry : form.getLearnSet()){
            if(moveLearnsetEntry.getMove().isImplemented()) {
                if(isFirstLearnSetEntry){
                    isFirstLearnSetEntry=false;
                } else {
                    formString += ",\n";
                }
                formString += "    \"" + moveLearnsetEntry.getCondition() + ":" + moveLearnsetEntry.getMove().getName() + "\"";
            }
        }
        formString +="      ],\n" +

                "  \"drops\": {\n" +
                "    \"amount\": \""+form.getDropAmount()+"\",\n" +
                "    \"entries\": [\n";
        boolean isFirstDropEntry = true;
        for (ItemDrop itemDrop : form.getDrops()) {
            if(isFirstDropEntry){
                isFirstDropEntry=false;
            } else {
                formString += ",\n";
            }
            formString += "      {\n" +
                    "        \"item\": \""+itemDrop.getItemId()+"\",\n" +
                    "        \"quantityRange\": \""+itemDrop.getQuantityMin()+"-"+itemDrop.getQuantityMax()+"\",\n" +
                    "        \"percentage\": "+itemDrop.getChance()+"\n" +
                    "      }";
        }
        formString += "\n    ]\n"+
                "      },\n"+
                "      \"labels\": [\n";
        boolean isFirstLabelEntry = true;
        for (Label label : form.getLabels()){
            if(isFirstLabelEntry){
                isFirstLabelEntry = false;
            } else {
                formString +=",\n";
            }
            formString += "    \""+label.getName()+"\"";
        }
        formString += "\n      ],\n" +
                "      \"aspects\": [\n";
        boolean isFirstAspect = true;
        for(Aspect aspect : form.getAspects()){
            if(isFirstAspect){
                isFirstAspect = false;
            } else {
                formString += ",\n";
            }
            formString += "        \""+aspect.name().toLowerCase()+"\"";
        }
        formString +=        "\n      ],\n" +
                "      \"height\": "+form.getHeight()/10+",\n" +
                "      \"weight\": "+form.getWeight()*10+",\n";
        if(!form.getEvolutions().isEmpty()){
            formString += "  \"evolutions\": [\n";
            boolean isFirstEvolutionEntry = true;
            for (EvolutionEntry evolution : form.getEvolutions()){
                if(isFirstEvolutionEntry){
                    isFirstEvolutionEntry = false;
                } else {
                    formString += ",\n";
                }
                formString += "    {\n" +
                        "      \"id\": \""+form.getCleanName()+"_"+pokemon.getCleanName()+"_"+evolution.getResult()+"\",\n" +
                        "      \"variant\": \""+evolution.getKind().getName()+"\",\n" +
                        "      \"result\": \""+evolution.getResult();
                for(Aspect aspect : evolution.getAspects()){
                    formString += " "+ aspect.getName();
                }
                formString += "\",\n" +
                        "      \"consumeHeldItem\": "+evolution.consumesHeldItem()+",\n";
                if(evolution.hasMoves()){
                    formString += "\"learnableMoves\": [";
                    boolean isFirstLearnSetEntryForm = true;
                    for (MoveLearnSetEntry moveLearnsetEntry : evolution.getMoves()){
                        if(moveLearnsetEntry.getMove().isImplemented()) {
                            if(isFirstLearnSetEntryForm){
                                isFirstLearnSetEntryForm=false;
                            } else {
                                formString += ",\n";
                            }
                            formString += "    \"" + moveLearnsetEntry.getCondition() + ":" + moveLearnsetEntry.getMove().getName() + "\"";
                        }
                    }
                    formString += "],";
                } else {
                    formString +="      \"learnableMoves\": [],\n";
                }
                formString += "      \"requirements\": [\n";
                boolean isFirstRequirement = true;
                for(EvolutionRequirementEntry entry: evolution.getRequirements()){
                    if(isFirstRequirement){
                        isFirstRequirement = false;
                    } else {
                        formString += ",\n";
                    }

                    formString +="        {\n" +
                            "          \"variant\": \""+entry.getRequirementKind()+"\",\n" +
                            "          \""+entry.getCondition()+"\": "+entry.getConditionParameter()+"\n" +
                            "        }";
                }
                formString += "\n      ]";
                if(evolution.getRequiredContext() != null){
                    formString += ",\n" +
                            "      \"requiredContext\": \""+evolution.getRequiredContext()+"\"";
                }
                formString += "\n    }";
            }
            formString += "\n  ],\n";
        }
        formString += "      \"cannotDynamax\": "+form.cannotDynamax()+",\n" +
                "      \"battleOnly\": "+form.isBattleOnly()+"\n" +
                "    }";
        return formString;
    }
}