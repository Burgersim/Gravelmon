package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Grimgarmr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grimgarmr() {
        super("Grimgarmr",
                Type.DARK,Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.INTIMIDATE,Ability.DARKHOLD,Ability.UNNERVE), Ability.UNNERVE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Due to its violent nature, Grimgarmr is often tied to a leash by its trainer. When it barks, it's a sign of dark events that are about to occur. Its bite is colder than death."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimgarmr");

    }


}