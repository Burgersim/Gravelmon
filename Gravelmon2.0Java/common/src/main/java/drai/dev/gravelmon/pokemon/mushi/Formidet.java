package drai.dev.gravelmon.pokemon.mushi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Formidet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Formidet() {
        super("Formidet",
                Type.FIRE,Type.BUG,
                new Stats(56,
                        65,
                        70,
                        90,
                        60,
                        70),
                List.of(Ability.BLAZE), Ability.FLASH_FIRE,
                0, 0,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Formidet");

    }


}
