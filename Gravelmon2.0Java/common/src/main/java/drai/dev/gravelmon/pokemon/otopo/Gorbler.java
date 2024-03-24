package drai.dev.gravelmon.pokemon.otopo;

public class Gorbler extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gorbler() {
        super("Gorbler",
                Type.GROUND,
                new Stats(61,
                        52,
                        52,
                        45,
                        45,
                        65),
                List.of(Ability.SAND_RUSH,Ability.SAND_FORCE), Ability.MOLD_BREAKER,
                12, 120,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                125, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MINERAL),
                List.of("As it burrows underground, it forms a network of tunnels. Durtworm's eyesight is severely impaired as a result of living in such a dark environment, but its sense of smell is enhanced. It can detect food from a distance of 100 metres."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,3),
                        new MoveLearnSetEntry(Move.PURSUIT,6),
                        new MoveLearnSetEntry(Move.SCREECH,9),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,15),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.DRILL_RUN,22),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.COIL,26),
                        new MoveLearnSetEntry(Move.DIG,28),
                        new MoveLearnSetEntry(Move.FLAIL,30),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,32),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,34),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,38),
                        new MoveLearnSetEntry(Move.SANDSTORM,40)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gorbler");

    }


}