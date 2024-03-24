package drai.dev.gravelmon.pokemon.kuria;

public class Terrevour extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terrevour() {
        super("Terrevour",
                Type.GROUND,Type.DARK,
                new Stats(85,
                        115,
                        70,
                        80,
                        70,
                        90),
                List.of(Ability.SAND_FORCE), Ability.STRONG_JAW,
                18, 781,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Terrevour will attempt to devour any Pokémon, being able to even bite through Aggron's steel. Old tyrants would feed Pokémon who failed in battle to their Terrevour."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Terrevour");

    }


}
