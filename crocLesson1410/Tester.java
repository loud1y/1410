package crocLesson1410;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void show(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.printf("\n%d: %s", i, objects[i].toString());
        }
        System.out.println();
    }


    public static void main(String[] args) {

        //создаём песню, записываем её на диск, запускаем через МП3 плеер
//        Storage disk1 = new Disk();
//        Storage cassete1 = new Cassete();
//        Song rock1 = new Song("New Politics", "Yeah Yeah Yeah");
//        disk1.rewriteSong(rock1);
//        Player toshiba = new PlayerCD();
//        toshiba.insertStorage(disk1);
//        System.out.printf("%s\n", toshiba.toString());
//        toshiba.removeStorage();
//        toshiba.insertStorage(cassete1);
//        System.out.print(toshiba.getInsertedStorage());


        Song[] songs = {
                new Song("New Politics", "Yeah Yeah Yeah"),
                new Song("New Politics", "Dignity"),
                new Song("Foreign Air", "The Apartment"),
                new Song("The Bee Gees", "Stayin' Alive"),
                new Song("Muse", "Black Black Heart"),
                new Song("Wham!", "Last Christmas"),
                new Song("Coldplay", "Paradise"),
                new Song("The Prodigy", "Smack My Bitch Up"),
                new Song("a-ha", "Take on Me"),
                new Song("Moby", "NaturalBlues")
        };

        Storage[] storages = {
                new Cassete(),
                new Disk(),
                new FlashDrive(),
                new Plate()
        };

        Player[] players = {
                new Device(),
                new Gramophone(),
                new PlayerCD(),
                new RecordPlayer()
        };

        Scanner in = new Scanner(System.in);
        byte command = 0, songIndex, storageIndex, playerIndex;
        System.out.printf("\n\n\n\nСейчас будет много текста, поэтому консоль лучше развернуть\n\n\n\n");
        do {
            System.out.printf("\n0 - kill program, 1 - write song on a storage, 2 - insert storage into player, 3 - play, 4 - check all players");
            System.out.printf("\nEnter command: ");
            command = in.nextByte();

            switch (command) {
                case 1:
                    System.out.printf("\nChoose song: ");
                    show(songs);
                    songIndex = in.nextByte();
                    System.out.printf("\nChoose storage: ");
                    show(storages);
                    storageIndex = in.nextByte();
                    storages[storageIndex].rewriteSong(songs[songIndex]);
                    System.out.printf("\nDone!\n");
                    break;
                case 2:
                    System.out.printf("\nChoose storage: ");
                    show(storages);
                    storageIndex = in.nextByte();
                    System.out.printf("\nChoose player: ");
                    show(players);
                    playerIndex = in.nextByte();
                    players[playerIndex].insertStorage(storages[storageIndex]);
                    System.out.printf("\nDone!\n");
                    break;
                case 3:
                    System.out.printf("\nChoose player: ");
                    show(players);
                    playerIndex = in.nextByte();
                    if (players[playerIndex].getInsertedStorage() == null) {
                        System.out.printf("\nThe storage You've tried to insert in %s not supported\nTry again!\n", players[playerIndex].toString());
                    } else {
                        System.out.printf("\n%s\n", players[playerIndex].getStatus());
                    }
                    break;
                case 4:
                    for (byte i = 0; i < players.length; i++) {
                        if (players[i].getInsertedStorage() == null) {
                            System.out.printf("\nEmpty %s", players[i].toString());
                        } else {
                            System.out.printf("\n%s", players[i].getStatus());
                        }
                    }
                    System.out.println();
            }

        } while (command != 0);
    }
}
