package dungeon;

import java.util.ArrayList;

public class DestructionCheck {
    
    private Player player;
    private ArrayList<Vampire> vampireList;
    private ArrayList<Vampire> destroyed;
    
    public DestructionCheck(Player player, ArrayList<Vampire> vampireList) {
        this.player = player;
        this.vampireList = vampireList;
        this.destroyed = new ArrayList<Vampire>();
    }

  
    
    public boolean isDestroyed() {
        for (Vampire vampire : vampireList) {
            if (vampire.getX()==this.player.getX() && vampire.getY()==this.player.getY()) {
                this.destroyed.add(vampire);
                return true;
            }
        }
        return false;
    }
    
    public void destroy() {
        this.vampireList.removeAll(this.destroyed);
    }
    
//    public void destroyEveryone() {
//        for (Vampire vampire : this.vampireList) {
//            if ()
//        }
//    }

}
