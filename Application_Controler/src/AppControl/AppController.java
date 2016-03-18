package AppControl;



/**
 * Created by jacobtracy on 3/18/16.
 */
public class AppController {
    private Dispatcher dispatcher;

    public AppController()
    {
        dispatcher = new Dispatcher();
    }

    private boolean isPageRequested()
    {
        //here you have to write Authentication logic
        System.out.println("The page was requested successfully.");
        return true;
    }

    private void trackRequest( String request )
    {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest( String request ) throws InterruptedException {
        // log each request
        trackRequest(request);
        // authenticate the user
        if( isPageRequested() )
        {
            dispatcher.dispatch(request);
        }
    }
}
