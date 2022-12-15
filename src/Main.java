import transport.*;
import transport.CategoryDrivers;

import javax.swing.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Passengercar passengercar1 = new Passengercar("Феррари", "Enszo",
                4.7, Passengercar.CarBodyType.SEDAN_CAR);


        Passengercar passengercar2 = new Passengercar("Паганни",
                "Зонда", 4.5, Passengercar.CarBodyType.SEDAN_CAR);
        Passengercar passengercar3 = new Passengercar("Бугатти", "veron supersport", 5.2,
                Passengercar.CarBodyType.SEDAN_CAR);
        Passengercar passengercar4 = new Passengercar(null,
                "supersport", 4.2, Passengercar.CarBodyType.SEDAN_CAR);
        passengercar1.race();
        Bus bus1 = new Bus("Mersedes", "b-class", 2.4, Bus.Capacity.LARGE);
        Bus bus2 = new Bus("volvo", "class1", 1.4, Bus.Capacity.MEDIUM);
        Bus bus3 = new Bus("Mersedes", null, 2.3, Bus.Capacity.SMALL);
        Bus bus4 = new Bus("икарус", null, 4.3, Bus.Capacity.MEDIUM);


        Lorrycar lorrycar1 = new Lorrycar("Hunday", null, 3.3, Lorrycar.Weight.N1);
        Lorrycar lorrycar2 = new Lorrycar("infiniti", null, 4.3, Lorrycar.Weight.N2);
        Lorrycar lorrycar3 = new Lorrycar("Камаз", null, 6.3, Lorrycar.Weight.N1);
        Lorrycar lorrycar4 = new Lorrycar(null, null, 6.3, Lorrycar.Weight.N3);
        lorrycar1.race();

        Driver<Passengercar> driver = new Driver("Семёнов артём анатольевич",
                true, 21, CategoryDrivers.CATEGORY_B);
        Driver<Bus> driver2 = new Driver("Алексеев Вячеслав анатольевич",
                true, 12, CategoryDrivers.CATEGORY_D);
        Driver<Lorrycar> driver3 = new Driver("Якименко Вероника Владимировна",
                true, 123, CategoryDrivers.CATEGORY_C);

        passengercar1.addDriver(driver);

        List<Car> cars = List.of(passengercar1, passengercar2, passengercar3, passengercar4,
                bus1, bus2, bus3, bus4,
                lorrycar1, lorrycar2, lorrycar3, lorrycar4);
        driver.start(passengercar1);

        passengercar1.addDriver(new Driver<>("иванов иван иванович",
                true, 12, CategoryDrivers.CATEGORY_B));
        passengercar1.addSponsor(new Sponsor<>("Соса+сола", 124567));
        passengercar1.addMechanic(new Mechanic<>("Вероника","Якименко","Мишлен"));
        infoPrint(cars);



    }

    public static void infoPrint(List<Car> cars) {
        for (Car car :cars)

        JOptionPane.showMessageDialog(null,"Авто"
        + car.getBrand()+" " + car.getModel() + "\n"
        + "Водители - " + car.getDrivers() + "\n"
        + "Спонсоры - " + car.getSponsors() + "\n"
        + "Механики - " + car.getMechanics());
    }
}