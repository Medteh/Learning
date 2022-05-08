package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    public Paladin() {
        super (100, 0.5,0.2,15, 0);
    }

    @Override
    public String toString() {
        return "Paladin: health = " + getHealth() +
                " ,physDefence = " + getPhysDef() * 100 +
                "%, magicDefence = " + getMagicDef() * 100 +
                "%, physAttack = " + getPhysAtt() +
                ", magicAttack = " + getMagicAtt();
    }
    @Override
    public String getName() {
        String name = "Paladin";
        return name;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (getPhysAtt() - getPhysAtt() * hero.getPhysDef()));
        if (MaxHealth < hero.getHealth()) hero.setHealth(MaxHealth);
        if (MinHealth > hero.getHealth()) hero.setHealth(MinHealth);

        System.out.println(hero.getName() + "{ health = " + hero.getHealth() + "}");
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        if (getHealth() > MaxHealth) setHealth(MaxHealth);
        if (MinHealth > getHealth()) setHealth(MinHealth);
        System.out.println(getName() + "{health = " + getHealth() + "}");
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        if (hero.getHealth() > MaxHealth) hero.setHealth(MaxHealth);
        if (MinHealth > hero.getHealth()) hero.setHealth(MinHealth);
        System.out.println(hero.getName() + " { health = " + hero.getHealth() + "}");
    }
}


