package AppControl;

/**
 * Created by jacobtracy on 3/18/16.
 */
import java.util.Scanner;

public class AppControlDemo {
    public static void main( String[] args ) throws InterruptedException {
        AppController frontController = new AppController();
        frontController.dispatchRequest("FIRST");
        System.out.println();
        frontController.dispatchRequest("SECOND");
        System.out.println();
        frontController.dispatchRequest("THIRD");
        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for testing the Appeture Page testing Unit");
        AppController app = new AppController();
        app.dispatchRequest(input.next());

    }
}

