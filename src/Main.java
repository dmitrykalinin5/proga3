public class Main {
    public static void main(String[] args) {
        Friend Vishenka = new Friend("Вишенка", Condition.ALONE);
        Signor Pomidor = new Signor("синьор Помидор", Condition.NORMALEK);
        Signor Petrushka = new Signor("синьор Петрушка", Condition.NORMALEK);
        Countess SeniorCountess = new Countess("Старшая Графиня", Condition.NORMALEK);
        Countess JuniorCountess = new Countess("Младшая Графиня", Condition.NORMALEK);
        Orange Orange = new Orange("барон Апельсин", Condition.PODKOVAN);
        Mandarin Mandarin = new Mandarin("герцог Мандарин", Condition.PODKOVAN);

        System.out.println(Vishenka.getName() + " остался один");
        System.out.println(Vishenka.getName() + " ждет головомойки от " + Pomidor.getName() + ", "
                + Petrushka.getName() + ", "+ SeniorCountess.getName() + ", "+ JuniorCountess.getName() + ", "+ Orange.getName() + ", "+ Mandarin.getName());
        Orange.golovomoika(Orange.getName(), Vishenka);
        System.out.println(Orange.getName() + " и " + Mandarin.getName() + " знали что так и будет");

    }
}