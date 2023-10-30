import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;

public class WriteFile implements ActionListener {
    String pathName;
    JTextField textField;
    MaterialType material;

    public WriteFile(JTextField textField, String pathName, MaterialType material) {
        this.pathName = pathName;
        this.textField = textField;
        this.material = material;
    }

    private void writeToFile() {
        List<String> oldFile = ReadFile.getLines(pathName);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathName));
            for (int i = 0; i < MaterialType.values().length; i++) {
                if (material.equals(MaterialType.values()[i])) {
                    System.out.println("Write: " + material.toString() + "," + textField.getText());
                    writer.write(material.toString() + "," + textField.getText());
                } else {
                    writer.write(oldFile.get(i));
                }
            }
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Integer.parseInt(textField.getText());
        } catch (NumberFormatException n) {
            System.err.println(e);
            return;
        }
        writeToFile();
    }
}
