package drai.dev.gravelmon.pokemon.goetia;

public class Jawsome extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jawsome() {
        super("Jawsome",
                Type.WATER,
                new Stats(56,
                        92,
                        70,
                        78,
                        92,
                        57),
                List.of(Ability.STRONG_JAW), Ability.INTIMIDATE,
                0, 0,
                new Stats(0,1,0,0,1,0), 90,
                0.5,
                156, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Its strength lies in its jaws. It can retract its head inside its body to bite with its outer jaws."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATERFALL,1),
                        new MoveLearnSetEntry(Move.ICE_FANG,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1)                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jawsome");

    }


}
