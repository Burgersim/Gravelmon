package drai.dev.gravelmon.pokemon.terranov;

public class Agnaktor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Agnaktor() {
        super("Agnaktor",
                Type.FIRE,Type.GROUND,
                new Stats(80,
                        78,
                        121,
                        131,
                        60,
                        80),
                List.of(Ability.MAGMA_ARMOR), Ability.MAGMA_ARMOR,
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
           setLangFileName("Agnaktor");

    }


}
