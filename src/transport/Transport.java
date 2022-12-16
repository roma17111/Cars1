package transport;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        if (brand.equals(transport.brand) && model.equals(transport.model)) {
            throw new UnsupportedOperationException("Одинаковых машин быть не должно.");
        }
        return brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
