public class Main {
    public static void main(String[] args) {
        Friend Vishenka = new Friend("Вишенка", Condition.ALONE);
        Signor Pomidor = new Signor("Помидор", Condition.NORMAL);
        Signor Petrushka = new Signor("Петрушка", Condition.NORMAL);
        Countess SeniorCountess = new Countess("Старшая Графиня", Condition.NORMAL);
        Countess JuniorCountess = new Countess("Младшая Графиня", Condition.NORMAL);
        Orange Orange = new Orange("Апельсин", Condition.NORMAL);
        Mandarin Mandarin = new Mandarin("Мандарин", Condition.NORMAL);

        Orange.golovomoika(Orange.getName(), Vishenka);
        Orange.describe();
    }
}