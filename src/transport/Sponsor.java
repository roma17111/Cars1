package transport;

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
    public String toString() {
        return
                "Название спонсора - " + name + '\n' +
                "Сумма поддержки - " + totalPay;
    }
}
