package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pesteeny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pesteeny() {
        super("Pesteeny",
                Type.DARK,
                new Stats(45,
                        25,
                        25,
                        15,
                        15,
                        50),
                List.of(Ability.SCHOOLING), Ability.SCHOOLING,
                2, 4,
                new Stats(0,0,0,0,0,1), 60,
                0.5,
                53, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pesteeny");

    }


}
