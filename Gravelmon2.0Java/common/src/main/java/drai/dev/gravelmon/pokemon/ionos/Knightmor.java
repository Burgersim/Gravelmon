package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Knightmor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Knightmor() {
        super("Knightmor",
                Type.GHOST, Type.STEEL,
                new Stats(80,
                        109,
                        100,
                        70,
                        130,
                        60),
                List.of(Ability.IRON_FIST), Ability.MIRROR_ARMOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The body of Knightmor is nothing more than a vessel, a home for a wandering spirit; lost in time, lost at war. It is believed that this armor once belonged to a Pokémon over 3,000 years ago. The armature itself may be found in armories inside great castles. Examples are extremely rare however and a matching set is nearly impossible to find."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Knightmor");

    }


}
