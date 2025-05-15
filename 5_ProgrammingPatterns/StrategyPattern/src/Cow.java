public class Cow extends Animal {
    public Cow() {
        super(new EatGrass());
    }

    public Cow(EatStrategy eatStrategy) {
        super(eatStrategy);
    }
}
