package services;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import domain.Creature;
import domain.Zombie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadJSON {
    JsonParser parser = new JsonParser();
    JsonObject object;

    public String getMove() {
        String move = "";
        try {
            object = (JsonObject) parser.parse(new FileReader("src/main/java/input.json"));
            move = object.get("move").getAsString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return move;
    }

    public ArrayList<Zombie> getZombies() {
        ArrayList<Zombie> zombies = new ArrayList<>();

        try {
            object = (JsonObject) parser.parse(new FileReader("src/main/java/input.json"));
            JsonArray zombiesArray = object.get("zombies").getAsJsonArray();
            for (int i = 0; i < zombiesArray.size(); i++) {
                JsonObject zombieObject = zombiesArray.get(i).getAsJsonObject();
                Zombie zombie = new Zombie(i, zombieObject.get("positionX").getAsInt(), zombieObject.get("positionY").getAsInt());
                zombies.add(zombie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return zombies;
    }

    public ArrayList<Creature> getCreatures() {
        ArrayList<Creature> creatures = new ArrayList<>();
        try {
            object = (JsonObject) parser.parse(new FileReader("src/main/java/input.json"));
            JsonArray creaturesArray = object.get("creatures").getAsJsonArray();
            for (int i = 0; i < creaturesArray.size(); i++) {
                JsonObject creatureObject = creaturesArray.get(i).getAsJsonObject();
                Creature creature = new Creature(i, creatureObject.get("positionX").getAsInt(), creatureObject.get("positionY").getAsInt());
                creatures.add(creature);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return creatures;
    }
}