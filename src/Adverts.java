import javax.swing.*;

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
    private boolean isSponsored = false;


    public Adverts(Integer advertID, String title, String description, String startDate, String endDate, Boolean isActive, Boolean isSponsored){

        setAdvertID(advertID);
        setTitle(title);
        setDescription(description);
        setStartDate(startDate);
        setEndDate(endDate);
        setActive(isActive);
        setSponsored(isSponsored);
    }

    public Adverts() {
        this(0,"No title","No description","No start date","no end date",false,false);

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
    public boolean getIsActive() {
        return isActive;
    }
    public boolean getIsSponsored() {
        return isSponsored;
    }

    public void setSponsored(boolean sponsored) {
        isSponsored = sponsored;
    }

    @Override
    public String toString() {
        return
                "advertID = " + advertID + '\n' +
                " title = '" + title + '\n' +
                " description = '" + description + '\n' +
                " startDate = '" + startDate + '\n' +
                " endDate = '" + endDate + '\n' +
                " isActive = " + isActive+ '\n' +
                "IsSponsored =" + isSponsored;
    }

    public void createAdvert() {

        nextID(getAdvertID());
        setTitle(JOptionPane.showInputDialog("Please enter advert title"));
        setDescription(JOptionPane.showInputDialog("Please enter advert description"));
        setStartDate(JOptionPane.showInputDialog("Please enter advert start date (DD/MM/YY)"));
        setEndDate(JOptionPane.showInputDialog("Please enter advert end date (DD/MM/YY)"));
        setActive(true);
        if(JOptionPane.showConfirmDialog(null,"Would you like to sponsor your advert for extra reach?","Sponsorship",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
            String creditCardNo = JOptionPane.showInputDialog("Please enter your credit card number");
            if (creditCardNo.matches("[0-9]+") && creditCardNo.length() == 16) {
                setSponsored(true);
            } else
                JOptionPane.showMessageDialog(null, "Invalid entry!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            System.exit(0);

    }

    public void amendAdvert() {

        String newTitle;
        String newDescription;
        String newStartDate;
        String newEndDate;
        if (getIsActive() == true){

            newTitle = JOptionPane.showInputDialog("Please enter amended advert title");
            if(!newTitle.equals(getTitle()) && !newTitle.equals("")){
                setTitle(newTitle);
            }

            newDescription = JOptionPane.showInputDialog("Please enter amended advert description");
            if(!newDescription.equals(getDescription()) && !newDescription.equals("")){
                setDescription(newDescription);
            }

            newStartDate = JOptionPane.showInputDialog("Please enter amended advert start date (DD/MM/YY)");
            if(!newStartDate.equals(getStartDate()) && !newStartDate.equals("")){
                setStartDate(newStartDate);
            }

            newEndDate = JOptionPane.showInputDialog("Please enter amended advert end date (DD/MM/YY)");
            if(!newEndDate.equals(getEndDate()) && !newEndDate.equals("")){
                setEndDate(newEndDate);
            }

            if(JOptionPane.showConfirmDialog(null,"Would you like to sponsor your advert for extra reach?","Sponsorship",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_OPTION
                    && getIsSponsored() == false) {
                String creditCardNo = JOptionPane.showInputDialog("Please enter your credit card number");
                if (creditCardNo.matches("[0-9]+") && creditCardNo.length() == 16) {
                    setSponsored(true);
                } else
                    JOptionPane.showMessageDialog(null, "Invalid entry!", "Error", JOptionPane.ERROR_MESSAGE);
            }


        }

        else
        {
            JOptionPane.showMessageDialog(null, "No advert to amend", "No Advert", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void removeAdvert() {
        if(getIsActive() == true){

            if(JOptionPane.showConfirmDialog(null,"Are you sure?","Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                setActive(false);
                System.exit(0);
            }
            else
                System.exit(0);
        }
        else
            JOptionPane.showMessageDialog(null, "No advert to delete", "No Advert", JOptionPane.ERROR_MESSAGE);

        System.exit(0);
    }
}
