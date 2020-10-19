package crocLesson1410;

public class Device extends Player implements Insert {

    public Device() {
        super();
        insertedStorage = null;
        supportedStorage = new FlashDrive();
    }

    public void insertStorage(Storage newStorage) {
        if (newStorage instanceof FlashDrive) {
            this.insertedStorage = newStorage;
        } else {
            this.insertedStorage = null;
        }
    }

}
