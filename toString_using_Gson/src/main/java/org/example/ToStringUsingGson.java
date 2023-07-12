package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * This code demonstrates how to use the Gson library to override the
 * `toString()` method of a class and convert its object into a JSON
 * representation.
 */

@Getter
@Setter
@AllArgsConstructor
public class ToStringUsingGson {
    private int id;
    private String name;
    private boolean active;

    @Override
    public String toString() {
        /*
         * HTML escaping is a process where certain characters are replaced with their
         * corresponding HTML entities to prevent them from being interpreted as HTML
         * tags or special characters.
         */
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.disableHtmlEscaping();

        /*
         * The Gson class is the primary class in the Gson library that provides
         * functionality for converting Java objects to JSON representation and vice
         * versa.
         */
        Gson gson = gsonBuilder.create();
        return gson.toJson(this);

    }

    public static void main(String[] args) {
        ToStringUsingGson example = new ToStringUsingGson(113, "Spidey", true);
        System.out.println(example.toString());
    }
}
