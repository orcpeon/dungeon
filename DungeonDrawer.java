package dungeon;

import java.util.ArrayList;

public class DungeonDrawer {

    private Player player;
    private ArrayList<Vampire> vampireList;
    private int height;
    private int length;

    public DungeonDrawer(Player player, ArrayList<Vampire> list, int length, int height) {
        this.player = player;
        this.vampireList = list;
        this.length = length;
        this.height = height;
    }

  
//    public void drawDungeon() {  //I've probably messed something up
//                                 // I fucking did
//        System.out.println(player);
//        for (Vampire vampire : this.vampireList) {
//            System.out.println(vampire);
//        }
//        System.out.println("");
//        for (int i = 0; i < this.height; i++) {
//
//            if (anyoneHere(i)) { //anyone on line Y?
//                String lineY = ""; //default lineY
//                ArrayList<String> lineList = new ArrayList<String>();
//                for (int y = 0; y < this.length; y++) {
//                    lineList.add(".");
//                }
//                if (!playerHere(i)) { //only vampires on the line
//                    for (Vampire vampire : this.vampireList) {  //changing "." in the arrayList to "v"
//                        if (vampire.getY() == i) {
//                            lineList.set(vampire.getX(), "v");
//                        }
//                    }
//                    for (String item : lineList) { //array to line
//                        lineY += item;
//                    }
//                    System.out.print(lineY); //printing the line
//                }
//
//                if (playerHere(i)) { //only player on the line
//                    lineList.set(player.getX(), "@");
//                    for (String item : lineList) { //array to line
//                        lineY += item;
//                    }
//                    System.out.print(lineY);
//                }
//
//                if (eveyoneHere(i)) { //both players and vampires on the line
//                    for (Vampire vampire : this.vampireList) {  //changing "." in the arrayList to "v"
//                        if (vampire.getY() == i) {
//                            lineList.set(vampire.getX(), "v");
//                        }
//                    }
//                    for (String item : lineList) { //array to line
//                        lineY += item;
//                    }
//                    lineList.set(player.getX(), "@");
//                    for (String item : lineList) { //array to line
//                        lineY += item;
//                    }
//                    System.out.println(lineY);
//                }
//
//            }
//            if (!anyoneHere(i)) {   //что я написал вообще
//                for (int j = 0; j < this.length; j++) {  //empty line Y
//                    System.out.print(".");
//                }
//            }s
//            System.out.println("");
//        }
//    }

    //-------------------------------------
    
    public void printGame() {
        System.out.println(player);
        for (Vampire vampire : this.vampireList) {
            System.out.println(vampire);
        }
        System.out.println("");
        for (int i=0;i<this.height;i++) {
            for (int j=0;j<this.length;j++) {
                if (player.getX()==j && player.getY()==i) {
                    System.out.print("@");
                } else if (anyVampires(i, j)) {
                    System.out.print("v");
                } else {
                    System.out.print(".");
                }                
            }
            System.out.println("");
        }
    }
    
    
//    public boolean eveyoneHere(int i) {
//        return (playerHere(i) && anyVampires(i));
//    }
//
//    public boolean anyoneHere(int i) {
//        return (this.player.getY() == i || anyVampires(i));
//    }

    public boolean playerHere(int i) {
        return this.player.getY() == i;
    }

    public boolean anyVampires(int i, int j) {
        for (Vampire vampire : this.vampireList) {
            if (vampire.getY() == i && vampire.getX() == j) {
                return true;
            }
        }
        return false;
    }

}
