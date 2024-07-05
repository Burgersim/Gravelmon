package drai.dev.data.jsonwriters;

import com.google.gson.*;
import drai.dev.gravelmon.*;

import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;

public class FossilJSONWriter {

    public static void writeFossils(String resourcesDir){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Gravelmon.FOSSIL_MAP.forEach((key, value) -> {
            String dataDir = resourcesDir+"\\data\\cobblemon\\";
            String assetDir = resourcesDir+"\\assets\\cobblemon\\";
            try {
                var fossilDir = dataDir + "fossils\\";
                var lootDir = dataDir + "loot_tables\\fossils\\rare\\";
                var resolverDir = assetDir + "bedrock\\fossils\\variations\\";
                var poserDir = assetDir + "bedrock\\fossils\\posers\\";

                Files.createDirectories(new File(fossilDir).toPath());
                Files.createDirectories(new File(lootDir).toPath());
                Files.createDirectories(new File(resolverDir).toPath());
                Files.createDirectories(new File(poserDir).toPath());

                writeFossil(key, value, fossilDir, gson);
                writeRareFossilLootTable(key, value, lootDir, gson);
                writeFossilResolver(value, resolverDir, resourcesDir, gson);
                writeFossilPoser(value, poserDir, gson);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void writeFossil(String fossil, String species, String dir, Gson gson) throws IOException {
        JsonObject fileContents = new JsonObject();
        fileContents.add("result", new JsonPrimitive(species));
        var fossils = new JsonArray();
        fossils.add("gravelmon:"+fossil);
        fileContents.add("fossils", fossils);

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + species + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private static void writeRareFossilLootTable(String fossil, String species, String dir, Gson gson) throws IOException {
        JsonObject fileContents = new JsonObject();
        fileContents.add("type", new JsonPrimitive("minecraft:archaeology"));
        var pools = new JsonArray();
        var pool = new JsonObject();
        pool.add("bonus_rolls", new JsonPrimitive(0.0));
        var entries = new JsonArray();
        var entry = new JsonObject();
        entry.add("type", new JsonPrimitive("minecraft:item"));
        entry.add("name", new JsonPrimitive("gravelmon:"+fossil));
        entry.add("weight", new JsonPrimitive(2));
        pool.add("bonus_rolls", new JsonPrimitive(0.0));
        pool.add("entries", entries);
        pool.add("rolls", new JsonPrimitive(1.0));
        pools.add(pool);
        fileContents.add("pools", pools);
        fileContents.add("random_sequence", new JsonPrimitive("cobblemon:fossils/rare/"+fossil));

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + fossil + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private static void writeFossilResolver(String species, String dir, String resourcesDir, Gson gson) throws IOException {
        JsonObject fileContents = new JsonObject();
        fileContents.add("name", new JsonPrimitive("cobblemon:"+species));
        fileContents.add("order", new JsonPrimitive(0));
        var variations = new JsonArray();
        var variation = new JsonObject();
        variation.add("aspects", new JsonArray());
        variation.add("poser", new JsonPrimitive("cobblemon:"+species));
        variation.add("model", new JsonPrimitive("cobblemon:cutout_gravelmon.geo"));
        variation.add("texture", new JsonPrimitive("cobblemon:textures/fossils/"+species+".png"));
        variation.add("layers", new JsonArray());
        variations.add(variation);
        fileContents.add("variations", variations);

        createPlaceholderTextureIfNotExists( species + ".png", resourcesDir);

        var assetFile = new File(dir + species + ".json");
        if (!assetFile.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(assetFile));
            writer.write(gson.toJson(fileContents));
            writer.close();
        }
    }

    public static void createPlaceholderTextureIfNotExists(String filename, String resourcesDir) {
        String textureDir = resourcesDir + "\\assets\\cobblemon\\textures\\fossil\\";
        File textureLocation = new File(textureDir + filename);

        if (!textureLocation.exists()) {
            BufferedImage placeholder = new BufferedImage(96, 96, 3);
            try {
                Files.createDirectories(new File(textureDir).toPath());
                ImageIO.write(placeholder, "png", textureLocation);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void writeFossilPoser(String species, String dir, Gson gson) throws IOException {
        JsonObject fileContents = new JsonObject();
        fileContents.add("maxScale", new JsonPrimitive(0.1));
        fileContents.add("yTranslation", new JsonPrimitive(0.1));
        fileContents.add("yGrowthPoint", new JsonPrimitive(-0.5));
        fileContents.add("animations", new JsonArray());
        fileContents.add("quirks", new JsonArray());

        var assetFile = new File(dir + species + ".json");
        if (!assetFile.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(assetFile));
            writer.write(gson.toJson(fileContents));
            writer.close();
        }
    }
}