package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Dunewyrm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dunewyrm() {
        super("Dunewyrm",
                Type.GROUND, Type.DRAGON,
                new Stats(87,
                        88,
                        67,
                        55,
                        66,
                        77),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                26, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.RAGE,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,11),
                        new MoveLearnSetEntry(Move.BIDE,16),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,20),
                        new MoveLearnSetEntry(Move.BONE_CLUB,26),
                        new MoveLearnSetEntry(Move.SANDSTORM,30),
                        new MoveLearnSetEntry(Move.BONE_RUSH,36),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,40),
                        new MoveLearnSetEntry(Move.TAUNT,46),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,62)                   ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 54, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dunewyrm");

    }


}
