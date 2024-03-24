package drai.dev.gravelmon.pokemon.fliga;

public class Obsidious extends drai.dev.gravelmon.pokemon.Pokemon {
    public Obsidious() {
        super("Obsidious",
                Type.FIRE,Type.ROCK,
                new Stats(110,
                        60,
                        135,
                        90,
                        105,
                        35),
                List.of(Ability.BLAZE), Ability.EARTH_EATER,
                27, 2826,
                new Stats(0,0,3,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("Obsidious are unpleasant to be around, often rampaging and spewing magma wildly. They can be uncharacteristically jolly when fully fed, making scientists hypothesize that its constant flailing is due to its overwhelming hunger."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.INCINERATE,12),
                        new MoveLearnSetEntry(Move.REFRESH,16),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,22),
                        new MoveLearnSetEntry(Move.RECYCLE,25),
                        new MoveLearnSetEntry(Move.FLAME_BURST,27),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,34),
                        new MoveLearnSetEntry(Move.STUFF_CHEEKS,36),
                        new MoveLearnSetEntry(Move.BURN_UP,41),
                        new MoveLearnSetEntry(Move.RECOVER,43),
                        new MoveLearnSetEntry(Move.BODY_PRESS,48),
                        new MoveLearnSetEntry(Move.EARTH_POWER,50),
                        new MoveLearnSetEntry(Move.ERUPTION,55)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Obsidious");

    }


}
