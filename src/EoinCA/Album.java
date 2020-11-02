package EoinCA;

import java.util.Arrays;
import java.math.*;

public class Album {

    private String name;
    private String[] tracks;
    private String producer;
    private int releaseYear;



    public Album(String name, Song[] tracks, String producer, int releaseYear) {
        setName();
        setTracks();
        setProducer();
        setReleaseYear();
    }

    private void setReleaseYear() {
    }

    private void setProducer() {
    }

    private void setTracks() {
    }

    private void setName() {
    }

    public String getName() {
        return name;
    }

    public String[] getTracks() {
        return tracks;
    }

    public String getProducer() {
        return producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumberOfTracks()
    {
        return tracks.length();

    }

    public int getPlayingTime()
    {
        int totalPlayingTime= 0;

        Song s1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);
        totalPlayingTime = s1.getDuration() + s2.getDuration() + s3.getDuration() +  s4.getDuration() + s5.getDuration();
        return totalPlayingTime;

    }
    public void playTrack(int)
    {
        final String playTrack = "The song that is playing is" + tracks[int];
    }
    public void shuffle()
    {

    int[] alreadyPicked;
    int n1 = Math.random(1,5);
    int n2 = Math.random(1,5);
    int n3 = Math.random(1,5);
    int n4 = Math.random(1,5);
    int n5 = Math.random(1,5);

    if(n2 == n1)
    {
        n2 = (int) Math.random(1,5);
    }
    if(n3 == n2 || n3 == n1)
    {
        n3 = (int) Math.random(1,5);
    }
    if(n4 == n3 || n4 == n2 || n4 == n1)
    {
     n4 = (int) Math.random(1,5);
    }
    if(n5 == n4 || n5 == n3 || n5 == n2 || n5 == n1)
    {
    n5 = (int) Math.random(1,5);
    }

        alreadyPicked = [n1,n2,n3,n4,n5];

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", releaseYear=" + releaseYear +
                ", Number of tracks:'" +getNumberOfTracks() +
                ", Total Playing Time:'" +getPlayingTime() +
                "\n\nAlbum Tracks" +
                "\nTrack Number     Title     Artist" +
                tracks[]

                '}';
    }
}
