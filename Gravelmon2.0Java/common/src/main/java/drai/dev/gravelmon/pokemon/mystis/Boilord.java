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
public class Boilord extends drai.dev.gravelmon.pokemon.Pokemon {
    public Boilord() {
        super("Boilord",
                Type.FIRE, Type.STEEL,
                new Stats(90,
                        125,
                        105,
                        90,
                        85,
                        40),
                List.of(Ability.FLAME_BODY,Ability.FLASH_FIRE), Ability.MAGIC_GUARD,
                18, 7484,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("Boilord are always burning internally, its flames reaching 3000 degrees celsius. Some work in tandem with Bubbeldam to create powerful brews."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.INCINERATE,10),
                        new MoveLearnSetEntry(Move.IRON_HEAD,22),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,24),
                        new MoveLearnSetEntry(Move.METAL_SOUND,30),
                        new MoveLearnSetEntry(Move.METAL_BURST,35),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,37),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,40),
                        new MoveLearnSetEntry(Move.OVERHEAT,43),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,52),
                        new MoveLearnSetEntry(Move.BURN_UP,55),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,57),
                        new MoveLearnSetEntry(Move.ERUPTION,60),
                        new MoveLearnSetEntry(Move.RAGING_FURY,65),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Boilord");

    }


}
