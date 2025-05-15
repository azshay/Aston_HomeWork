public class Animal {

    private EatStrategy eatStrategy;

    public Animal(EatStrategy eatStrategy) {
        this.eatStrategy = eatStrategy;
    }

    public void move() {
        System.out.println("Двигаюсь..");
    }

    public void eat() {
        this.eatStrategy.eat();
    }

}
