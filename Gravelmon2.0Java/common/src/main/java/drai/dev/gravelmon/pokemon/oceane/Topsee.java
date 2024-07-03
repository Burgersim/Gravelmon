package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Topsee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Topsee() {
        super("Topsee",
                Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In the distant past, these Pokemon were a common source of light on the seafloor. They used their psychic abilities to hoodwink other Pokemon drawn to their light into protecting or ignoring them while they amble about."),
                List.of(new EvolutionEntry("hallucid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.GLOW_SIGNAL,1),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,1),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,1),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,1),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,1),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,1),
                        new MoveLearnSetEntry(Move.POWER_SWAP,1),
                        new MoveLearnSetEntry(Move.DARK_PULSE,1)
                ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Topsee");

    }


}
