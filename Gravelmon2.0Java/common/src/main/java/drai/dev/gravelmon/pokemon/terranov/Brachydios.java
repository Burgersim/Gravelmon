package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Brachydios extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brachydios() {
        super("Brachydios",
                Type.FIGHTING,
                new Stats(102,
                        128,
                        110,
                        65,
                        55,
                        90),
                List.of(Ability.AFTERMATH), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Brute wyverns coated with an explosive green substance. The material is thought to be a unique myxomycete--or slime mold--that is primed to explode by the Brachydios's own saliva."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brachydios");

    }


}
