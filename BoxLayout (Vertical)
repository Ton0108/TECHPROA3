import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("BoxLayout Vertical Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create panel
        JPanel panel = new JPanel();

        // Set BoxLayout with Y_AXIS (vertical stacking)
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add buttons
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));

        // Add panel to frame
        frame.add(panel);

        frame.setVisible(true);
    }
}
