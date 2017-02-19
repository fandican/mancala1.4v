/**
 * Created by FA on 2/19/2017.
 */

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.Before;

public class mancalaTest {

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
}
