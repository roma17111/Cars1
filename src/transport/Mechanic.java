package transport;

import java.util.Objects;

public class Mechanic <C extends Transport>{
    private final String firstName;
    private final String lastName;
    private final String companyJob;

    public Mechanic(String firstName, String lastName, String companyJob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyJob = companyJob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyJob() {
        return companyJob;
    }

    public void serviceCar(C car) {
        System.out.println("Машина " +car.getModel()+car.getBrand()+ " обслужена");
    }

    public void repCar(C car) {
        System.out.println("Машина " +car.getModel()+car.getBrand()+ " отремонтирована");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        if (firstName.equals(mechanic.firstName) && lastName.equals(mechanic.lastName) && companyJob.equals(mechanic.companyJob)) {
            throw new IllegalArgumentException("Без повторений");
        }
        return firstName.equals(mechanic.firstName) && lastName.equals(mechanic.lastName) && companyJob.equals(mechanic.companyJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, companyJob);
    }

    @Override
    public String toString() {
        return
                "Ф.И.О -" + firstName + '\n' +
                        "Фамилия - " + lastName + '\n' +
                        "Компания - " + companyJob;
    }
}
