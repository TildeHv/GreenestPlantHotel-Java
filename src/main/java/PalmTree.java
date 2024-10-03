public class PalmTree extends Plant {

    public PalmTree(double height, String name) {
        super(height, name);
    }

    @Override
    public double getLiquidAmount() {
        return 0.5 * getHeight();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

    @Override
    public String getName() {
        return name;
    }
}
