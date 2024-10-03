// abstract class Plant implementerar CalculatePlant interface
abstract class Plant implements CalculatePlant {

    // final vilket är ett exempel på inkapsling
    final double height;
    final String name;

    public Plant(double height, String name) {
        this.height = height;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    // Implementerar getMeasurmentType från CalculatePlant interface
    @Override
    public String getMeasurmentType() {
        return "liter";
    }

    // Implementerar getLiquidAmountMessage från CalculatePlant interface
    @Override
    public String getLiquidAmountMessage() {
        return name + " behöver " + getLiquidAmount() + " " + getMeasurmentType() + " " + getLiquidType().getDescription() + " per dag.";
    }
}
