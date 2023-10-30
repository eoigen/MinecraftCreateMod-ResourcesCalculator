import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI {
    private JFrame frame;

    private JLabel[] labels;
    private JTextField[] inputs;

    private String pathToWriteName = "./materials.csv";
    
    public GUI() {
        frame = new JFrame("CREATE - Material Planner");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JPanel panel = createPanel();
        frame.add(BorderLayout.CENTER, new JScrollPane(panel));
        frame.setSize(800,800);
        frame.setVisible(true);
    }

    public JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(MaterialType.values().length, 2, 10, 10));
        addComponentsToPanel(panel);
        return panel;
    }

    private void addComponentsToPanel(JPanel panel) {
        labels = new JLabel[MaterialType.values().length];
        inputs = new JTextField[MaterialType.values().length];
        for (int i = 0; i < MaterialType.values().length; i++) {
            labels[i] = new JLabel();
            labels[i].setText(MaterialType.values()[i].toString());
            panel.add(labels[i]);

            inputs[i] = new JTextField(20);
            panel.add(inputs[i]);
            inputs[i].addActionListener(new WriteFile(inputs[i], pathToWriteName, MaterialType.valueOf(labels[i].getText())));
        }
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}
