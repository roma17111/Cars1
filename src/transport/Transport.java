package transport;

public abstract class Transport {
    private final String brand;
    private final String model;


    public Transport(String brand, String model) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "NO NAME";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "Default";
        } else {
            this.model = model;
        }

    }




    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
