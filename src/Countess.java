import java.util.ArrayList;
import java.util.List;

public class Countess extends Signor implements Golovomoika{
    // делаем массивичк, добавляем в него все объектики, кайфуем, чиллим и тд
    private static final List<Countess> listOfCountess = new ArrayList<>();

    public Countess(String name, Condition condition) {
        super(name, condition);
        listOfCountess.add(this);
    }

    public static List<Countess> getListOfCountess() {
        return listOfCountess;
    }
}
