package drai.dev.gravelmon.pokemon.nodorro;

public class Sylvotaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sylvotaur() {
        super("Sylvotaur",
                Type.GRASS,Type.FIGHTING,
                new Stats(85,
                        130,
                        120,
                        60,
                        75,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                20, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sylvotaur");

    }


}