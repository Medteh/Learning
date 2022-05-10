package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> abba =  new ArrayList<>();
        abba.add(new MusicArtist("Agnetha Faltskog", 72 ));
        abba.add(new MusicArtist ("Bjorn Ulvaeus", 77));
        abba.add(new MusicArtist ("Benny Andersson", 75));
        abba.add(new MusicArtist ("Anny-FRID Lingstad", 76));

        List<MusicArtist> rollingStones = new ArrayList<>();
        rollingStones.add(new MusicArtist ("Mick Jagger", 78));
        rollingStones.add(new MusicArtist ("Keith Richards", 78));
        rollingStones.add(new MusicArtist ("Ronnie Wood", 74));

        List<MusicArtist> acdc = new ArrayList<>();
        acdc.add(new MusicArtist ("Angus Young", 67));
        acdc.add(new MusicArtist ("Phil Rudd", 67));
        acdc.add(new MusicArtist ("Cliff Williams", 72));
        acdc.add(new MusicArtist ("Brian Johnson", 74));
        acdc.add(new MusicArtist ("Stevie Young", 65));

        List<MusicArtist> depecheMode = new ArrayList<>();
        depecheMode.add(new MusicArtist ("Andy Fletcher", 60));
        depecheMode.add(new MusicArtist ("Martin Gore", 60));
        depecheMode.add(new MusicArtist ("Dave Gahan", 60));

        List<MusicArtist> gunsNroses = new ArrayList<>();
        gunsNroses.add(new MusicArtist ("Axl Roses", 60));
        gunsNroses.add(new MusicArtist ("Duff McKagan", 58));
        gunsNroses.add(new MusicArtist ("Slash", 56));
        gunsNroses.add(new MusicArtist ("Dizzy Reed", 58));
        gunsNroses.add(new MusicArtist ("Richard Fortus", 55));
        gunsNroses.add(new MusicArtist ("Frank Ferrer", 56));
        gunsNroses.add(new MusicArtist ("Melissa Reese", 32));

        MusicBand musicBand1 = new MusicBand("ABBA", 1972, abba);
        MusicBand musicBand2 = new MusicBand("Rolling Stones", 1962, rollingStones);
        MusicBand musicBand3 = new MusicBand("AC/DC", 1973, acdc);
        MusicBand musicBand4 = new MusicBand("Depeche Mode", 1980, depecheMode);
        MusicBand musicBand5 = new MusicBand("Guns N Roses", 1985, gunsNroses);

        musicBand2.printMembers();
        List<MusicArtist> Band2 = musicBand2.getMembers();
        System.out.println(Band2);

        MusicBand.transferMembers(musicBand2, musicBand1);
        System.out.println(musicBand2);
        System.out.println(musicBand1);

    }
}

class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> groupMember = new ArrayList<>();

    public MusicBand(String name, int year, List<MusicArtist> groupMember) {
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

    public List<MusicArtist> getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(List<MusicArtist> groupMember) {
        this.groupMember = groupMember;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", year=" + year +
                ", groupMember: " + groupMember;
    }

    public static void transferMembers (MusicBand band1, MusicBand band2) {
        band2.groupMember.addAll(band1.groupMember);
        band1.groupMember.removeAll(band1.groupMember);
    }

    public void printMembers() {
        System.out.println(getGroupMember());
    }

    public List<MusicArtist> getMembers() {
        return getGroupMember();
    }
}

class MusicArtist {
    private String name;
    private int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
