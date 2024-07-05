package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class GreatBaggi extends drai.dev.data.pokemon.Pokemon {
    public GreatBaggi() {
        super("GreatBaggi",
                Type.ICE, Type.PSYCHIC,
                new Stats(82,
                        73,
                        71,
                        87,
                        65,
                        87),
                List.of(Ability.DREAMTRAP), Ability.DREAMTRAP,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Great Baggi are known to hunt in packs, having their underlings chase down their prey to dead ends. It spits a fluid which can put their prey and foes to sleep."),
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
           setLangFileName("Great Baggi");

    }


}
