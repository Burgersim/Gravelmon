package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Conkeldurr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Conkeldurr() {
        super("Conkeldurr",
                Type.FIGHTING,
                new Stats(105,
                        140,
                        95,
                        55,
                        65,
                        45),
                List.of(Ability.GUTS,Ability.SHEER_FORCE), Ability.IRON_FIST,
                14, 870,
                new Stats(0,3,0,0,0,0), 45,
                0.75,
                227, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("It is thought that Conkeldurr taught humans how to make concrete more than 2,000 years ago."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,4),
                        new MoveLearnSetEntry(Move.BIDE,8),
                        new MoveLearnSetEntry(Move.LOW_KICK,12),
                        new MoveLearnSetEntry(Move.ROCK_THROW,16),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,20),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,24),
                        new MoveLearnSetEntry(Move.BULK_UP,29),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,33),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,37),
                        new MoveLearnSetEntry(Move.SCARY_FACE,41),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,45),
                        new MoveLearnSetEntry(Move.STONE_EDGE,49),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,53),
                        new MoveLearnSetEntry(Move.SUPERPOWER,57),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"tm"),
                        new MoveLearnSetEntry(Move.DETECT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,"tm"),
                        new MoveLearnSetEntry(Move.FORCE_PALM,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Conkeldurr");

    }


}
