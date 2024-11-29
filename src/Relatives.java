public interface Relatives {
    default void describeAsRelative(String name) {
        System.out.println(name + " является родственником Вишенки");
    }
}