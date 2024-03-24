package drai.dev.gravelmon.pokemon.nodorro;

public class Frauster extends drai.dev.gravelmon.pokemon.Pokemon {
    public Frauster() {
        super("Frauster",
                Type.ICE,Type.DARK,
                new Stats(100,
                        129,
                        92,
                        70,
                        79,
                        60),
                List.of(Ability.SNOW_WARNING,Ability.INTIMIDATE), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
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
           setLangFileName("Frauster");

    }


}
