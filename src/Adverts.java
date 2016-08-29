/**
 * Created by X99-A on 29-Aug-16.
 */
import java.util.*;
public class Adverts {



    private int advertID;
    private String title;
    private String [] description;
    private Date startDate;
    private Date endDate;


    public Adverts(String title, String[] description, Date startDate, Date endDate){

        setTitle(title);
        setDescription(description);
        setStartDate(startDate);
        setEndDate(endDate);
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

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

 }
