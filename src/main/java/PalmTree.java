// PalmTree-klassen ärver av Plant-klassen, exempel av både arv och polymorfism
public class PalmTree extends Plant {

    public PalmTree(double height, String name) {
        super(height, name);
    }

    // Implementerar getLiquidAmount från CalculatePlant interface
    @Override
    public double getLiquidAmount() {
        return 0.5 * getHeight();
    }

    // Implementerar getLiquidType från CalculatePlant interface
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }

    // Implementerar getName från CalculatePlant interface
    @Override
    public String getName() {
        return name;
    }
}
