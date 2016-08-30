/**
 * Created by Sean Healy on 29-Aug-16.
 */

public class Adverts {

    private int advertID;
    private String title;
    private String description;
    private String startDate;
    private String endDate;
    private boolean isActive = false;


    public Adverts(String title, String description, String startDate, String endDate){

        setTitle(title);
        setDescription(description);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public Adverts() {
        this("No title","No description","No start date","no end date");

    }

    public void setAdvertID(int advertID) {
        this.advertID = advertID;
    }

    public int getAdvertID() {
        return advertID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void nextID(Integer nextID){

        nextID = advertID;
        nextID++;
        setAdvertID(nextID);
    }
    public void setActive(boolean active) {
        isActive = active;
    }

 }
