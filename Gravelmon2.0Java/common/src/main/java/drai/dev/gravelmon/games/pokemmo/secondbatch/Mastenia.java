package drai.dev.gravelmon.games.pokemmo.secondbatch;


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
public class Mastenia extends drai.dev.gravelmon.games.registry.Game {
    public Mastenia() {
        super("Mastenia");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new Kididna());   Missing Stats
//        pokemon.add(new Hididna());   Missing Stats
        pokemon.add(new Wreckidna());
//        pokemon.add(new 863404());   Missing Stats
//        pokemon.add(new Platysus());   Missing Stats
        pokemon.add(new Searopod());
//        pokemon.add(new Bwibble());   Missing Stats
//        pokemon.add(new Sailizard());   Missing Stats
        pokemon.add(new Dracurrent());
//        pokemon.add(new Bulbasaur(1));   Missing Stats
//        pokemon.add(new Ivysaur(2));   Missing Stats
        pokemon.add(new Cereusaur());
        pokemon.add(new Charmander(4));
        pokemon.add(new Charmeleon(5));
        pokemon.add(new Savazard());
//        pokemon.add(new Squirtle(7));   Missing Stats
//        pokemon.add(new Wartortle(8));   Missing Stats
        pokemon.add(new Boltoise());
//        pokemon.add(new Treecko(252));   Missing Stats
//        pokemon.add(new Grovyle(253));   Missing Art
        pokemon.add(new Deceptile());
//        pokemon.add(new Torchic(255));   Missing Stats
//        pokemon.add(new Combusken(256));   Missing Art
        pokemon.add(new Henquinn());
//        pokemon.add(new Mudkip(258));   Missing Stats
//        pokemon.add(new Chromerge());   Missing Stats
//        pokemon.add(new Coathief());   Missing Stats
//        pokemon.add(new Devidare());   Missing Stats
//        pokemon.add(new Rochpillar());   Missing Stats
//        pokemon.add(new Roccoon());   Missing Stats
//        pokemon.add(new Papilitite());   Missing Stats
//        pokemon.add(new Burblu());   Missing Stats
//        pokemon.add(new Crestrike());   Missing Stats
//        pokemon.add(new Faewren());   Missing Stats
//        pokemon.add(new Psychu());   Missing Stats
//        pokemon.add(new Bombat());   Missing Stats
//        pokemon.add(new Bombarbat());   Missing Stats
//        pokemon.add(new Worrish());   Missing Stats
//        pokemon.add(new Tuleep());   Missing Stats
//        pokemon.add(new Ceremonia());   Missing Stats
//        pokemon.add(new Terrainiac());   Missing Stats
//        pokemon.add(new Wooper(194));   Missing Stats
//        pokemon.add(new Quagfire());   Missing Stats
//        pokemon.add(new Illumise(314));   Missing Art
//        pokemon.add(new Volbeat(313));   Missing Stats
//        pokemon.add(new Tasmeanie());   Missing Stats
//        pokemon.add(new Tasmighty());   Missing Stats
//        pokemon.add(new Sparkatoo());   Missing Stats
//        pokemon.add(new Kiwee());   Missing Stats
//        pokemon.add(new Kookabrra());   Missing Art
//        pokemon.add(new Didoge());   Missing Stats
//        pokemon.add(new Dingdog());   Missing Stats
//        pokemon.add(new Curseed());   Missing Stats
//        pokemon.add(new Tauntrunk());   Missing Stats
//        pokemon.add(new Grumfish());   Missing Stats
//        pokemon.add(new Crocoshy());   Missing Stats
//        pokemon.add(new Savagnile());   Missing Stats
//        pokemon.add(new Macrabi());   Missing Stats
        pokemon.add(new Crabutan());
//        pokemon.add(new Elefleur());   Missing Stats
//        pokemon.add(new Elefret());   Missing Stats
        pokemon.add(new Bubbit());
//        pokemon.add(new Bunomi());   Missing Stats
//        pokemon.add(new Bunelania());   Missing Stats
//        pokemon.add(new Luvdisc(370));   Missing Stats
//        pokemon.add(new Delfine());   Missing Stats
//        pokemon.add(new Tentacool(72));   Missing Stats
//        pokemon.add(new Tentarule());   Missing Stats
//        pokemon.add(new Gulligull());   Missing Stats
//        pokemon.add(new Albacross());   Missing Stats
//        pokemon.add(new Chinchou(170));   Missing Stats
//        pokemon.add(new Lanturn(171));   Missing Stats
        pokemon.add(new Abyssmulk());
//        pokemon.add(new 681177());   Missing Art
//        pokemon.add(new 845107());   Missing Art
//        pokemon.add(new Nonono());   Missing Stats
        pokemon.add(new Serpyre());
//        pokemon.add(new Tadit());   Missing Stats
        pokemon.add(new Adaptoad());
        pokemon.add(new Psyduck(54));
        pokemon.add(new Golduck(55));
//        pokemon.add(new Crudecay());   Missing Stats
//        pokemon.add(new Trancendo());   Missing Stats
//        pokemon.add(new Komala(775));   Missing Stats
//        pokemon.add(new Lizphard());   Missing Stats
//        pokemon.add(new Plasmuff());   Missing Stats
//        pokemon.add(new Phanpunk());   Missing Stats
//        pokemon.add(new Banshriek());   Missing Stats
//        pokemon.add(new Echoplasm());   Missing Stats
//        pokemon.add(new Leturte());   Missing Stats
//        pokemon.add(new Morturtle());   Missing Stats
//        pokemon.add(new Chickling());   Missing Stats
//        pokemon.add(new Strickhen());   Missing Stats
//        pokemon.add(new Kangaskid());   Missing Art
//        pokemon.add(new Kangaskhan(115));   Missing Art
        pokemon.add(new Kingaskhan());
//        pokemon.add(new Boltbat());   Missing Stats
//        pokemon.add(new Shroomish(285));   Missing Stats
//        pokemon.add(new Breloom(286));   Missing Stats
//        pokemon.add(new Roladuck());   Missing Stats
//        pokemon.add(new 199838());   Missing Stats
//        pokemon.add(new 648530());   Missing Stats
//        pokemon.add(new Magneflite());   Missing Stats
//        pokemon.add(new Magnozone());   Missing Stats
        pokemon.add(new Larvicous());
        pokemon.add(new Flyterror());
//        pokemon.add(new 807224());   Missing Art
//        pokemon.add(new 467710());   Missing Art
//        pokemon.add(new 564170());   Missing Art
//        pokemon.add(new 609968());   Missing Art
//        pokemon.add(new Mantism());   Missing Stats
//        pokemon.add(new 876833());   Missing Art
//        pokemon.add(new 16256());   Missing Art
//        pokemon.add(new 109527());   Missing Art
//        pokemon.add(new Larvresta());   Missing Stats
//        pokemon.add(new Lunamoth());   Missing Stats
//        pokemon.add(new Mothumbra());   Missing Stats
//        pokemon.add(new Heatant());   Missing Stats
//        pokemon.add(new Durmor());   Missing Stats
//        pokemon.add(new Beetleer());   Missing Stats
//        pokemon.add(new Cryscrawler());   Missing Stats
        pokemon.add(new Esmezra());
//        pokemon.add(new Gonut());   Missing Stats
//        pokemon.add(new Frygirr());   Missing Stats
        pokemon.add(new Yipbun());
//        pokemon.add(new Detome());   Missing Stats
        pokemon.add(new Rogbaahl());
//        pokemon.add(new 691895());   Missing Art
//        pokemon.add(new 84124());   Missing Art
//        pokemon.add(new Reabuto());   Missing Stats
//        pokemon.add(new Mawvile());   Missing Stats
//        pokemon.add(new Omanyte(138));   Missing Stats
//        pokemon.add(new Omastar(139));   Missing Stats
        pokemon.add(new Parasight());
//        pokemon.add(new Wakkabana());   Missing Stats
        pokemon.add(new Terrawr());
//        pokemon.add(new Scurple());   Missing Stats
        pokemon.add(new Scorperor());
//        pokemon.add(new Ogrean());   Missing Stats
//        pokemon.add(new Bebushi());   Missing Stats
//        pokemon.add(new Conferocious());   Missing Stats
        pokemon.add(new Hissmoke());
        pokemon.add(new Wulvlacine());
        pokemon.add(new Terratusk());
//        pokemon.add(new 707317());   Missing Stats
//        pokemon.add(new 778589());   Missing Art
        pokemon.add(new D33z());
//        pokemon.add(new Larvitar(246));   Missing Stats
//        pokemon.add(new Pupitar(247));   Missing Stats
        pokemon.add(new Tidaltar());
//        pokemon.add(new Palmguana());   Missing Stats
//        pokemon.add(new Ferocice());   Missing Stats
//        pokemon.add(new Turteller());   Missing Stats
//        pokemon.add(new Terrosect());   Missing Stats
        pokemon.add(new Resurexor());
        pokemon.add(new Obspeedian());
        pokemon.add(new Tecthanic());
        pokemon.add(new Paruwha());
//        pokemon.add(new Stunzeed());   Missing Art
    }

}
