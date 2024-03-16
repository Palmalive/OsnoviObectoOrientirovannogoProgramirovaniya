package lab3.ability;

public abstract class Ability {

    private String title;

    private int manaCost;

    private int coolDown;

    public Ability(String title, int manaCost, int coolDown) {
        this.title = title;
        this.manaCost = manaCost;
        this.coolDown = coolDown;
    }
}
