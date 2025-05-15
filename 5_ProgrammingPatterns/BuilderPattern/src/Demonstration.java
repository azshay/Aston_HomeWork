public class Demonstration {
    public static void main(String[] args) {

        Person person = new Person.PersonBuilder("Azat", "Shayakhmetov", 24)
                .build();
        System.out.println(person);

        Person person1 = new Person.PersonBuilder("Ivan", "Ivanovich", 100)
                .setJob("smth")
                .setHasCar(true)
                .build();

        System.out.println(person1);

    }
}