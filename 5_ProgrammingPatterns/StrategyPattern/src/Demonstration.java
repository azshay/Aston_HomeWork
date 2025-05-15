public class Demonstration {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Goose goose = new Goose();
        Cow cow = new Cow();
        Goose herbivorousGoose = new Goose(new EatGrass());

        cat.eat();
        goose.eat();
        cow.eat();
        herbivorousGoose.eat();
    }
}