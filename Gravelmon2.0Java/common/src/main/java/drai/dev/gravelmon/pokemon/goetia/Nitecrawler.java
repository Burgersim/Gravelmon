package drai.dev.gravelmon.pokemon.goetia;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Nitecrawler extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nitecrawler() {
        super("Nitecrawler",
                Type.BUG,Type.GHOST,
                new Stats(70,
                        125,
                        65,
                        125,
                        95,
                        90),
                List.of(Ability.POWERLEECH), Ability.DARKHOLD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The grudges from countless bugs killed in hatred have coalesced into this pokemon. It rises during the full moon to take revenge, using its crawling tendrils to feed."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nitecrawler");

    }


}
