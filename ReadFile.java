import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Material> getMaterials(String pathName) {
        List<Material> materials = new ArrayList<Material>();
        List<String> lines = getLines(pathName);

        for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            int amount = Integer.parseInt(parts[1]);
            if (amount > 0) {
                materials.add(new Material(MaterialType.valueOf(parts[0]), amount));
            }
        }
        return Material.combine(materials);
    }

    public static List<MaterialType> getAutomatedMaterials(String pathName) {
        List<String> lines = getLines(pathName);
        List<MaterialType> materials = new ArrayList<MaterialType>();
        for (int i = 0; i < lines.size(); i++) {
            materials.add(MaterialType.valueOf(lines.get(i)));
        }
        return materials;
    }

    public static List<String> getLines(String pathName) {
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathName));
            String line = br.readLine();
            while (line != null) {
                lines.add(line.toUpperCase());
                line = br.readLine();
            }
                
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        }
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, lines.get(i).trim());
        }
        return lines;
    }

    public static void main(String[] args) {
        List<Material> materials = getMaterials("./materials.csv");
        for (int i = 0; i < materials.size(); i++) {
            System.out.println(materials.get(i).toString());
        }
    }
}