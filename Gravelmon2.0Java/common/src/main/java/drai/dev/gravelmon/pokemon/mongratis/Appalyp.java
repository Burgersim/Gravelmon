package drai.dev.gravelmon.pokemon.mongratis;

public class Appalyp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Appalyp() {
        super("Appalyp",
                Type.DARK,Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Appalyp bullies other sea creatures into giving it food by threatening to show them its face. However, no one has actually seen what its face looks like."),
                List.of(),
                List.of(                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Appalyp");

    }


}
