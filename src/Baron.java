public interface Baron {
    default void describeAsBaron(String name) {
        System.out.println(name + " является бароном");
    }
}
