
import javax.swing.*;
public class B225 {
    public static void main(String[] args) {
        String a, b;
        a = JOptionPane.showInputDialog(null, "Input the first number:", JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Input the second number:",JOptionPane.INFORMATION_MESSAGE);
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        String str = "Your input is: " + x + " and " + y + "\n";
        str += "Sum: " + (x + y) +  "\nDifference: " + (x - y) + "\nProduct: " + (x * y) + "\nDivision: ";
        if (y != 0) str += (x / y);
        else str += "empty";
        JOptionPane.showMessageDialog(null, str, "Answer", JOptionPane.INFORMATION_MESSAGE);
    }
}
