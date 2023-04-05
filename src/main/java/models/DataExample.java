package models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.NonFinal;

import java.time.LocalDate;

@Data
public class DataExample {
    private final String name;
    @Setter private int age;
    private double score;
    private String[] tags;

    @Data(staticConstructor="of")
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }
}
