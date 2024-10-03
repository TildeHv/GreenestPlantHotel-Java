public class CarnivorousPlant extends Plant {

    public CarnivorousPlant(double height, String name) {
        super(height, name);
    }

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
