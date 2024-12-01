public interface Golovomoika {
    default void golovomoika(String name, Friend friend) {
        System.out.println(name + " делает головомойку " + friend.getName());
        int i = 1;
        // пробегаемся по массиву и доставляем удовольствие графиням
        for (Countess countess : Countess.getListOfCountess()) {
            if (i > 1) {
                countess.setCondition(Condition.PLEASURE);
                System.out.println(countess.getName() + " тоже получает жесточайшее удовольствие");
            } else {
            countess.setCondition(Condition.PLEASURE);
            System.out.println(countess.getName() + " получает жесточайшее удовольствие"); }
            i += 1;
        }
        friend.setCondition(Condition.NAKONDICIYAH);
        System.out.println(friend.getName() + " на кондициях вывозит");
    }
}
