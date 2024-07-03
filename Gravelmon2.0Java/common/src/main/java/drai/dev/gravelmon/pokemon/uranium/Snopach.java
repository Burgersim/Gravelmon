package drai.dev.gravelmon.pokemon.uranium;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Snopach extends Pokemon {
    public Snopach() {
        super("Snopach",
                Type.ICE, Type.ROCK,
                new Stats(90,
                        80,
                        80,
                        50,
                        40,
                        50),
                List.of(Ability.SOLID_ROCK, Ability.SNOW_CLOAK), Ability.STURDY,
                9, 1405,
                new Stats(0,1,1,0,0,0), 90,
                0.875,
                78, ExperienceGroup.SLOW,
                70,
                48, List.of(EggGroup.MINERAL, EggGroup.FIELD),
                List.of("A Mon that roamed the tundra thousands of years ago. They used their small tusks to dig up berries and roots under the ice."),
                List.of(new EvolutionEntry("dermafrost", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"41")))),
                List.of(
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,6),
                        new MoveLearnSetEntry(Move.ICE_SHARD,10),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,15),
                        new MoveLearnSetEntry(Move.STOMP,19),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,24),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,28),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,33),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,37),
                        new MoveLearnSetEntry(Move.AVALANCHE,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"egg"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"egg"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"egg"),
                        new MoveLearnSetEntry(Move.GLACIATE,"egg")
                        ),
                List.of(Label.URANIUM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 8, 25, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.29, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
