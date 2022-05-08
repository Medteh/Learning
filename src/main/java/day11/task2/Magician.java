package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack {
    public Magician() {
        super (100, 0,0.8,5, 20);
    }

    @Override

    public String toString() {
        return "Magician: health = " + getHealth() +
                " ,physDefence = " + getPhysDef() * 100 +
                "%, magicDefence = " + getMagicDef() * 100 +
                "%, physAttack = " + getPhysAtt() +
                ", magicAttack = " + getMagicAtt();
    }

    @Override
    public String getName() {
        String name = "Magician";
        return name;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (getPhysAtt() - getPhysAtt() * hero.getPhysDef()));
        System.out.println(hero.getName()+ " { health = " + hero.getHealth() + "}");
    }

   @Override
    public void magicalAttack (Hero hero) {
        hero.setHealth(hero.getHealth() - (getMagicAtt() - getMagicAtt() * hero.getMagicDef()));
        if (MaxHealth < hero.getHealth()) hero.setHealth(MaxHealth);
        if (MinHealth > hero.getHealth()) hero.setHealth(MinHealth);
        System.out.println(hero.getName() + " { health = " + hero.getHealth() + "}");
    }

}
