package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cockatoto extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cockatoto() {
        super("Cockatoto",
                Type.NORMAL,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.BIG_PECKS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("burmyatoto work in great numbers and are notrious to steal berries. When threatened, it mimics the foe in order to escape."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.DETECT,4),
                        new MoveLearnSetEntry(Move.MIMIC,8),
                        new MoveLearnSetEntry(Move.THIEF,12),
                        new MoveLearnSetEntry(Move.PLUCK,18),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,26),
                        new MoveLearnSetEntry(Move.CHATTER,30),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,36),
                        new MoveLearnSetEntry(Move.SNATCH,40),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,50)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cockatoto");

    }


}
