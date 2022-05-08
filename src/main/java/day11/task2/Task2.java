package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior1 = new Warrior();
        Shaman shaman1 = new Shaman();
        Paladin paladin1 = new Paladin();
        Magician magician1 = new Magician();

        warrior1.physicalAttack(paladin1);
        paladin1.physicalAttack(magician1);
        shaman1.healTeammate(magician1);
        magician1.magicalAttack(paladin1);
        shaman1.physicalAttack(warrior1);
        paladin1.healHimself();

        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior1.physicalAttack(magician1);
        }
    }
}
