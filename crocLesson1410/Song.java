package crocLesson1410;

public class Song {

    String author;
    String title;

    public Song() {
        this.author = "Unknown";
        this.title = "No Title";
    }

    public Song(String newAuthor, String newTitle) {
        this.author = newAuthor;
        this.title = newTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return String.format("%s - %s", this.getAuthor(), this.getTitle());
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Song other = (Song) obj;
        return this.getAuthor().equals(other.getAuthor()) && this.getTitle().equals(other.getTitle());
    }

}