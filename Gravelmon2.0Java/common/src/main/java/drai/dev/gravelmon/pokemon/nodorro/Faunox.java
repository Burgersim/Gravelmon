package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Faunox extends drai.dev.gravelmon.pokemon.Pokemon {
    public Faunox() {
        super("Faunox",
                Type.GRASS,
                new Stats(50,
                        64,
                        57,
                        47,
                        50,
                        42),
                List.of(Ability.OVERGROW), Ability.OVERGROW,
                4, 118,
                new Stats(0,1,0,0,0,0), 35,
                0.5,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Faunox spend most of their day grazing in the field. They eat half their body weight a day and absorb the nutrients from the greenery which result in them growing stronger."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.LEECH_SEED,8),
                        new MoveLearnSetEntry(Move.GROWTH,11),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.SWAGGER,22),
                        new MoveLearnSetEntry(Move.BULLDOZE,25),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,29),
                        new MoveLearnSetEntry(Move.BULK_UP,33),
                        new MoveLearnSetEntry(Move.HORN_LEECH,40),
                        new MoveLearnSetEntry(Move.BODY_SLAM,43),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,48)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Faunox");

    }


}
