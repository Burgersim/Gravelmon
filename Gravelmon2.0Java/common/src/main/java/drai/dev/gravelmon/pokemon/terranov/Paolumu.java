package drai.dev.gravelmon.pokemon.terranov;

public class Paolumu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Paolumu() {
        super("Paolumu",
                Type.FLYING,Type.FAIRY,
                new Stats(100,
                        75,
                        50,
                        95,
                        95,
                        70),
                List.of(Ability.OVERCOAT), Ability.OVERCOAT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Paolumu");

    }


}
