public class Orange extends Character implements Baron, Relatives {
    public Orange(String name) {
        super(name);
    }

    @Override
    public void describe() {
        super.describe();
        describeAsBaron(getName());
        describeAsRelative(getName());
    }
}
