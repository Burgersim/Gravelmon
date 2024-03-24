package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chislee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chislee() {
        super("Chislee",
                Type.FIGHTING,Type.FLYING,
                new Stats(65,
                        105,
                        80,
                        65,
                        120,
                        85),
                List.of(Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                    new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,8),
                        new MoveLearnSetEntry(Move.WORK_UP,12),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,15),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,17),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,20),
                        new MoveLearnSetEntry(Move.ROOST,24),
                        new MoveLearnSetEntry(Move.PLUCK,27),
                        new MoveLearnSetEntry(Move.SOLIDKICK,31),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,37),
                        new MoveLearnSetEntry(Move.DETECT,41),
                        new MoveLearnSetEntry(Move.ENDEAVOR,45),
                        new MoveLearnSetEntry(Move.BULK_UP,51),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,58),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,62)     ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}