public enum LiquidType {

    TAP_WATER("kranvatten"),
    MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck"),;

    final String description;

    LiquidType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
