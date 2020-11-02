package EoinCA;

import javax.swing.*;


public class TestAlbum {
    public static void main(String[] args)
    {
        String output1 ="";
        String output2;

       Song s1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
       Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
       Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
       Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
       Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

       Album a1 = new Album("Now that's what i call music 98", new Song[]{s1, s2, s3, s4, s5},"Universal Music",2016);

       output1 += "\n\nName:" +a1.toString();


       JOptionPane.showMessageDialog(null,output1,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showInputDialog("Which track number would you like to play?");

        output2 = "Track NumberL:" + s1.getTrackNumber() + "Title:" + s1.getTitle() +"Artist:" +s1.getArtist() +"Genre:" + s1.getGenre() +"Release Year:" + a1.getReleaseYear() + "Duration:" + s1.getDuration();

        JOptionPane.showMessageDialog(null,output2,"Playing Track",JOptionPane.INFORMATION_MESSAGE);

    }
}
