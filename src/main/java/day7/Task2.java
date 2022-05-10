package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(Player.MAX_STAMINA);

        Player player1 = new Player(rand);
        Player player2 = new Player(rand);
        Player player3 = new Player(rand);
        Player player4 = new Player(rand);
        Player player5 = new Player(rand);
        Player player6 = new Player(rand); // iniciaciya objects
        /*Player player7 = new Player(rand);
        System.out.println(Player.countPlayers);*/ // zdec zakommentirovana proverka:sozdali igroka 7
        // i posle etogo napechatali
        // kol-vo igrokov - ostalos chislo 6

        Player.info(); // vivod na ekran kol-df svobodnyh mest na pole

        for (int i = 0; i < rand; i++)
            player1.run(); //igrok 1 nachinaet beg i begaet do polnoi poteri vinoslivosti i uhodit s polya

        Player.info(); //vivod kolichestva igrokov na pole posle uhoda odnogo iz nih
    }
}

class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }                               // konstruktor dlya inizializacii objects i
    // inkrement staticheskoi peremennoi countPlayers
    // pri sozdanii novogo object pri uslovii countPlayers < 6

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() { // metod bega, umenshauschii stamina pri kagdom vizove
        stamina--;
        if (stamina <= MIN_STAMINA) {
            System.out.println("Player goes outside the field");
            countPlayers--;
        }
    }

    public static void info() { // podschet igrokov v zavisimosti ot value of countPlayers
        int ostalosMest = 6 - countPlayers;
        String infoCountPlayer = (countPlayers < 6) ? "Na pole ostalos " + ostalosMest + "mest" : "Na pole net svobodnih mest";
        System.out.println(infoCountPlayer);
    }
}