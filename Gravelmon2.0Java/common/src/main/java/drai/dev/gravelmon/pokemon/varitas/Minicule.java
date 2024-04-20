package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Minicule extends drai.dev.gravelmon.pokemon.Pokemon {
    public Minicule() {
        super("Minicule",
                Type.ELECTRIC, Type.PSYCHIC,
                new Stats(60,
                        20,
                        50,
                        75,
                        80,
                        75),
                List.of(Ability.PLUS), Ability.MINUS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A strange pokemon that can freely alter its own size. They are extremely social with their own kind, almost as if drawn to each other by some unknown force."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,5),
                        new MoveLearnSetEntry(Move.PSYWAVE,7),
                        new MoveLearnSetEntry(Move.CHARGE,10),
                        new MoveLearnSetEntry(Move.ION_DELUGE,13),
                        new MoveLearnSetEntry(Move.GYRO_BALL,15),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,18),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,21),
                        new MoveLearnSetEntry(Move.GRAVITY,25),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,27),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,29),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,45),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,48)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Minicule");

    }


}
