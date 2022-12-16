package transport;

import java.util.Objects;

public class Sponsor <C extends Transport>{
    private final String name;
    private final Integer totalPay;


    public Sponsor(String name, Integer totalPay) {
        this.name = name;
        this.totalPay = totalPay;
    }

    public String getName() {
        return name;
    }

    public Integer getTotalPay() {
        return totalPay;
    }

    public void doSponsored(Transport car) {
        System.out.println("Спонсором для автомобиля " + car.getModel() + car.getBrand() + "\n" +
                "является " + name + " он проспонсировал автомобиль на сумму" + totalPay);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        if (name.equals(sponsor.name) && totalPay.equals(sponsor.totalPay)) {
            throw new RuntimeException("Не быть в гонке одинаковым спонсорам");
        }
        return name.equals(sponsor.name) && totalPay.equals(sponsor.totalPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalPay);
    }

    @Override
    public String toString() {
        return
                "Название спонсора - " + name + '\n' +
                "Сумма поддержки - " + totalPay;
    }
}
