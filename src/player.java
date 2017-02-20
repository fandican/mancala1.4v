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
}
