package dungeon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.height = height;
        this.length = length;
        this.moves = moves;
        this.vampires = vampires;
        this.vampiresMove = vampiresMove;
    }

    public void run() {
        Scanner reader = new Scanner(System.in);
        Player player = new Player(reader, this.length - 1, this.height - 1);  //create player
        ArrayList<Vampire> vampireList = new ArrayList<Vampire>(); //create vampires        
        Random random = new Random();
        for (int i = 0; i < this.vampires; i++) {
            vampireList.add(new Vampire(random.nextInt(this.length), random.nextInt(this.height), this.length - 1, this.height - 1));
        }
        DungeonDrawer drawer = new DungeonDrawer(player, vampireList, this.length, this.height); //new DungeonDrawer
        DestructionCheck destructor = new DestructionCheck(player, vampireList); 
        for (int turnsPassed = 0; turnsPassed <= this.moves; turnsPassed++) { 
            if (turnsPassed == this.moves) {
                System.out.println("YOU LOSE");
                break;
            }
            System.out.println(this.moves - turnsPassed);
            System.out.println("");
            drawer.printGame();
            System.out.println("");

            String path = reader.nextLine();
            for (int i = 0; i < path.length(); i++) { //move execution
                player.movePlayer(path.charAt(i));
                if (destructor.isDestroyed()) {
                    destructor.destroy();
                }
                if (this.vampiresMove) {
                    moveVampires(vampireList);
                    if (destructor.isDestroyed()) {
                        destructor.destroy();
                    }
                }
            }
            if (vampireList.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            }

        }
    }

    public void moveVampires(ArrayList<Vampire> list) {
        for (Vampire vampire : list) {
            vampire.moveVampire(list);
        }
    }

//    public void createActors() {
//        Scanner reader = new Scanner(System.in);
//        Player player = new Player(reader, this.length - 1, this.height - 1);
//        ArrayList<Vampire> vampireList = new ArrayList<Vampire>();
//        Random random = new Random();
//        for (int i = 0; i < this.vampires; i++) {
//            vampireList.add(new Vampire(random.nextInt(this.length), random.nextInt(this.height), this.length - 1, this.height - 1));
//        }
//    }
}
