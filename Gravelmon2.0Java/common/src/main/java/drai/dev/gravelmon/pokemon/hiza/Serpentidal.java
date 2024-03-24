package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Serpentidal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Serpentidal() {
        super("Serpentidal",
                Type.WATER,Type.DRAGON,
                new Stats(77,
                        85,
                        85,
                        107,
                        90,
                        86),
                List.of(Ability.TORRENT), Ability.WATER_ABSORB,
                19, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                231, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of("Not much is known about Serpentidal other than them showing on land during stormy nights. It is believed that they have total control of the waves crashing on the ocean."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,5),
                        new MoveLearnSetEntry(Move.TWISTER,10),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,15),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,20),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,25),
                        new MoveLearnSetEntry(Move.AGILITY,30),
                        new MoveLearnSetEntry(Move.WATER_PULSE,35),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,50),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,55)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SUBMERGED,  SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}