package drai.dev.gravelmon.pokemon.otopo;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Arbomoss extends drai.dev.gravelmon.pokemon.Pokemon {
    public Arbomoss() {
        super("Arbomoss",
                Type.GRASS,Type.NORMAL,
                new Stats(110,
                        65,
                        90,
                        65,
                        85,
                        25),
                List.of(Ability.CHLOROPHYLL), Ability.GRASS_PELT,
                0, 0,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                154, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("Arbomoss travels at a glacial pace, causing moss to grow on its back. This moss has medicinal and poisonous properties, making it a helpful Pokemon for herbalists."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_POWDER,1),
                        new MoveLearnSetEntry(Move.LEAFTURN,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,1),
                        new MoveLearnSetEntry(Move.VINESWING,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,1),
                        new MoveLearnSetEntry(Move.ENCORE,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.COUNTER,23),
                        new MoveLearnSetEntry(Move.FLAIL,26),
                        new MoveLearnSetEntry(Move.REST,28),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,30),
                        new MoveLearnSetEntry(Move.UPROAR,32),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,35),
                        new MoveLearnSetEntry(Move.ENDURE,37),
                        new MoveLearnSetEntry(Move.SLASH,40),
                        new MoveLearnSetEntry(Move.AMNESIA,42),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,45),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,47),
                        new MoveLearnSetEntry(Move.LEAF_STORM,53),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,57)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arbomoss");

    }


}
