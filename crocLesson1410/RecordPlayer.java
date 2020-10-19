package crocLesson1410;

public class RecordPlayer extends Player implements Insert {

    public RecordPlayer() {
        super();
        insertedStorage = null;
        supportedStorage = new Cassete();
    }

    public void insertStorage(Storage newStorage) {
        if (newStorage instanceof Cassete) {
            this.insertedStorage = newStorage;
        } else {
            this.insertedStorage = null;
        }
    }

}
