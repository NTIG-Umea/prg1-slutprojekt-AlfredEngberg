import javax.swing.*;

public class GUI {
    private JPanel panel1;
    private JList Bs;
    private JList Weapon;
    private JList Target;
    private JButton Calculate;

    public GUI() {

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