import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class GUI {
    private JPanel panel1;
    private JList Jlist1;
    private JList Weapon;
    private JList Target;
    private JButton Calculate;
    private JSpinner Jspinner1;

    public GUI() {
        String[] vapen = {"Lasgun", "Bolt Gun", "Las Cannon"};
        String[] target = {"Space Marine", "Guardsmen", "Ork Boy"};

        Weapon.addElement("Lasgun");

        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = (Integer) Jspinner1.getValue();
                main.Hits(a, 4/6);

                int Strength = 4;
                int Toughness = 3;

                double toWound = main.towound(Strength, Toughness);

                System.out.println(toWound);
            }
        });
        Weapon.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                vapen SelectedWeapon = (vapen) Weapon.getSelectedValue();
                System.out.println("bytte");
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