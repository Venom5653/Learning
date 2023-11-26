package Package;

public class People {
    public static void main(String[] args) {

        User user = new User("Valera", 12);
        User user2 = new User("Valera", 12);
        Person person = new Person( "Valera",12);


        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(person.hashCode());

        System.out.println(user.equals(user2));
        System.out.println(user.equals(person));
    }
}