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

        //createButton();
        cPane.add(createButton);
        cPane.add(amendButton);
        cPane.add(deleteButton);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
