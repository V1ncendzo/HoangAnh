package hust.soict.cs.aims.media;

import hust.soict.cs.aims.media.Playable;

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
