package crocLesson1410;

public class PlayerCD extends Player implements Insert{

    public PlayerCD(){
        super();
        this.supportedStorage = new Disk();
    }

    public void insertStorage(Storage newStorage) {
        if (newStorage instanceof Disk) {
            this.insertedStorage = newStorage;
        } else {
            this.insertedStorage = null;
        }
    }
}
