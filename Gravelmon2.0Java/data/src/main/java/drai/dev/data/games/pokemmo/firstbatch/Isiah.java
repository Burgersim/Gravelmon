package drai.dev.data.games.pokemmo.firstbatch;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.atlas.Bosteroid;
import drai.dev.data.pokemon.atlas.Charnosaur;
import drai.dev.data.pokemon.atlas.Eldoredo;
import drai.dev.data.pokemon.atlas.Faram;
import drai.dev.data.pokemon.atlas.Froska;
import drai.dev.data.pokemon.atlas.Goatee;
import drai.dev.data.pokemon.atlas.Junkid;
import drai.dev.data.pokemon.atlas.Lizmoke;
import drai.dev.data.pokemon.atlas.Mafreozee;
import drai.dev.data.pokemon.atlas.Muscolin;
import drai.dev.data.pokemon.atlas.Nuggle;
import drai.dev.data.pokemon.atlas.Piragmid;
import drai.dev.data.pokemon.atlas.Tankyard;
import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.isiah.*;

import java.util.*;

public class Isiah extends drai.dev.data.games.registry.Game {
    public Isiah() {
        super("Isiah");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Inood());
        pokemon.add(new Shibark());
        pokemon.add(new Gardraog());
        pokemon.add(new Frilzard());
        pokemon.add(new Venomane());
        pokemon.add(new Membraze());
        pokemon.add(new Finvore());
        pokemon.add(new Bullark());
        pokemon.add(new Crushark());
        pokemon.add(new Caviat());
        pokemon.add(new Rodat());
        pokemon.add(new Maggotle());
        pokemon.add(new Rocurl());
        pokemon.add(new Beetil());
        pokemon.add(new Matrimite());
        pokemon.add(new Gremite());
        pokemon.add(new Militherm(new Stats(434, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK, StatType.ATTACK, StatType.SPEED))));
        pokemon.add(new Lightile());
        pokemon.add(new Voltako());
        pokemon.add(new Raigeko());
        pokemon.add(new Inbex());
        pokemon.add(new Titanbex());
        pokemon.add(new Liglit());
        pokemon.add(new Chickoo());
        pokemon.add(new Neskoo());
        pokemon.add(new Falkoo());
        pokemon.add(new Coccoala());
        pokemon.add(new Kitkin());
        pokemon.add(new Munchwin());
        pokemon.add(new Nemokat());
        pokemon.add(new Nettini());
        pokemon.add(new Oosail());
        pokemon.add(new Sagilin());
        pokemon.add(new Roadile());
        pokemon.add(new Tarvial());
        pokemon.add(new Cavorm());
        pokemon.add(new Lumbrig());
        pokemon.add(new Ampelly());
        pokemon.add(new Jelectric());
        pokemon.add(new Bovinda());
        pokemon.add(new Nirvache());
        pokemon.add(new Tabooves());
        pokemon.add(new Drizzlen());
        pokemon.add(new Cumucloud());
        pokemon.add(new Tulifun());
        pokemon.add(new Twoolepin());
        pokemon.add(new Terbipan());
        pokemon.add(new Scalfib());
        pokemon.add(new Lagostr());
        pokemon.add(new Goatee());
        pokemon.add(new Faram());
        pokemon.add(new Crapore());
        pokemon.add(new Sniponge());
        pokemon.add(new Peblock());
        pokemon.add(new Dugmite());
        pokemon.add(new Edjaw());
        pokemon.add(new Banshed());
        pokemon.add(new Maskape());
        pokemon.add(new Triboon());
        pokemon.add(new Neureka());
        pokemon.add(new Encefalug());
        pokemon.add(new Muscolin());
        pokemon.add(new Bosteroid());
        pokemon.add(new Batnap());
        pokemon.add(new Staracula());
        pokemon.add(new Uselake());
        pokemon.add(new Monartide());
        pokemon.add(new Cramic());
        pokemon.add(new Clamsure());
        pokemon.add(new Sweetweet());
        pokemon.add(new Paswan());
        pokemon.add(new Lampea());
        pokemon.add(new Bullama());
        pokemon.add(new Kelbanast());
        pokemon.add(new Tessent());
        pokemon.add(new Tessensei());
        pokemon.add(new Wastered());
        pokemon.add(new Hammeradio());
        pokemon.add(new Eice());
        pokemon.add(new Dreice());
        pokemon.add(new Icigloo());
        pokemon.add(new Wijin());
        pokemon.add(new Summojin());
        pokemon.add(new Raggal());
        pokemon.add(new Dollipop());
        pokemon.add(new Pompadame());
        pokemon.add(new Pelurche());
        pokemon.add(new Beargue());
        pokemon.add(new Urslash());
        pokemon.add(new Froska());
        pokemon.add(new Mafreozee());
        pokemon.add(new Ribone());
        pokemon.add(new Skelenid());
        pokemon.add(new Ugnulash());
        pokemon.add(new Nuspice());
        pokemon.add(new Pepprex());
        pokemon.add(new Anemulp());
        pokemon.add(new Illuquid());
        pokemon.add(new Crasquidor());

        pokemon.add(new Celluler());
        pokemon.add(new Paperlane());
        pokemon.add(new Himegami());
        pokemon.add(new Jawful());
        pokemon.add(new Opilape());
        pokemon.add(new Oragnutan());
        pokemon.add(new Possasse());
        pokemon.add(new Vasegeist());
        pokemon.add(new Slipole());
        pokemon.add(new Pengoof());
        pokemon.add(new Rolloch());
        pokemon.add(new Bouldart());
        pokemon.add(new Gyroar());
        pokemon.add(new Nuggle());
        pokemon.add(new Piragmid());
        pokemon.add(new Eldoredo());
        pokemon.add(new Crimera());
        pokemon.add(new Chiverna());
        pokemon.add(new Sellfish());
        pokemon.add(new Junkid());
        pokemon.add(new Tankyard());
        pokemon.add(new Narnail());
        pokemon.add(new Unirval(new Stats(474, StatArchetype.BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new Elekto());
        pokemon.add(new Ambrachios());
        pokemon.add(new Lizmoke());
        pokemon.add(new Charnosaur());
        pokemon.add(new Germinell());
        pokemon.add(new Hyriginell());
        pokemon.add(new Larvatt());
        pokemon.add(new Sparkroll());
        pokemon.add(new Megawatt());
        pokemon.add(new Fulolf());
        pokemon.add(new Teekaboo());
        pokemon.add(new Pendodoom());
        pokemon.add(new Piczarre());
        pokemon.add(new Dorimedon());
        pokemon.add(new Lapot());
        pokemon.add(new Simulogre());
        pokemon.add(new Falchik());
        pokemon.add(new Valkite());
        pokemon.add(new Calvakair());
        pokemon.add(new Cetoacean());
        pokemon.add(new Nicklack());
        pokemon.add(new Silvern());
        pokemon.add(new Avidrage());
        pokemon.add(new Valialty());
        pokemon.add(new Oweesage());
        pokemon.add(new Koslich());
        pokemon.add(new Eiseith());
        pokemon.add(new Excanth());
    }

}