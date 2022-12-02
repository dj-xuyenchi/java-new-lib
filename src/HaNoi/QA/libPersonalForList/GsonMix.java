/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HaNoi.QA.libPersonalForList;

/**
 *
 * @author quanganhdo
 */

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class GsonMix {
    public static Gson gsonLocalDate() {
        return new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
            }
        }).create();
    }
}
