package drai.dev.gravelmon.pokemon.mastenia;

public class Golduck extends drai.dev.gravelmon.pokemon.Pokemon {
    public Golduck() {
        super("Golduck",
                Type.POISON,Type.PSYCHIC,
                new Stats(80,
                        92,
                        82,
                        81,
                        90,
                        75),
                List.of(Ability.POISON_TOUCH,Ability.TELEPATHY), Ability.CONTAMINATE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Golduck");

    }


}