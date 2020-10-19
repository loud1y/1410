package crocLesson1410;

import crocLesson1410.Player;

public class Gramophone extends Player implements Insert {

    public Gramophone() {
        super();
        insertedStorage = null;
        supportedStorage = new Plate();
    }

    public void insertStorage(Storage newStorage) {
        if (newStorage instanceof Plate) {
            this.insertedStorage = newStorage;
        } else {
            this.insertedStorage = null;
        }
    }
}
