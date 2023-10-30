import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Material> getMaterials(String pathName, List<MaterialType> automatedMaterials) {
        List<Material> materials = ReadFile.getMaterials(pathName);

        int iteration = 1;
        boolean running = true;
        while (running) {
            List<Material> nextMaterials = new ArrayList<Material>();
            for (int i = 0; i < materials.size(); i++) {
                if (materials.get(i).level != Level.RAW && !MaterialType.isContainedin(materials.get(i).type, automatedMaterials)) {
                    List<Material> m = materials.get(i).getCraftingMaterials();
                    for (int j = 0; j < m.size(); j++) {
                        nextMaterials.add(m.get(j));
                    }
                } else {
                    nextMaterials.add(materials.get(i));
                }
            }
            materials = Material.combine(nextMaterials);

            System.out.println("Iteration " + iteration++ + ": " + materials);

            boolean isAllDone = true;
            for (int i = 0; i < materials.size(); i++) {
                if (materials.get(i).level != Level.RAW && !MaterialType.isContainedin(materials.get(i).type, automatedMaterials)) {
                    isAllDone = false;
                }
            }
            running = (isAllDone) ? false : true;
        }

        return materials;
    }

    public static void main(String[] args) {
        List<Material> materials = getMaterials("./materials.csv", ReadFile.getAutomatedMaterials("./automatedMaterials.csv"));
        System.out.println("\nResult:");
        for (int i = 0; i < materials.size(); i++) {
            System.out.println(materials.get(i).toString());
        }
    }
}