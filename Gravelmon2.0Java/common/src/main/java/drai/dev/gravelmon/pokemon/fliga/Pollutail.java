package drai.dev.gravelmon.pokemon.fliga;

public class Pollutail extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pollutail() {
        super("Pollutail",
                Type.POISON,
                new Stats(50,
                        35,
                        40,
                        45,
                        65,
                        55),
                List.of(Ability.DRY_SKIN), Ability.LIQUID_OOZE,
                6, 0,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of("- Pound Normal - Smokescreen Normal 5 Aqua Slap Water 8 Poison Gas Poison 10 SludgeSTAB Poison 12 Aqua Ring Water 17 Acid SpraySTAB Poison 20 U-turn Bug 25 Toxic Poison 28 Muddy Water Water 33 Sludge WaveSTAB Poison 36 Coil Poison 41 BelchSTAB Poison 44 Wring Out Normal 49 Gunk ShotSTAB Poison 53 Jaw Lock Dark"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.AQUASLAP,5),
                        new MoveLearnSetEntry(Move.POISON_GAS,8),
                        new MoveLearnSetEntry(Move.SLUDGE,10),
                        new MoveLearnSetEntry(Move.AQUA_RING,12),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,17),
                        new MoveLearnSetEntry(Move.UTURN,20),
                        new MoveLearnSetEntry(Move.TOXIC,25),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,28),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,33),
                        new MoveLearnSetEntry(Move.COIL,36),
                        new MoveLearnSetEntry(Move.BELCH,41),
                        new MoveLearnSetEntry(Move.WRING_OUT,44),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,49),
                        new MoveLearnSetEntry(Move.JAW_LOCK,53),
                        new MoveLearnSetEntry(Move.SMOG,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pollutail");

    }


}
