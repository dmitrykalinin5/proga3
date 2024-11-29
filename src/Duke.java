public interface Duke {
    default void describeAsDuke(String name) {
        System.out.println(name + " является герцогом");
    }
}
