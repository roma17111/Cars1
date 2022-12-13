package transport;

public enum CategoryDrivers {
    CATEGORY_B("B"),
    CATEGORY_C("C"),
    CATEGORY_D("D");

    private final String category;

    CategoryDrivers(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
