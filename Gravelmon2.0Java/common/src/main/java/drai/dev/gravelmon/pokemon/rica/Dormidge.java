package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dormidge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dormidge() {
        super("Dormidge",
                Type.BUG,Type.WATER,
                new Stats(50,
                        40,
                        60,
                        40,
                        45,
                        30),
                List.of(Ability.SWARM), Ability.ADAPTABILITY,
                4, 165,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                93, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Dormidge has a hard body that protects it from attacks as it awaits evolution. It can wriggle its tail to attempt an escape."),
                List.of(new EvolutionEntry("chirmidge", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,12),
                        new MoveLearnSetEntry(Move.ENDURE,20),
                        new MoveLearnSetEntry(Move.MUD_BOMB,25),
                        new MoveLearnSetEntry(Move.STICKY_WEB,30),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 10, 21, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
