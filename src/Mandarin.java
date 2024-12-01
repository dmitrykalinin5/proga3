public class Mandarin extends Character implements Duke, Relatives, Golovomoika {
    public Mandarin(String name, Condition condition) {
        super(name, condition);
    }

    @Override
    public void describe() {
        super.describe();
        describeAsDuke(getName());
        describeAsRelative(getName());
    }
}
