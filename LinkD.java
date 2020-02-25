package algorithm.fun;


public class LinkD {

    public long dData;
    public LinkD next;
    public LinkD prev;

    public LinkD(long dD) {
        dData = dD;
    }

    public void displayLink() {
        System.out.println(" " + dData);
    }
}
