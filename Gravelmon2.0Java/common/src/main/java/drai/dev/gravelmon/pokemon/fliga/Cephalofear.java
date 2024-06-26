package drai.dev.gravelmon.pokemon.fliga;


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
public class Cephalofear extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cephalofear() {
        super("Cephalofear",
                Type.PSYCHIC, Type.NORMAL,
                new Stats(74,
                        98,
                        63,
                        93,
                        93,
                        69),
                List.of(Ability.DAZZLING,Ability.STICKY_HOLD), Ability.MAGIC_GUARD,
                15, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Despite its far more intimidating appearance, Cephalofear are still quite shy, and prefer to hide their face (or what little remains to fit inside) within the small brown bag it has held onto. To scare away foes or hypnotize prey, it will flash multiple colors across its body, sending any who gaze upon it into a fugue state."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LUMINA_CRASH,45),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                new MoveLearnSetEntry(Move.GROWL,1),
                new MoveLearnSetEntry(Move.QUICK_ATTACK,4),
                new MoveLearnSetEntry(Move.FAKE_OUT,8),
                new MoveLearnSetEntry(Move.BITE,13),
                new MoveLearnSetEntry(Move.TEARFUL_LOOK,18),
                new MoveLearnSetEntry(Move.SUCKER_PUNCH,23),
                new MoveLearnSetEntry(Move.CURSE,27),
                new MoveLearnSetEntry(Move.TAIL_SLAP,32),
                new MoveLearnSetEntry(Move.PAIN_SPLIT,37),
                new MoveLearnSetEntry(Move.SUBSTITUTE,42),
                new MoveLearnSetEntry(Move.SCARY_FACE,46),
                new MoveLearnSetEntry(Move.HYPER_VOICE,51),
                new MoveLearnSetEntry(Move.LAST_RESORT,56),
                new MoveLearnSetEntry(Move.FINAL_GAMBIT,61)                ),
        List.of(Label.FLIGA),
                0, List.of(
        ), SpawnContext.GROUNDED, SpawnPool.RARE, 30, 53, .3, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
        ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cephalofear");

    }


}
