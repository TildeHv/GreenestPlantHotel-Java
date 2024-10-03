// CarnivorousPlant-klassen ärver av Plant-klassen, exempel av både arv och polymorfism
public class CarnivorousPlant extends Plant {

    public CarnivorousPlant(double height, String name) {
        super(height, name);
    }

    // Implementerar getLiquidAmount från CalculatePlant interface, också polymorfism
    @Override
    public double getLiquidAmount() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }

    @Override
    public String getName() {
        return name;
    }
}
