package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class HoennianOnix extends Pokemon {
    public HoennianOnix(int dexNo) {
        super(dexNo,"HoennianOnix",
                Type.ROCK, Type.ICE,
                new Stats(55, 35, 60, 65, 150, 60),
                List.of(Ability.CRYSTAL_CASE), Ability.CRYSTAL_CASE,
                UnitConverter.feetToMeters(20, 4), UnitConverter.lbsToKg(3461),
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.MINERAL),
                List.of("There is a cave in a far-away region where this Pokemon is said to have originated from. They migrated to Hoenn when the waters in their homeland grew too warm."),
                List.of(new EvolutionEntry("chrysalix", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"48")))),
                List.of(
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,"egg"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,9),
                        new MoveLearnSetEntry(Move.ACCELEROCK,13),
                        new MoveLearnSetEntry(Move.HARDEN,21),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,25),
                        new MoveLearnSetEntry(Move.HAIL,33),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,37),
                        new MoveLearnSetEntry(Move.CRYSTALLIZE,40),
                        new MoveLearnSetEntry(Move.EARTH_POWER,46),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,57)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN1),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 14, 39, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of())),
                List.of(SpawnPreset.UNDERGROUND),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Onix");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
    }
}
