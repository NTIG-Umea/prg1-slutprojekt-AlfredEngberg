import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panel1;
    private JList Jlist1;
    private JList Weapon;
    private JList Target;
    private JButton Calculate;
    private JSpinner Jspinner1;

    public GUI() {

        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = (Integer) Jspinner1.getValue();
                main.Hits(a, 4/6);

                int Strength;
                int Toughness;

                main.towound();
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        GUI gui = new GUI();
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}