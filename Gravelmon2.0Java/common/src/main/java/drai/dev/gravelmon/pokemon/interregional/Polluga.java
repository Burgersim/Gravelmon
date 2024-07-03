package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Polluga extends drai.dev.gravelmon.pokemon.Pokemon {
    public Polluga() {
        super("Polluga",
                Type.GROUND, Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 165,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("junkqual", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44")))),
                List.of(
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,4),
                        new MoveLearnSetEntry(Move.SLUDGE,9),
                        new MoveLearnSetEntry(Move.BIDE,13),
                        new MoveLearnSetEntry(Move.ROAR,18),
                        new MoveLearnSetEntry(Move.MUD_BOMB,23),
                        new MoveLearnSetEntry(Move.DIVE,27),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,33),
                        new MoveLearnSetEntry(Move.RECYCLE,37),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,43),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,48),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52),
                        new MoveLearnSetEntry(Move.EARTH_POWER,56),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,61)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Polluga");

    }


}
