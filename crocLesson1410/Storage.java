package crocLesson1410;

public class Storage {

    Song currentSong;


    public Storage() {
        this.currentSong = null;
    }

    public Storage(Song newSong) {
        this.currentSong = newSong;
    }

    public Song getCurrentSong() {
        return this.currentSong;
    }

    public void rewriteSong(Song newSong) {
        this.currentSong = newSong;
    }

    public String toString() {
        return String.format("%s", this.getClass().getCanonicalName().substring(15)); //ужасные костыли, спрошу потом у Вас, как получить название класса нормально))))
    }

}
