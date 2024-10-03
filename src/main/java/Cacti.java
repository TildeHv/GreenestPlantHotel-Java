// Cacti-klassen ärver av Plant-klassen, exempel av både arv och polymorfism
public class Cacti extends Plant {

    public Cacti(double height, String name) {
        super(height, name);
    }

    // Implementerar getLiquidAmount från CalculatePlant interface
    @Override
    public double getLiquidAmount() {
        return 2;
    }

    // Implementerar getLiquidType från CalculatePlant interface
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }

    // Implementerar getMeasurmentType från CalculatePlant interface
    @Override
    public String getMeasurmentType() {
        return "cl";
    }

    // Implementerar getName från CalculatePlant interface
    @Override
    public String getName() {
        return name;
    }
}
