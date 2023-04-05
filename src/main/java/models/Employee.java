package models;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.time.LocalDate;

@Builder
@Value
public class Employee {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    @NonFinal
    @Setter
    double rating;

}
