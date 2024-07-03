package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Lunapup extends Pokemon {
    public Lunapup() {
        super("Lunapup",
                Type.GROUND, Type.FIGHTING,
                new Stats(50,
                        70,
                        40,
                        49,
                        40,
                        56),
                List.of(Ability.MOLD_BREAKER, Ability.GUTS), Ability.DEFIANT,
                6, 80,
                new Stats(0,1,0,0,0,0), 180,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.HUMAN_LIKE),
                List.of("Although small, it is very brave. it won't hesitate to protect weaker pokemon in danger. they can often be heard howling at the moon."),
                List.of(new EvolutionEntry("herolune", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.DUST_KICK,5),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,8),
                        new MoveLearnSetEntry(Move.HELPING_HAND,13),
                        new MoveLearnSetEntry(Move.BULLDOZE,15),
                        new MoveLearnSetEntry(Move.STORM_THROW,20),
                        new MoveLearnSetEntry(Move.DETECT,22),
                        new MoveLearnSetEntry(Move.BONE_RUSH,27),
                        new MoveLearnSetEntry(Move.MOONLIGHT,29),
                        new MoveLearnSetEntry(Move.DIG,34),
                        new MoveLearnSetEntry(Move.BULK_UP,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,41),
                        new MoveLearnSetEntry(Move.REVERSAL,43),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,48),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,50),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,55),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,57),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"egg"),
                        new MoveLearnSetEntry(Move.QUASH,"egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.FEINT,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"egg"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}