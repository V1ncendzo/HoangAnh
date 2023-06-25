package hust.soict.cs.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play()
    {
        System.out.println("Title: " + this.getTitle() + ", length: " + this.getLength());
    }
}