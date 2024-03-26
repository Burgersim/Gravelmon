package drai.dev.gravelmon.pokemon.mystis;


import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Escalaze extends drai.dev.gravelmon.pokemon.Pokemon {
    public Escalaze() {
        super("Escalaze",
                Type.STEEL,Type.FIGHTING,
                new Stats(80,
                        105,
                        130,
                        95,
                        65,
                        30),
                List.of(Ability.HEAVY_METAL,Ability.IRON_FIST), Ability.STEAM_ENGINE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                227, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Despite its bulky appearance, the vents on its back allow it to throw punches at a speed invisible to the naked eye."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CROSS_CHOP,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.REVENGE,1),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,1),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,1),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.KNOCKBACK,1),
                        new MoveLearnSetEntry(Move.SUBMISSION,1),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,1),
                        new MoveLearnSetEntry(Move.HAZE,1),
                        new MoveLearnSetEntry(Move.METAL_BURST,1),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.METAL_SOUND,1),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,1),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.REVERSAL,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,1),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,1),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,"tm"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.STUNJAB,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,"tm"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.POISON_GAS,"tm"),
                        new MoveLearnSetEntry(Move.STORM_THROW,"tm"),
                        new MoveLearnSetEntry(Move.WARDANCE,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Escalaze");

    }


}
