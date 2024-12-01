public class Orange extends Character implements Baron, Relatives, Golovomoika {
    public Orange(String name, Condition condition) {
        super(name, condition);
    }

    @Override
    public void describe() {
        super.describe();
        describeAsBaron(getName());
        describeAsRelative(getName());
    }
}
