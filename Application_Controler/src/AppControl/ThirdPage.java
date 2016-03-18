package AppControl;

/**
 * Created by jacobtracy on 3/18/16.
 */
public class ThirdPage{
    public void show() throws InterruptedException {
        System.out.println("Displaying Third Page");
        System.out.println();

        GladOs glad = new GladOs();

        Thread Gladosthread = new Thread(glad);

        Gladosthread.start();
        Gladosthread.sleep(1000);
    }
}
