public class Goose extends Animal {
    public Goose() {
        super(new EatGrains());
    }

    public Goose(EatStrategy eatStrategy) {
        super(eatStrategy);
    }
}
