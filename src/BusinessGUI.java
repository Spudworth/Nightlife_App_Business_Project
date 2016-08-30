import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Sean Healy on 30-Aug-16.
 */
public class BusinessGUI extends JFrame implements ActionListener {

    private Container cPane;
    private JTextArea textArea;
    private JButton createButton;
    private JButton amendButton;
    private JButton deleteButton;
    private JButton displayButton;
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

        displayButton = new JButton("Display Advert");
        cPane.add(displayButton);
        displayButton.addActionListener(this);

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
            displayAdvert();
            deleteAdvert();
        }
        else if(actionEvent.getActionCommand().equals("Display Advert")){
            displayAdvert();
        }

    }

    private void deleteAdvert() {

        if(exampleAdvert.getIsActive() == true){

           if(JOptionPane.showConfirmDialog(null,"Are you sure?","Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
               exampleAdvert.setActive(false);
               System.exit(0);
           }
           else
               System.exit(0);
        }
        else
            JOptionPane.showMessageDialog(null, "No advert to delete", "No Advert", JOptionPane.ERROR_MESSAGE);

        System.exit(0);

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
             System.exit(0);
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

    private void displayAdvert(){
        textArea = new JTextArea();
        textArea.append(exampleAdvert.toString());
        cPane.add(textArea);
        cPane.revalidate();
        cPane.repaint();
    }

}
