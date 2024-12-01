public interface Golovomoika {
    default void golovomoika(String name, Friend friend) {
        System.out.println(name + " делает головомойку " + friend.getName());
        // пробегаемся по массиву и доставляем удовольствие графиням
        for (Countess countess : Countess.getListOfCountess()) {
            countess.setCondition(Condition.PLEASURE);
            System.out.println(countess.getName() + " получает жесточайшее удовольствие");
        }
    }
}
