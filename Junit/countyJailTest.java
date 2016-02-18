package jacob.tracy.Junit;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * Created by jacobtracy on 11/20/15.
 */
public class countyJailTest {

    CountyJail Testjail;
    inmateBean Stalin, Hitler, Putin, Hamburgler;
    employeBean Roosevelt, Kennedy, Lincoln, Washington;

    @Before
    public void Begin() throws Exception {

        Testjail = new CountyJail();

        Stalin = new inmateBean("Joseph", "Stalin", 24, "B Wing", "24601", "D" );
        Hitler = new inmateBean("Adolf", "Hitler", 52, "C Wing", "2906783", "F" );
        Putin = new inmateBean("Vladimir", "Putin", 32, "Solitary", "1111111", "F" );
        Hamburgler = new inmateBean("The", "Hamburgler", 44, "Kitchen", "24601", "C" );


        Roosevelt = new employeBean("Theodore","Roosevelt",42,"Administration","34652" );
        Kennedy = new employeBean("John","Kennedy",29,"Weapons locker","22222222" );
        Lincoln = new employeBean("Abraham","Lincoln",38,"Training","43434343" );
        Washington = new employeBean("George","Washington",55,"Warden","0000001" );

    }

    @Test
    public void tryaddInmate () {

        Testjail.addInmate(Stalin);
        Testjail.addInmate(Hamburgler);
        Testjail.addInmate(Hitler);
        Testjail.addEmploye(Washington);

        int inmates = Testjail.getCount();
        //this is checking to see if you input the correct number of inmates
        assertEquals(3, inmates);

        //this repeats the last functions from above to see if it will overwrite or create new entries
        Testjail.addInmate(Putin);
        Testjail.addInmate(Hitler);
        Testjail.addEmploye(Roosevelt);
        Testjail.addEmploye(Lincoln);
        Testjail.addEmploye(Kennedy);
        inmates = Testjail.getCount();
        assertEquals(5, inmates);

        System.out.println();
        System.out.println("Add null");


        //adding a null value? what happens?
        try {
            Testjail.addInmate(null);
            inmates = Testjail.returnHashSize();
            assertNotEquals(5, inmates);
            //assertArrayEquals();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("remove null");
        System.out.println("This will not reduce the size of the hashmap, beacuse you can't remove a null. it does nothing");
        System.out.println();
        //what happens when we remove a null inmate
        try {
            Testjail.removeInmate(null);
            inmates = Testjail.returnHashSize();
            assertEquals(4, inmates);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("remove non existant");
        System.out.println("This will not reduce the size of the hashmap, there isn't a daryl in the hashmap, this checks to see if the size of the hashmap has changed");
        System.out.println();
        //what happens when we remove an inmate that does not exist?
        try {
            Testjail.removeInmate("Daryl");
            inmates = Testjail.returnHashSize();
            assertEquals(4, inmates);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("remove joseph Stalin, this removes joseph stalin from the hashmap");
        try {
            //Testjail.addInmate(Stalin);
            Testjail.removeInmate("Joseph");
            inmates = Testjail.returnHashSize();
            assertEquals(3, inmates);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hashmap size is now 3 inmates");

        //Check to see if there are any inmates in the jail
        assertTrue(Testjail.HasOccupants());

        assertNotSame("These two hashmaps are not the same in memory but they are the same in the size of the hashmap",
                Testjail.returnHashSize(), Testjail.returnEmployeeGroup());

        assertSame(Testjail.returnEmployeeGroup(), Testjail.returnEmployeeGroup());

    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void sillyTest4 () {
        Testjail.addNumber(-1,"Billy");

    }



    @Test
    public void sillyTest () {
        assertFalse("I am assuming this will fail as the test returns true", Testjail.HasOccupants());

        //this is auto fail whatever test it is associated with.
        //fail("This was autofailed becuase I wanted it to fail");
    }

    @Test
    public void testSpecialID () {
        try{
         CountyJail simpleTest = new CountyJail();
            Field specialID = CountyJail.class.getDeclaredField("privateId");
            specialID.setAccessible(true);
            String specID = (String)specialID.get(simpleTest);
            assertEquals("24601", specID);
            System.out.println();
            System.out.println("This reads the private variable in the countyJail class, and checks to see if it is the same that I excpect and passes.");

        } catch (NoSuchFieldException e){
                e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

