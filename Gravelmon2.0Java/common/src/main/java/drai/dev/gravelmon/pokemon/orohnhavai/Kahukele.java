package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Kahukele extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kahukele() {
        super("Kahukele",
                Type.GHOST,Type.FIGHTING,
                new Stats(65,
                        110,
                        100,
                        90,
                        50,
                        80),
                List.of(Ability.INSOMNIA,Ability.UNAWARE,Ability.SHADOW_TAG), Ability.SHADOW_TAG,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kahukel'e acts as the chief of their group. There are usually up to three chief Kahukel'e per marching group. Kahukel'e are skilled fighters. They are able to detach their arms and use them as a weapon. On rare occasions, they are seen marching along certain paths, walking along until reaching a sacred site. If a person makes eye contact with them, they will get cursed with bad luck."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kahukel-e");

    }


}