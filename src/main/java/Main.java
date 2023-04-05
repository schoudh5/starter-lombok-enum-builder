import models.DataExample;
import models.Employee;
import models.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        User u = new User("abc", "desf", LocalDate.of(1988, 6, 11));

        u.setWeight(1.42);;
        System.out.println(u);
        System.out.println(u.hashCode());

        Employee e = Employee.builder().firstName("s")
                .firstName("c")
                .dateOfBirth(LocalDate.of(1988, 11, 6))
                .build();
        System.out.println(e);
        Integer x = new Integer(5);
        DataExample.Exercise<Integer> d = DataExample.Exercise.of("myname", 100);

        System.out.println(d);
    }
}
