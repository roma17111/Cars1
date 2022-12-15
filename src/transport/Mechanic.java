package transport;

public class Mechanic <C extends Car>{
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
}
