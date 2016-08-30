import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sean Healy on 30-Aug-16.
 */
public class BusinessGUI extends JFrame implements ActionListener {

    private Container cPane;
    private JPanel backImg;
    private JButton createButton;
    private JButton amendButton;
    private JButton deleteButton;
    Adverts exampleAdvert;

    public BusinessGUI(){

        setTitle("Nightlife Business Application");
        setSize(500,500);
        setLocation(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane = getContentPane();
        setLayout(new FlowLayout());

        createButtonMenu();
    }

    public void createButtonMenu(){
        createButton = new JButton("Create Advert");
        cPane.add(createButton);
        createButton.addActionListener(this);

        amendButton = new JButton("Amend Advert");
        cPane.add(amendButton);
        amendButton.addActionListener(this);

        deleteButton = new JButton("Delete Advert");
        cPane.add(deleteButton);
        deleteButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getActionCommand().equals("Create Advert")){
            inputAdvertInfo();
        }
        else if (actionEvent.getActionCommand().equals("Amend Advert")){
            getAndAmendInfo();
        }
        else if(actionEvent.getActionCommand().equals("Delete Advert")){
            getAndAmendInfo();
            deleteAdvert();
        }

    }

    private void deleteAdvert() {

    }

    private void getAndAmendInfo() {

        if (exampleAdvert.getIsActive() == true){

            exampleAdvert.setTitle(JOptionPane.showInputDialog("Please enter amended advert title"));
            exampleAdvert.setDescription(JOptionPane.showInputDialog("Please enter amended advert description"));
            exampleAdvert.setStartDate(JOptionPane.showInputDialog("Please enter amended advert start date (DD/MM/YY)"));
            exampleAdvert.setEndDate(JOptionPane.showInputDialog("Please enter amended advert end date (DD/MM/YY)"));
        }

        else
         {
            JOptionPane.showMessageDialog(null, "No advert to amend", "No Advert", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void inputAdvertInfo() {

        exampleAdvert = new Adverts();
        exampleAdvert.nextID(exampleAdvert.getAdvertID());
        exampleAdvert.setTitle(JOptionPane.showInputDialog("Please enter advert title"));
        exampleAdvert.setDescription(JOptionPane.showInputDialog("Please enter advert description"));
        exampleAdvert.setStartDate(JOptionPane.showInputDialog("Please enter advert start date (DD/MM/YY)"));
        exampleAdvert.setEndDate(JOptionPane.showInputDialog("Please enter advert end date (DD/MM/YY)"));
        exampleAdvert.setActive(true);

    }
}
