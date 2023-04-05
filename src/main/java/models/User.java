package models;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Value
@RequiredArgsConstructor
public class User {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    @NonFinal @Setter
    double weight;
}
