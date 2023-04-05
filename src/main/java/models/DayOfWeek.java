package models;

import java.util.HashMap;
import java.util.Map;

public enum DayOfWeek {
    MONDAY("M"),TUESDAY("T"), WEDNESDAY("W"),THURSDAY("R"), FRIDAY("F"), SATURDAY("Sa"), SUNDAY("Su");

    private final String abbreviation;

    // Reverse-lookup map for getting a day from an abbreviation
    private static final Map<String, DayOfWeek> lookup = new HashMap<String, DayOfWeek>();

    static {
        for (DayOfWeek d : DayOfWeek.values()) {
            lookup.put(d.getAbbreviation(), d);
        }
    }

    private DayOfWeek(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static DayOfWeek getDay(String abbreviation) {
        return lookup.get(abbreviation);
    }
}
