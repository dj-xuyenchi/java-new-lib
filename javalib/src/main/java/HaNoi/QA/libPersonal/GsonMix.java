/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HaNoi.QA.libPersonal;

/**
 *
 * @author quanganhdo
 */
import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Trả lại đối tượng lớp Gson hỗ trợ parse ngày tháng kiểu dữ liệu LocalDate
 *
 * @return Trả về Gson.
 */
public class GsonMix {

    public static Gson gsonLocalDate() {
        return new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
            }
        }).create();
    }

    /**
     * Trả lại đối tượng lớp Gson hỗ trợ parse ngày tháng kiểu dữ liệu
     * LocalDateTime
     *
     * @return Trả về Gson.
     */
    public static Gson gsonLocalDateTime() {
        return new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new JsonDeserializer<LocalDateTime>() {
            @Override
            public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                return LocalDateTime.parse(json.getAsJsonPrimitive().getAsString());
            }
        }).create();
    }
}
