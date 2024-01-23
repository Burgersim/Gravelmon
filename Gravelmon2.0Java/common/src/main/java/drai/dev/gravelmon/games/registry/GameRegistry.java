package drai.dev.gravelmon.games.registry;

import drai.dev.gravelmon.*;
import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.games.original.*;

import java.util.*;

public class GameRegistry {
    public static ArrayList<Game> games = new ArrayList<>();
    public static void registerGames(){
        //TODO make pokemon that evolve using an item drop said item in their evolved form
        games.add(new GenerationOne());
        games.add(new GenerationTwo());
        games.add(new GenerationThree());
        games.add(new GenerationFour());
        games.add(new GenerationFive());
        games.add(new GenerationSix());
        games.add(new GenerationSeven());
        games.add(new GenerationEight());
        games.add(new GenerationNine());
        GravelmonJsonGenerator.setDexCounter(1024);
        games.add(new Sage());
        games.add(new Realidea());
        games.add(new Infinity());
        games.add(new Opal());
        games.add(new Insurgence());
        games.add(new Xenoverse());
        games.add(new Uranium());
        games.add(new Flux());
        games.add(new EternalForest());
        games.add(new Lockemon());
        games.add(new Umbra());
        games.add(new BlazingEmerald());
        games.add(new Daybreak());
        games.add(new Vanguard());
        games.add(new Myth());
        games.add(new Deneb());
    }
}
