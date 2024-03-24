package drai.dev.gravelmon.pokemon.enjin;

public class Abysprit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Abysprit() {
        super("Abysprit",
                Type.DARK,
                new Stats(50,
                        45,
                        55,
                        65,
                        55,
                        80),
                List.of(Ability.UNNERVE), Ability.PRANKSTER,
                10, 55,
                new Stats(0,0,0,1,0,1), 190,
                0.5,
                72, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Added Nov 1 2021 Habitat: Urban, places with people. Places Darkrai hangs out."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,6),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,10),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,15),
                        new MoveLearnSetEntry(Move.NIGHTMARE,18),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,23),
                        new MoveLearnSetEntry(Move.HEX,26),
                        new MoveLearnSetEntry(Move.DREAM_EATER,31),
                        new MoveLearnSetEntry(Move.TAUNT,34),
                        new MoveLearnSetEntry(Move.COIL,37),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,42),
                        new MoveLearnSetEntry(Move.DARK_PULSE,45),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Abysprit");

    }


}