package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianQuilava extends Pokemon {
    public AyreianQuilava(String name, Aspect aspect) {
        super(name, aspect,"AyreianQuilava",
                Type.FIRE, Type.GHOST,
                new Stats(60,65,50,90,80,65),
                List.of(Ability.DROUGHT, Ability.INFILTRATOR), Ability.SOLAR_POWER,
                9, 190,
                new Stats(0,0,0,1,1,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It intimidates foes with intense gusts of flames and superheated air. Its quick nimbleness lets it dodge attacks even while scorching an enemy."),
                List.of(new EvolutionEntry("ayreiantyphlosion", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.WILLOWISP, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.ASTONISH, 5),
                        new MoveLearnSetEntry(Move.EMBER, 6),
                        new MoveLearnSetEntry(Move.MUDSLAP, 8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, 12),
                        new MoveLearnSetEntry(Move.PSYBEAM, 17),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 20),
                        new MoveLearnSetEntry(Move.HEX, 24),
                        new MoveLearnSetEntry(Move.AMNESIA, 27),
                        new MoveLearnSetEntry(Move.SWIFT, 31),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 33),
                        new MoveLearnSetEntry(Move.PSYCHIC, 42),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 46),
                        new MoveLearnSetEntry(Move.INFERNO, 53),
                        new MoveLearnSetEntry(Move.ROLLOUT, 57),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, 64),
                        new MoveLearnSetEntry(Move.ERUPTION, 68),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.COVET, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.OVERHEAT, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_STEP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLAST_BURN, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BURN_UP, "tutor"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.COVET, "tutor"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.CURSE, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, "tutor"),
                        new MoveLearnSetEntry(Move.DETECT, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EMBER, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ERUPTION, "tutor"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.FLAME_BURST, "tutor"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tutor"),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL, "tutor"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, "tutor"),
                        new MoveLearnSetEntry(Move.FORESIGHT, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, "tutor"),
                        new MoveLearnSetEntry(Move.HEADBUTT, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HOWL, "tutor"),
                        new MoveLearnSetEntry(Move.INCINERATE, "tutor"),
                        new MoveLearnSetEntry(Move.INFERNO, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, "tutor"),
                        new MoveLearnSetEntry(Move.LEER, "tutor"),
                        new MoveLearnSetEntry(Move.MIMIC, "tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.OVERHEAT, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.REVERSAL, "tutor"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBMISSION, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TACKLE, "tutor"),
                        new MoveLearnSetEntry(Move.THRASH, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),

                        new MoveLearnSetEntry(Move.COVET, "egg"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, "egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY, "egg"),
                        new MoveLearnSetEntry(Move.FLAME_BURST, "egg"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, "egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT, "egg"),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, "egg"),
                        new MoveLearnSetEntry(Move.HOWL, "egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.REVERSAL, "egg"),
                        new MoveLearnSetEntry(Move.THRASH, "egg")
                ),
                List.of(Label.GEN2,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 29, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Quilava");
        this.setPortraitXYZ(0,1.8,0);
    }
}
