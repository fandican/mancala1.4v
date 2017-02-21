/**
 * Created by FA on 2/17/2017.
 */
public class player {
    private String name;
    private Boolean turn;

    public player(String name,Boolean turn) {
        this.name = name;
        this.turn=turn;
    }

    public String getName() {
        return name;
    }

    public Boolean getTurn() {
        return turn;
    }

    public void setTurn(Boolean turn) {
        this.turn = turn;
    }

    /*
    * This method takes a pit(end) and a kalah(gain) as input,
    * Then it will move all the pebbles from the pit opposite to
    * the given pit(end) and put them in the given kalah.
    * It will finally return the current pit(end)*/
    public pit takeOppositePebbles(pit end, kalah gain){
        gain.addStones(end.opposite.takeAllStones());
        return end;
    }

    /*
    * This method takes a pit(start) as input.
    * then empties all the pebbles in the pit,
    * and redistributes them one by one to other pits,
    * using subsequent next references.*/
    public void reDistributeCounterclockwise(pit start){
        int count = start.takeAllStones();           //take all the pebbles in this pit.

        for(int i=0; i< count ; i++){
            start = start.next;                  //go to the next pit from start and put 1 stone there.
            start.addStones(1);           //
        }
    }

}













