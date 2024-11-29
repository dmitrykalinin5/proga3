class Character {
    private final String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println("Имя: " + name);
    }
}