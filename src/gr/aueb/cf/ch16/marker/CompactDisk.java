package gr.aueb.cf.ch16.marker;

public class CompactDisk implements Item {
    private int id;
    private String title;

    public CompactDisk() {

    }

    public CompactDisk(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
