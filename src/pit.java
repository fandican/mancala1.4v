/**
 * Created by FA on 2/17/2017. pit class
 */
public class pit {

    private int stoneCnt;
    public pit next;
    public pit opposite;

    public pit(int stoneCnt) {
        this.stoneCnt = stoneCnt;
    }

    public pit(int stoneCnt, pit next) {
        this.stoneCnt = stoneCnt;
        this.next = next;
    }

    public int getStoneCnt() {
        return stoneCnt;
    }

    public pit getNext() {
        return next;
    }

    public pit getOpposite() {
        return opposite;
    }

    public void setStoneCnt(int stoneCnt) {
        this.stoneCnt = stoneCnt;
    }

    public void setNext(pit next) {
        this.next = next;
    }

    public void setOpposite(pit opposite) {
        this.opposite = opposite;
    }

    public void addStones(int stones){
        this.stoneCnt += stones;
    }
}
