package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    public Shaman() {
        super (100, 0.2,0.2,10, 15);
    }

    @Override
    public String toString() {
        return "Shaman: health = " + getHealth() +
                " ,physDefence = " + getPhysDef() * 100 +
                "%, magicDefence = " + getMagicDef() * 100 +
                "%, physAttack = " + getPhysAtt() +
                ", magicAttack = " + getMagicAtt();
    }
    @Override
    public String getName() {
        String name = "Shaman";
        return name;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (getPhysAtt() - getPhysAtt() * hero.getPhysDef()));
        if (hero.getHealth() > MaxHealth) hero.setHealth(MaxHealth);
        if (MinHealth > hero.getHealth()) hero.setHealth(MinHealth);
        System.out.println(hero.getName() + " { health = " + hero.getHealth() + "}");
    }

    @Override
    public void magicalAttack (Hero hero) {
        hero.setHealth(hero.getHealth() - (getMagicAtt() - getMagicAtt() * hero.getMagicDef()));
        if (hero.getHealth() > MaxHealth) hero.setHealth(MaxHealth);
        if (MinHealth > hero.getHealth()) hero.setHealth(MinHealth);
        System.out.println(hero.getName() + " { health = " + hero.getHealth() + "}");
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        if (getHealth() > MaxHealth) setHealth(MaxHealth);
        if (MinHealth > getHealth()) setHealth(MinHealth);
        System.out.println(getName() + " {health = " + getHealth() + "}");
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        if (hero.getHealth() > MaxHealth) hero.setHealth(MaxHealth);
        if (MinHealth > hero.getHealth()) hero.setHealth(MinHealth);
        System.out.println(hero.getName() + " {health = " + getHealth() + "}");
    }
}
