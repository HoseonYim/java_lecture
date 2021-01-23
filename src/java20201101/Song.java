package java20201101;

public class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    public Song(){
    }

    public Song(String t, String a, int y, String c){
        title = t;
        artist = a;
        year = y;
        country = c;
    }

    public void show(){
        System.out.printf("%d year %s country's %s sang %s",year,country,artist,title);
    }
}
