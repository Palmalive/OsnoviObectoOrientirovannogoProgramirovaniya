package lab3.ability.pudge;

import lab3.ability.Ability;
import lab3.ability.Active;

public class Dismember extends Ability implements Active{
    public Dismember(String title, int manaCost, int coolDown) {
        super(title, manaCost, coolDown);
    }

    @Override
    public void use() {

    }
}
