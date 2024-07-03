package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Bremand extends Pokemon {
    public Bremand() {
        super("Bremand",
                Type.GHOST, Type.SOUND,
                new Stats(80, 80,80,80,80,80),
                List.of(Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                5, 59,
                new Stats(1,0,0,0,0,1), 200,
                0.5,
                146, ExperienceGroup.SLOW,
                70,
                32, List.of(EggGroup.UNDISCOVERED),
                List.of("It is said this Pokemon represents the soul of music. It has full control over its voice so that it can adapt to any kind of song."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.ASTONISH,5),
                        new MoveLearnSetEntry(Move.SING,10),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,15),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,20),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.UPROAR,30),
                        new MoveLearnSetEntry(Move.HELPING_HAND,35),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,40),
                        new MoveLearnSetEntry(Move.DISCO_FEVER,45),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,50),
                        new MoveLearnSetEntry(Move.BOOMBURST,55),
                        new MoveLearnSetEntry(Move.WILD_DANCE,60),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.PERISH_SONG,"egg"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                        new MoveLearnSetEntry(Move.CHEERING,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 21, 39, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of(new PokemonForm(
                        "Guitarist", false,
                        Type.ELECTRIC, Type.SOUND,
                        new Stats(60, 60,80,100,80,100),
                        List.of(Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                        5, 59,
                        new Stats(1,0,0,0,0,1), 200,
                        0.5,
                        146, ExperienceGroup.SLOW,
                        70,
                        32, List.of(EggGroup.UNDISCOVERED),
                        List.of(),
                        List.of("It is said this Pokemon represents the soul of music. The electrifying solos it plays with its big whiskers will make your hair stand on end."),
                        List.of(),
                        List.of(
                                new MoveLearnSetEntry(Move.GROWL,1),
                                new MoveLearnSetEntry(Move.POUND,1),
                                new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                                new MoveLearnSetEntry(Move.SING,10),
                                new MoveLearnSetEntry(Move.THUNDER_WAVE,15),
                                new MoveLearnSetEntry(Move.CHARGE_BEAM,20),
                                new MoveLearnSetEntry(Move.SCREECH,25),
                                new MoveLearnSetEntry(Move.UPROAR,30),
                                new MoveLearnSetEntry(Move.HELPING_HAND,35),
                                new MoveLearnSetEntry(Move.OVERDRIVE,40),
                                new MoveLearnSetEntry(Move.ELECTRO_SWING,45),
                                new MoveLearnSetEntry(Move.THUNDERBOLT,50),
                                new MoveLearnSetEntry(Move.BOOMBURST,55),
                                new MoveLearnSetEntry(Move.WILD_DANCE,60),
                                new MoveLearnSetEntry(Move.ROAR,"tm"),
                                new MoveLearnSetEntry(Move.TOXIC,"tm"),
                                new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                                new MoveLearnSetEntry(Move.TAUNT,"tm"),
                                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                                new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                                new MoveLearnSetEntry(Move.RETURN,"tm"),
                                new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                                new MoveLearnSetEntry(Move.REST,"tm"),
                                new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                                new MoveLearnSetEntry(Move.ROUND,"tm"),
                                new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                                new MoveLearnSetEntry(Move.FLING,"tm"),
                                new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                                new MoveLearnSetEntry(Move.PERISH_SONG,"egg"),
                                new MoveLearnSetEntry(Move.HEALING_WISH,"egg"),
                                new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                                new MoveLearnSetEntry(Move.LUCKY_CHANT,"egg"),
                                new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                                new MoveLearnSetEntry(Move.CHEERING,"tutor"),
                                new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                                new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                                new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                                new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                                new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                                new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                                new MoveLearnSetEntry(Move.SNORE,"tutor"),
                                new MoveLearnSetEntry(Move.SOUND_BARRIER,"tutor"),
                                new MoveLearnSetEntry(Move.UPROAR,"tutor")
                                ),
                        List.of(Label.XENOVERSE),
                        0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 21, 39, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                        List.of(SpawnPreset.NATURAL),
                        0.3, 0.3
                ),new PokemonForm(
                                "Drummer", false,
                                Type.FIGHTING, Type.SOUND,
                                new Stats(100, 100,80,80,60,60),
                                List.of(Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                                5, 59,
                                new Stats(1,0,0,0,0,1), 200,
                                0.5,
                                146, ExperienceGroup.SLOW,
                                70,
                                32, List.of(EggGroup.UNDISCOVERED),
                                List.of(),
                                List.of("It is said this Pokemon represents the soul of music. Thumping its chest with two drumsticks, it boost the morale to anyone who's listening."),
                                List.of(),
                                List.of(
                                        new MoveLearnSetEntry(Move.GROWL,1),
                                        new MoveLearnSetEntry(Move.POUND,1),
                                        new MoveLearnSetEntry(Move.ROCK_SMASH,5),
                                        new MoveLearnSetEntry(Move.SING,10),
                                        new MoveLearnSetEntry(Move.BULK_UP,15),
                                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,20),
                                        new MoveLearnSetEntry(Move.SCREECH,25),
                                        new MoveLearnSetEntry(Move.UPROAR,30),
                                        new MoveLearnSetEntry(Move.HELPING_HAND,35),
                                        new MoveLearnSetEntry(Move.VITAL_THROW,40),
                                        new MoveLearnSetEntry(Move.BELLY_DRUM,45),
                                        new MoveLearnSetEntry(Move.HAMMER_ARM,50),
                                        new MoveLearnSetEntry(Move.BOOMBURST,55),
                                        new MoveLearnSetEntry(Move.WILD_DANCE,60),
                                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                                        new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                                        new MoveLearnSetEntry(Move.REST,"tm"),
                                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                                        new MoveLearnSetEntry(Move.FLING,"tm"),
                                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                                        new MoveLearnSetEntry(Move.PERISH_SONG,"egg"),
                                        new MoveLearnSetEntry(Move.HEALING_WISH,"egg"),
                                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"egg"),
                                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                                        new MoveLearnSetEntry(Move.CHEERING,"tutor"),
                                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                                        new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tutor"),
                                        new MoveLearnSetEntry(Move.UPROAR,"tutor")
                                ),
                                List.of(Label.XENOVERSE),
                                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 21, 39, 4.0, List.of(
                                new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO)),
                                new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                                new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                        ), List.of(),
                                List.of(SpawnPreset.NATURAL),
                                0.3, 0.3
                        ),new PokemonForm(
                        "Bassist", false,
                        Type.DARK, Type.SOUND,
                        new Stats(100, 100,80,80,60,60),
                        List.of(Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                        5, 59,
                        new Stats(1,0,0,0,0,1), 200,
                        0.5,
                        146, ExperienceGroup.SLOW,
                        70,
                        32, List.of(EggGroup.UNDISCOVERED),
                        List.of(),
                        List.of("It is said this Pokemon represents the soul of music. It quietly strims its tail, but occasionally it can play unexpectedly energetic grooves."),
                        List.of(),
                        List.of(
                                new MoveLearnSetEntry(Move.GROWL,1),
                                new MoveLearnSetEntry(Move.POUND,1),
                                new MoveLearnSetEntry(Move.PURSUIT,5),
                                new MoveLearnSetEntry(Move.SING,10),
                                new MoveLearnSetEntry(Move.TORMENT,15),
                                new MoveLearnSetEntry(Move.ASSURANCE,20),
                                new MoveLearnSetEntry(Move.SCREECH,25),
                                new MoveLearnSetEntry(Move.UPROAR,30),
                                new MoveLearnSetEntry(Move.HELPING_HAND,35),
                                new MoveLearnSetEntry(Move.CRUNCH,40),
                                new MoveLearnSetEntry(Move.BLUE_NOTE,45),
                                new MoveLearnSetEntry(Move.FOUL_PLAY,50),
                                new MoveLearnSetEntry(Move.BOOMBURST,55),
                                new MoveLearnSetEntry(Move.WILD_DANCE,60),
                                new MoveLearnSetEntry(Move.ROAR,"tm"),
                                new MoveLearnSetEntry(Move.TOXIC,"tm"),
                                new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                                new MoveLearnSetEntry(Move.TAUNT,"tm"),
                                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                                new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                                new MoveLearnSetEntry(Move.RETURN,"tm"),
                                new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                                new MoveLearnSetEntry(Move.REST,"tm"),
                                new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                                new MoveLearnSetEntry(Move.ROUND,"tm"),
                                new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                                new MoveLearnSetEntry(Move.FLING,"tm"),
                                new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                                new MoveLearnSetEntry(Move.PERISH_SONG,"egg"),
                                new MoveLearnSetEntry(Move.HEALING_WISH,"egg"),
                                new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                                new MoveLearnSetEntry(Move.LUCKY_CHANT,"egg"),
                                new MoveLearnSetEntry(Move.LAST_RESORT,"egg"),
                                new MoveLearnSetEntry(Move.CHEERING,"tutor"),
                                new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                                new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                                new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                                new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                                new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                                new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                                new MoveLearnSetEntry(Move.SNORE,"tutor"),
                                new MoveLearnSetEntry(Move.SOUND_BARRIER,"tutor"),
                                new MoveLearnSetEntry(Move.UPROAR,"tutor")
                        ),
                        List.of(Label.XENOVERSE),
                        0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 21, 39, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                        List.of(SpawnPreset.NATURAL),
                        0.3, 0.3
                )));
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
