public class Cat extends Animal {

    public Cat() {
        super(new EatMeat());
    }

    public Cat(EatStrategy eatStrategy) {
        super(eatStrategy);
    }
}
