package day12.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> abba =  new ArrayList<>();
        abba.add("Agnetha Faltskog");
        abba.add("Bjorn Ulvaeus");
        abba.add("Benny Andersson");
        abba.add("Anny-FRID Lingstad");

        List<String> rollingStones = new ArrayList<>();
        rollingStones.add("Mick Jagger");
        rollingStones.add("Keith Richards");
        rollingStones.add("Ronnie Wood");

        List<String> acdc = new ArrayList<>();
        acdc.add("Angus Young");
        acdc.add("Phil Rudd");
        acdc.add("Cliff Williams");
        acdc.add("Brian Johnson");
        acdc.add("Stevie Young");

        List<String> depecheMode = new ArrayList<>();
        depecheMode.add("Andy Fletcher");
        depecheMode.add("Martin Gore");
        depecheMode.add("Dave Gahan");

        List<String> gunsNroses = new ArrayList<>();
        gunsNroses.add("Axl Roses");
        gunsNroses.add("Duff McKagan");
        gunsNroses.add("Slash");
        gunsNroses.add("Dizzy Reed");
        gunsNroses.add("Richard Fortus");
        gunsNroses.add("Frank Ferrer");
        gunsNroses.add("Melissa Reese");

        MusicBand musicBand1 = new MusicBand("ABBA", 1972, abba);
        MusicBand musicBand2 = new MusicBand("Rolling Stones", 1962, rollingStones);
        MusicBand musicBand3 = new MusicBand("AC/DC", 1973, acdc);
        MusicBand musicBand4 = new MusicBand("Depeche Mode", 1980, depecheMode);
        MusicBand musicBand5 = new MusicBand("Guns N Roses", 1985, gunsNroses);

        MusicBand.transferMembers(musicBand3, musicBand1);
        musicBand1.printMembers();
        musicBand3.printMembers();

        List<String> membersOfBand3 = musicBand3.getMembers();
        System.out.println(membersOfBand3);

    }
}

class MusicBand {
    private String name;
    private int year;
    private List<String> groupMember = new ArrayList<>();

    public MusicBand(String name, int year, List<String> groupMember) {
        this.name = name;
        this.year = year;
        this.groupMember = groupMember;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(List<String> groupMember) {
        this.groupMember = groupMember;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", year=" + year +
                ", groupMember='" + groupMember + '\'' +
                '}';
    }

    public static void transferMembers (MusicBand band1, MusicBand band2) {
        band2.groupMember.addAll(band1.groupMember);
        band1.groupMember.removeAll(band1.groupMember);
    }

    public void printMembers() {
        System.out.println(getGroupMember());
    }

    public List<String> getMembers() {
        return getGroupMember();
    }
}
