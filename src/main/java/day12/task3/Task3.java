package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBands2 = new ArrayList<>();
        for (MusicBand musicBand: bands) {
            if (musicBand.getYear() > 2000)
                musicBands2.add(musicBand);
        }
        return musicBands2;
    }
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>(10);
        musicBands.add(new MusicBand("Aerosmith", 1979));
        musicBands.add(new MusicBand("Offspring", 1995));
        musicBands.add(new MusicBand("Avril Lavigne", 2005));
        musicBands.add(new MusicBand("Scorpions", 1981));
        musicBands.add(new MusicBand("ArticAndAsti", 2007));
        musicBands.add(new MusicBand("Lepzz", 2003));
        musicBands.add(new MusicBand("GunsNRoses", 1985));
        musicBands.add(new MusicBand("DimaBilan", 2006));
        musicBands.add(new MusicBand("FrankSinatra", 1953));
        musicBands.add(new MusicBand("GayazovBrothers", 2014));

        Collections.shuffle(musicBands);
        List<MusicBand> musicBands2 = groupsAfter2000(musicBands);
        System.out.println(musicBands);
        System.out.println(musicBands2);
    }
}

class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' +
                ", year=" + year + '}';
    }
}