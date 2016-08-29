import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests created by Sean Healy on 29-Aug-16.
 */


public class AdvertsTest {

    Adverts testAd;

    @Test
    public void getAdvertID() throws Exception {
        testAd = new Adverts();
        assertTrue(testAd.getAdvertID() == 0);
        assertFalse(testAd.getAdvertID() != 0);
    }

    @Test
    public void getTitle() throws Exception {
        testAd = new Adverts();
        testAd.setTitle("test");
        assertTrue(testAd.getTitle().equals("test"));
        assertFalse(!testAd.getTitle().equals("test"));

    }

    @Test
    public void setTitle() throws Exception {
        testAd = new Adverts();
        testAd.setTitle("test");
        assertTrue(testAd.getTitle().equals("test"));
        assertFalse(!testAd.getTitle().equals("test"));
    }

    @Test
    public void getDescription() throws Exception {

        testAd = new Adverts();
        testAd.setDescription("test description");
        assertTrue(testAd.getDescription().equals("test description"));
        assertFalse(!testAd.getDescription().equals("test description"));


    }

    @Test
    public void setDescription() throws Exception {
        testAd = new Adverts();
        testAd.setDescription("This is a test description");
        assertTrue(testAd.getDescription().equals("This is a test description"));
        assertFalse(!testAd.getDescription().equals("This is a test description"));

    }

    @Test
    public void getStartDate() throws Exception {
        testAd = new Adverts();
        testAd.setStartDate("24/08/2016");
        assertTrue(testAd.getStartDate().equals("24/08/2016"));
        assertFalse(!testAd.getStartDate().equals("24/08/2016"));

    }

    @Test
    public void setStartDate() throws Exception {
        testAd = new Adverts();
        testAd.setStartDate("24/08/2016");
        assertTrue(testAd.getStartDate().equals("24/08/2016"));
        assertFalse(!testAd.getStartDate().equals("24/08/2016"));

    }

    @Test
    public void getEndDate() throws Exception {
        testAd = new Adverts();
        testAd.setEndDate("31/08/2016");
        assertTrue(testAd.getEndDate().equals("31/08/2016"));
        assertFalse(!testAd.getEndDate().equals("31/08/2016"));

    }

    @Test
    public void setEndDate() throws Exception {
        testAd = new Adverts();
        testAd.setEndDate("31/08/2016");
        assertTrue(testAd.getEndDate().equals("31/08/2016"));
        assertFalse(!testAd.getEndDate().equals("31/08/2016"));

    }

}