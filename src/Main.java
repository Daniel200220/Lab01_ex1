import javax.swing.*;

public class Main {
    private static JOptionPane JOptionPaneptionPane;

    public static void main(String[] args) {
        JOptionPaneptionPane.showMessageDialog (null, "Gandeste-te la un numar aleator de la 1 la 10");
        JOptionPaneptionPane.showMessageDialog (null, "Numărul este " + (1 + (int) (Math.random () * 10))+" ?");
    }
}