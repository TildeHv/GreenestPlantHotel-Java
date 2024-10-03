import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    final List<CalculatePlant> plantList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    private void menu() {

        plantList.add(new Cacti(0.2, "Igge"));
        plantList.add(new CarnivorousPlant(0.7, "Meatloaf"));
        plantList.add(new PalmTree(5, "Laura"));
        plantList.add(new PalmTree(1, "Olof"));

        while (true) {
            String whatPlant = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            CalculatePlant selectedPlant = getPlant(plantList, whatPlant);

            if (whatPlant == null || whatPlant.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Du behöver skriva något.");
            } else {
                if (selectedPlant != null) {
                    JOptionPane.showMessageDialog(null, selectedPlant.getLiquidAmountMessage());
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Du behöver skriva Igge, Meatloaf, Laura eller Olof.");
                }
            }
        }
    }

    private CalculatePlant getPlant(List<CalculatePlant> plantList, String whatPlant) {
        for (CalculatePlant plant : plantList) {
            if (plant.getName().equalsIgnoreCase(whatPlant)) {
                return plant;
            }
        }
        return null;
    }
}


