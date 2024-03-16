package lab3;

import lab3.ability.Ability;
import lab3.ability.pudge.Dismember;
import lab3.ability.pudge.Hook;
import lab3.ability.pudge.OldFlashHeap;
import lab3.ability.pudge.Rot;
import lab3.heroes.Attribute;
import lab3.heroes.Hero;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ability hook = new Hook("hook", 110, 18);
        Ability rot = new Rot("rot", 0, 0);
        Ability flashHeap = new OldFlashHeap("flashHeap", 0, 0);
        Ability dismember = new Dismember("dismember", 100, 30);

        Hero pudge = new Hero("Pudge", Attribute.strength, 25, 14, 16
                , 45, 100, List.of(hook, rot, flashHeap, dismember));
    }
}
