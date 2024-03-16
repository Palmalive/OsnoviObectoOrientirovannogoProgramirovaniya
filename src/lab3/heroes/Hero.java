package lab3.heroes;

import lab3.ability.Ability;
import lab3.heroes.Attribute;

import java.util.List;

public class Hero {

    private String name;

    //attributes
    private Attribute mainAttribute;
    private int strength;
    private int agility;
    private int intelligence;

    private int damage;
    private int attackSpeed;
    private List<Ability> abilities;

    public Hero(String name, Attribute mainAttribute, int strength, int agility, int intelligence, int damage, int attackSpeed, List<Ability> abilities) {
        this.name = name;
        this.mainAttribute = mainAttribute;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.abilities = abilities;
    }

    public Hero() {
    }
}
