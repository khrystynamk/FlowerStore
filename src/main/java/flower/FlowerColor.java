package flower;



public enum FlowerColor {

    RED("#FF0000"), BLUE("#0000FF"), BLACK("#FFFFFF"), PINK("#FF00A6 ");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
