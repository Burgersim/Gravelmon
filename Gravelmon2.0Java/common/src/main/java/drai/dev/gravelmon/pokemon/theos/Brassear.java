package drai.dev.gravelmon.pokemon.theos;

public class Brassear extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brassear() {
        super("Brassear",
                Type.FIRE,Type.STEEL,
                new Stats(100,
                        85,
                        125,
                        75,
                        85,
                        65),
                List.of(Ability.BLAZE), Ability.HEAVY_METAL,
                19, 8100,
                new Stats(0,0,3,0,0,0), 45,
                0.75,
                241, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Brassear's horns are extremely strong, capable of piercing massive boulders and lifting them with ease. When angry, their horns will light up and sizzle."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brassear");

    }


}
