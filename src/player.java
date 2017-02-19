/**
 * Created by FA on 2/17/2017.
 */
public class player {
    private String name;
    private String turn;

    public player() {
        name=null;
        turn=null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

}
