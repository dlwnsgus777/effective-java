package effective.code.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
   LocalDate birthday;

   public Person() {

   }

   public Person(LocalDate birthday) {
      this.birthday = birthday;
   }

   public int getAge() {
      return LocalDate.now().getYear() - birthday.getYear();
   }

   public int compareByAge(Person b) {
      return this.birthday.compareTo(b.birthday);
   }

   public static void main(String[] args) {
      List<LocalDate> dates = new ArrayList<>();
      dates.add(LocalDate.of(1993, 9, 27));
      dates.add(LocalDate.of(1993, 9, 3));
      dates.add(LocalDate.of(2022, 6, 28));

      dates.stream().map(Person::new).collect(Collectors.toList());

      List<Person> people = new ArrayList<>();
      people.add(new Person(LocalDate.of(1982, 7, 15)));
      people.add(new Person(LocalDate.of(2011, 3, 2)));
      people.add(new Person(LocalDate.of(2013, 1, 28)));

      Person person = new Person(null);

      people.sort(Person::compareByAge);
   }
}
