public class Mandarin extends Character implements Duke, Relatives {
    public Mandarin(String name) {
        super(name);
    }

    @Override
    public void describe() {
        super.describe();
        describeAsDuke(getName());
        describeAsRelative(getName());
    }
}
