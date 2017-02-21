/**
 * Created by FA on 2/19/2017.
 */

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.Before;

public class mancalaTest1 {

    /*
    private kalah kalahs;
    private pit pits;
    private player player1;
    private player player2;


    @Before
    public void setup(){
        kalahs = new kalah();
        pits = new pit(3);
        player1 = new player("John",true);
        player1 = new player("Tom",false);
    }

    @Test public void test1(){

    }
    */

    /*
    * We have used scenario 2.2 for our test here.
    * the second one of the two more mancala scenarios.
    * In the first step, the player moves just 1 pebble
    * into an empty pit, and hence gets the four pebbles in the opposite pit.*/
    @Test
    public void testOppositePit() throws Exception{
        pit start = new pit(1);               //this is the pit that the player decides to move the pebble from.
        pit next = new pit(0);
        start.setNext(next);
        pit opposite = new pit(4);
        next.setOpposite(opposite);
        kalah gain = new kalah(0);

        player temp = new player("temp",true);
        temp.takeOppositePebbles(next,gain);

        assertTrue(opposite.getStoneCnt() == 0);
        assertTrue(gain.getStoneCnt() == 4);
    }
}
