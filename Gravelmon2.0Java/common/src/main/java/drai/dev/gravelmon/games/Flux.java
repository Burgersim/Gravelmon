package drai.dev.gravelmon.games;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.flux.*;

public class Flux extends Game {
    public Flux() {
        super("Flux");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new Mozz());
//        pokemon.add(new Mosseer());
//        pokemon.add(new Daemoth());
//        pokemon.add(new Chiklit());
//        pokemon.add(new Burnychus());
//        pokemon.add(new Pyropteryx());
//        pokemon.add(new Findolf());
//        pokemon.add(new Delfender());
//        pokemon.add(new Hydrocean());
//        pokemon.add(new Minyan());
//        pokemon.add(new Vilucard());
//        pokemon.add(new Lunapup());
//        pokemon.add(new Herolune());
//        pokemon.add(new Selkid());
//        pokemon.add(new Syrentide());
//        pokemon.add(new Cavamie());
//        pokemon.add(new Capymigo());
//        pokemon.add(new Humborb());
//        pokemon.add(new Navibri());
//        pokemon.add(new Turbolibri());
//        pokemon.add(new Squrmy());
//        pokemon.add(new Durtwurm());
//        pokemon.add(new Wurmiterra());
//        pokemon.add(new Tanupy());
//        pokemon.add(new Tanscure());
//        pokemon.add(new Sluchuu());
//        pokemon.add(new Gullitt());
//        pokemon.add(new Garbagull());
        var nidorimewinter = new NidorimeWinterCoat();
        pokemon.add(nidorimewinter);
        pokemon.add(new NidorimeSummerCoat(nidorimewinter.getPokedexNumber()));
        pokemon.add(new Nidoregina());
        pokemon.add(new Nidoregus());
//        pokemon.add(new Roadillo());
//        pokemon.add(new Armarauder());
//        pokemon.add(new Pouchelet());
//        pokemon.add(new Grimmposs());
//        pokemon.add(new Salmini());
//        pokemon.add(new Salmosault());
//        pokemon.add(new Taroot());
//        pokemon.add(new Daikongus());
//        pokemon.add(new Brontoloom());
//        pokemon.add(new Magief());
//        pokemon.add(new Corsuave());
//        pokemon.add(new Raverogue());
        pokemon.add(new Zorotsune());
//        pokemon.add(new Nursa());
//        pokemon.add(new Cuspide());
//        pokemon.add(new Tarandible());
//        pokemon.add(new Gunafix());
//        pokemon.add(new Fixinit());
//        pokemon.add(new Artifixt());
//        pokemon.add(new Comite());
//        pokemon.add(new Cometeor());
//        pokemon.add(new Astronite());
//        pokemon.add(new Spelotl());
//        pokemon.add(new Salamancer());
//        pokemon.add(new Ledlite());
//        pokemon.add(new Insulatex());
//        pokemon.add(new Negawatt());
//        pokemon.add(new Sputya());
//        pokemon.add(new Kosmisha());
//        pokemon.add(new Debrichka());
//        pokemon.add(new Flager());
//        pokemon.add(new Inflagetah());
//        pokemon.add(new Jerbolta());
//        pokemon.add(new Karmilarie());


    }
}
