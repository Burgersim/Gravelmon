package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Reavair extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reavair() {
        super("Reavair",
                Type.DARK, Type.FLYING,
                new Stats(55,
                        65,
                        32,
                        55,
                        34,
                        82),
                List.of(Ability.INSOMNIA), Ability.KEEN_EYE,
                6, 25,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("It flutters around, emitting ultrasonic waves in quest of its prey - bug type Pokemon. These ultrasonic waves are great at highlighting the glint of metal."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.ASTONISH,5),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,7),
                        new MoveLearnSetEntry(Move.POISON_FANG,10),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,15),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,17),
                        new MoveLearnSetEntry(Move.DETECT,20),
                        new MoveLearnSetEntry(Move.TAUNT,22),
                        new MoveLearnSetEntry(Move.AIR_SLASH,25),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,35),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,40),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,45)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Reavair");

    }


}
