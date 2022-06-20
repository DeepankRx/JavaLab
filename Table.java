import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table {
    public static void main(String args[]) {
        SwingGui s = new SwingGui();
    }
}
class SwingGui extends JFrame {

    String[] countries = {"Afghanistan", "India","Pakistan","China","Japan"};
    String[] capitals = {"Kabul","New Delhi","Islamabad","Beijing","Tokyo"};
    JComboBox countryList = new JComboBox(countries);
    JComboBox capitalList = new JComboBox(capitals);
    JLabel result = new JLabel("");
    public SwingGui() {
       ActionListener actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {
               
                int index = countryList.getSelectedIndex();
                int index2 = capitalList.getSelectedIndex();
                if (index >= 0) {
                  
                if(index == index2) {
                    result.setText("Yes");
                } 
                else {
                    result.setText("No");
                } 
                }
              }
        };
        countryList.addActionListener(actionListener);
        capitalList.addActionListener(actionListener);
        JPanel panel = new JPanel();
        panel.add(countryList);
        panel.add(capitalList);
        panel.add(result);
        add(panel);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}