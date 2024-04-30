package drai.dev.gravelmon.pokemon.nodorro.regional;


import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Oddish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Oddish(int dex) {
        super(dex, "Oddish",
                Type.GRASS, Type.POISON,
                new Stats(55,
                        50,
                        55,
                        75,
                        65,
                        30),
                List.of(Ability.CHLOROPHYLL), Ability.RUN_AWAY,
                6, 24,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- AbsorbSTAB Grass - Growth Normal 5 Sweet Scent Normal 9 AcidSTAB Poison 13 Poison Powder Poison 14 Stun Spore Grass 15 Sleep Powder Grass 19 Mega DrainSTAB Grass 23 Lucky Chant Normal 27 Moonlight Fairy 31 Giga DrainSTAB Grass 35 Toxic Poison 39 Natural Gift Normal 43 Moonblast Fairy 47 Grassy Terrain Grass 52 Petal DanceSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,5),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.POISON_POWDER,13),
                        new MoveLearnSetEntry(Move.STUN_SPORE,14),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,15),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,19),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,23),
                        new MoveLearnSetEntry(Move.MOONLIGHT,27),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,31),
                        new MoveLearnSetEntry(Move.TOXIC,35),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,39),
                        new MoveLearnSetEntry(Move.MOONBLAST,43),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,47),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,52)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Oddish");

    }


}