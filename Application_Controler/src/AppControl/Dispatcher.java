package AppControl;

/**
 * Created by jacobtracy on 3/18/16.
 */
public class Dispatcher {
    private FirstPage  first;
    private SecondPage second;
    private ThirdPage  third;

    public Dispatcher()
    {
        first = new FirstPage();
        second = new SecondPage();
        third = new ThirdPage();
    }

    public void dispatch( String request ) throws InterruptedException {
        if( request.equalsIgnoreCase("FIRST") )
        {
            first.show();
        }
        else if( request.equalsIgnoreCase("SECOND") )
        {
            second.show();
        }
        else
        {
            third.show();
        }
    }
}
