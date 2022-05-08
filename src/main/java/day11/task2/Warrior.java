package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super (100, 0.8,0,30, 0);
    }

    @Override
    public String toString() {
        return "Warrior: health = " + getHealth() +
                " ,physDefence = " + getPhysDef() * 100 +
                "%, magicDefence = " + getMagicDef() * 100 +
                "%, physAttack = " + getPhysAtt() +
                ", magicAttack = " + getMagicAtt();
    }
    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (getPhysAtt() - getPhysAtt() * hero.getPhysDef()));
        if (MaxHealth < hero.getHealth()) hero.setHealth(MaxHealth);
        if (MinHealth > hero.getHealth()) hero.setHealth(MinHealth);
        System.out.println(hero.getName() + " {health = " + hero.getHealth() + "}");
    }

    @Override
    public String getName() {
        String name = "Warrior";
        return name;
    }
}
