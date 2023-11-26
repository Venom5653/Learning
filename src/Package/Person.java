package Package;

import java.util.Objects;

public class Person {
   String string;
   int id;
    public Person(String string, int id) {
        this.string = string;
        this.id = id;
        System.out.println("Обьект создан Person");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof User) {
            User user = (User) o;
            return id == user.id && Objects.equals(string, user.string);
        } else if (o instanceof Person) {
            Person person = (Person) o;
            return id == person.id && Objects.equals(string, person.string);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = string != null ? string.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
