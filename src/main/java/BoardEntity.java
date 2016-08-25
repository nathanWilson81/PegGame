/**
 * Created by Nathan on 8/24/2016.
 */
public class BoardEntity {
    public final int UNUSABLE = 0;
    public final int TAKEN = 1;
    public final int OPEN = 2;

    private int status;
    private int xLocation;
    private int yLocation;

    public BoardEntity(int initStatus, int xLoc, int yLoc) {
        status=initStatus;
        xLocation = xLoc;
        yLocation = yLoc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getxLocation() {
        return xLocation;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }
}
