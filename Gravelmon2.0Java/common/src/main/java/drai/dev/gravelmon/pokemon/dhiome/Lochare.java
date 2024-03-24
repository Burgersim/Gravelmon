package drai.dev.gravelmon.pokemon.dhiome;

public class Lochare extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lochare() {
        super("Lochare",
                Type.WATER,Type.FIGHTING,
                new Stats(95,
                        115,
                        70,
                        75,
                        95,
                        80),
                List.of(Ability.TORRENT), Ability.IRON_FIST,
                15, 727,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("With its massive strength it can change the course of a river. It often competes in wrestling matches with other Lochare to prove its might."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lochare");

    }


}
