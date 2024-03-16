package lab3.ability.pudge;

import lab3.ability.Ability;
import lab3.ability.Active;

public class Hook extends Ability implements Active {
    public Hook(String title, int manaCost, int coolDown) {
        super(title, manaCost, coolDown);
    }

    @Override
    public void use() {

    }
}
