public class Person {

    private String name;
    private String surname;
    private int age;
    private String job;
    private boolean hasCar;

    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.job = personBuilder.job;
        this.hasCar = personBuilder.hasCar;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public static class PersonBuilder {
        private String name;
        private String surname;
        private int age;
        private String job; // Может быть NULL
        private boolean hasCar; // Может быть NULL

        public PersonBuilder(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public PersonBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        public PersonBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", hasCar=" + hasCar +
                '}';
    }
}
