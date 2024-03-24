package drai.dev.gravelmon.pokemon.terranov;

public class Jagras extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jagras() {
        super("Jagras",
                Type.NORMAL,
                new Stats(75,
                        65,
                        55,
                        30,
                        60,
                        45),
                List.of(Ability.RUN_AWAY), Ability.IMMUNITY,
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
           setLangFileName("Jagras");

    }


}