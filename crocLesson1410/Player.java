package crocLesson1410;

public class Player implements Insert {

    Storage insertedStorage;
    Storage supportedStorage;

    public Player() {
        this.insertedStorage = null;
    }

    public Storage getInsertedStorage() {
        return this.insertedStorage;
    }

    public Storage getSupportedStorage() {
        return this.supportedStorage;
    }

    public void removeStorage() {
        this.insertedStorage = null;
    }

    public String toString() {
        return String.format("%s", this.getClass().getCanonicalName().substring(15));
    }

    public String getStatus() {
        return String.format("the %s inserted, current song: %s", this.insertedStorage.toString(), this.insertedStorage.getCurrentSong().toString());

    }


    @Override
    public void insertStorage(Storage newStorage) {
    }
}
