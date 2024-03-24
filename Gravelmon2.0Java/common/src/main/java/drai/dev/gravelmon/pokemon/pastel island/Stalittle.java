package drai.dev.gravelmon.pokemon.pastel island;

public class Stalittle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stalittle() {
        super("Stalittle",
                Type.ROCK,Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SOUNDPROOF), Ability.SOLID_ROCK,
                0, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Sturdy Pokémon that hide in caves full of mineral-rich water. The rocky spikes on their bodies are deposits of this water."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stalittle");

    }


}
