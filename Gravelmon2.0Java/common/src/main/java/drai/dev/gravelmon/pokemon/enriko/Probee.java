package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Probee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Probee() {
        super("Probee",
                Type.PSYCHIC, Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Each individual Probee is nearly identical. They have weak telepathic abilities, mostly used to communicate with eachother."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.REFLECT,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,4),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,8),
                        new MoveLearnSetEntry(Move.AGILITY,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.HYPNOSIS,20),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,24),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,28),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,32),
                        new MoveLearnSetEntry(Move.PSYCHIC,36),
                        new MoveLearnSetEntry(Move.AFTER_YOU,40),
                        new MoveLearnSetEntry(Move.CALM_MIND,44),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,48)
                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Probee");

    }


}
