import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JPanel rootPanel;
    public static void main(String args[])
    {
       SwingInJava obj = new SwingInJava();
    }


}
class SwingInJava extends JFrame
{
    JTextField t1;
    JTextField t2;
    JButton btn;
    JLabel l1;
    SwingInJava()
    {
        t1 = new JTextField("");
        t1.setSize(200,200);

        t2 = new JTextField("");

        btn = new JButton("Add");
        l1 = new JLabel("Result :");
        add(t1);
        add(t2);
        add(btn);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                Integer sum = a + b;
                l1.setText(sum.toString());
            }
        };
        btn.addActionListener(al);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400,400);

    }
}
