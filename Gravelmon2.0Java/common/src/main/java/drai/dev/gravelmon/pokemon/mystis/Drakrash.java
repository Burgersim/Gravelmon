package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Drakrash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drakrash() {
        super("Drakrash",
                Type.DRAGON,Type.DARK,
                new Stats(80,
                        105,
                        80,
                        105,
                        80,
                        85),
                List.of(Ability.OUTBURST,Ability.MOLD_BREAKER), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is found all over the region causing havoc, only going away once it considers its target destroyed. It breaks things down with its claws and drains energy with the spot at the tip of its tail."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,5),
                        new MoveLearnSetEntry(Move.SNARL,8),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,11),
                        new MoveLearnSetEntry(Move.THIEF,14),
                        new MoveLearnSetEntry(Move.ROAR,17),
                        new MoveLearnSetEntry(Move.DRAGONFANG,21),
                        new MoveLearnSetEntry(Move.INGRAIN,25),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,29),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,33),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,41),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,45),
                        new MoveLearnSetEntry(Move.DRAGON_ENERGY,50)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Drakrash");

    }


}
