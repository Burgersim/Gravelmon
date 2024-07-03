package drai.dev.gravelmon.pokemon.insurgence.delta;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class DeltaAurorus extends Pokemon {
    public DeltaAurorus(String name, Aspect aspect) {
        super(name, aspect,"DeltaAurorus",
                Type.GRASS, Type.WATER,
                new Stats(123, 77,72,99,92,58),
                List.of(Ability.FRIEND_GUARD), Ability.PHOTOTROPH,
                27, 2250,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                104, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("This Pokemon willingly offers rides to other Pokemon and ferries them to other islands. It can float in the ocean endlessly so long as the sun is shining."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SOAK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.MUDSLAP,13),
                        new MoveLearnSetEntry(Move.BODY_SLAM,15),
                        new MoveLearnSetEntry(Move.AQUA_RING,18),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,20),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,26),
                        new MoveLearnSetEntry(Move.MUD_BOMB,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,34),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,38),
                        new MoveLearnSetEntry(Move.NATURE_POWER,43),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,46),
                        new MoveLearnSetEntry(Move.RECOVER,50),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,56),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,63),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,74),
                        new MoveLearnSetEntry(Move.SOAK,77),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.PERMAFROST,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tutor"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor")
                        ),
                List.of(Label.GEN6,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 39, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.30, 0.3,
                List.of());
        this.setLangFileName("Aurorus");
        setCanSwim(true);
        setCanBreathUnderwater(true);
        this.setPortraitXYZ(0,1.8,0);
    }
}
