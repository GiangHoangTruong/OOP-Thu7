package Lab_1;

import javax.swing.JOptionPane;
public class Bai_1_ChooosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You have chosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
    System.exit(0);
    }
}
