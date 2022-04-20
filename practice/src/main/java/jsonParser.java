package main.java;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class jsonParser {
        JsonParser obj = new JsonParser();
        JsonElement el;
    public jsonParser() throws FileNotFoundException {
        FileReader reader = new FileReader("memes.json");
        el = obj.parse(reader);
    }

    public ArrayList<String> parse() {
        ArrayList<String> urls = new ArrayList<>();
        JsonArray results = el.getAsJsonObject().getAsJsonArray("images_results");
        System.out.println(results);
        for(int i = 0; i < results.size(); i++) {
           JsonElement curr = (JsonElement) results.get(i);
           JsonElement url = curr.getAsJsonObject().get("link");
           urls.add(url.getAsString());
        }
        return urls;
    }
}
