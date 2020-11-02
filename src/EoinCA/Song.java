package EoinCA;

public class Song {

    private int trackID;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int songReleaseYear;



    public Song(String title,String artist,String genre,int duration,int songReleaseYear)
    {

     setTitle();
     setArtist();
     setGenre();
     setDuration();
     setSongReleaseYear();
    }

    private void setSongReleaseYear() {
    }

    private void setDuration() {
    }

    private void setGenre() {
    }

    private void setArtist() {
    }

    private void setTitle() {
    }

    public int getTrackID()
    {
        return trackID;
    }

    public void setTrackID(int trackID)
    {
        this.trackID = trackID;
    }

    public int getTrackNumber()
    {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber)
    {
        this.trackNumber = trackNumber;
    }

    public String getTitle()
    {
        return title;
    }



    public String getArtist()
    {
        return artist;
    }



    public String getGenre()
    {
        return genre;
    }



    public int getDuration()
    {
        return duration;
    }



    public int getSongReleaseYear()
    {
        return songReleaseYear;
    }

    public void setSongReleaseYear(int songReleaseYear)
    {
        this.songReleaseYear = songReleaseYear;
    }


}
