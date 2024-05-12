package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Phanchasm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Phanchasm() {
        super("Phanchasm",
                Type.GHOST, Type.GROUND,
                new Stats(80,
                        120,
                        40,
                        40,
                        100,
                        90),
                List.of(Ability.SUPER_LUCK), Ability.TOUGH_CLAWS,
                15, 120,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                179, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FIELD),
                List.of("Their trickster nature can sometimes be difficult to work with, but their excellent sense of smell and massive digging claws have made them perfect companions for miners in search of gold."),
                List.of(),
                List.of(                  new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.BONE_CLUB,13),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,20),
                        new MoveLearnSetEntry(Move.CURSE,24),
                        new MoveLearnSetEntry(Move.BONE_RUSH,27),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,31),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,35),
                        new MoveLearnSetEntry(Move.FLING,39),
                        new MoveLearnSetEntry(Move.BONEMERANG,43),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,47),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,51)              ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 27, 44, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Phanchasm");

    }


}
