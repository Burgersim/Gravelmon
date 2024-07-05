package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pestor extends drai.dev.data.pokemon.Pokemon {
    public Pestor() {
        super("Pestor",
                Type.DARK,
                new Stats(60,
                        50,
                        30,
                        40,
                        30,
                        70),
                List.of(Ability.PICKPOCKET), Ability.PRANKSTER,
                11, 12,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                56, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pestor are known for their pranks and traps. Quite often they'll play dead so when trainers go to help, they can ambush them and steal from their bags."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pestor");

    }


}
