public class Cacti extends Plant {

    public Cacti(double height, String name) {
        super(height, name);
    }

    @Override
    public double getLiquidAmount() {
        return 2;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

    @Override
    public String getMeasurmentType() {
        return "cl";
    }

    @Override
    public String getName() {
        return name;
    }
}
