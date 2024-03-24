package drai.dev.gravelmon.pokemon.nodorro;

public class Rostone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rostone() {
        super("Rostone",
                Type.ROCK,
                new Stats(50,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.STURDY,Ability.SOLID_ROCK), Ability.CLEAR_BODY,
                6, 560,
                new Stats(1,0,0,0,0,0), 155,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
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
           setLangFileName("Rostone");

    }


}
