/**
 * Created by FA on 2/17/2017. pit class
 */
public class pit {

    private int stoneCnt;

    public pit(int stones) {
        this.stoneCnt =stones;
    }

    public void addStone() {
        this.stoneCnt++;
    }

    public int removeStone() {
        if(this.stoneCnt>=1) {
            return this.stoneCnt--;
        }else{
            return 0;
        }
    }

    public int getStones() {
        return this.stoneCnt;
    }

}
