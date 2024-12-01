class Character {
    private final String name;
    private Condition condition;

    public Character(String name, Condition initialCondition) {
        this.name = name;
        this.condition = initialCondition;
    }
    // Берем имя
    public String getName() {
        return name;
    }
    // Получаем кондиции жестко
    public Condition getCondition() {
        return condition;
    }
    // На кондициях
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void describe() {
        System.out.println("Имя: " + name);
    }
}