package drai.dev.gravelmon.pokemon.dhiome;

public class Belyad extends drai.dev.gravelmon.pokemon.Pokemon {
    public Belyad() {
        super("Belyad",
                Type.GRASS,Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SERENE_GRACE), Ability.COMPETITIVE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's eerie, beautiful songs can be heard at the heart of old forests. They pose as trees near bodies of water so they can always see their reflection."),
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
           setLangFileName("Belyad");

    }


}
