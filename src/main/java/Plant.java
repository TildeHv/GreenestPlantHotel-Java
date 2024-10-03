abstract class Plant implements CalculatePlant {

    final double height;
    final String name;

    public Plant(double height, String name) {
        this.height = height;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getMeasurmentType() {
        return "liter";
    }

    @Override
    public String getLiquidAmountMessage() {
        return name + " behöver " + getLiquidAmount() + " " + getMeasurmentType() + " " + getLiquidType().getDescription() + " per dag.";
    }
}
