package transport;

public class Driver1<D extends Driver<Bus>> {

    private CategoryDrivers categoryDrivers;
    private final String fullName;
    private boolean license;
    private int experience;



    public Driver1(String fullName, boolean license, int experience,CategoryDrivers categoryDrivers) {
        this.fullName = fullName;
        this.license = license;
        setExperience(experience);
        setCategoryDrivers(categoryDrivers);


    }

    public String getFullName() {
        return fullName;
    }


    public CategoryDrivers getCategoryDrivers() {
        return categoryDrivers;
    }

    public void setCategoryDrivers(CategoryDrivers categoryDrivers) {
        if (categoryDrivers !=CategoryDrivers.CATEGORY_D)
            throw new IllegalArgumentException("Некорректная категория прав");
        else {
            this.categoryDrivers = categoryDrivers;
        }

    }

    public boolean isLicense() {
        return license;
    }
    public void setLicense(boolean license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0 || experience > 120) {
            this.experience = experience;
        }else {
            this.experience = experience;}
    }

    public void start(Bus bus) {
        System.out.println("\n" + "Водитель " + getFullName() +
                " управляющий автобусом " + bus.getBrand() + " " + bus.getModel() + "\n"
                + " и будет участвовать в заезде" );
        bus.printInfoAboutCars();

    }

    public void stop() {
        System.out.println("Водитель "+ getFullName() +" останавливается.");
    }

    public void refill() {
        System.out.println("Водитель "+ getFullName() +" заправляет свой транспорт.");
    }

    @Override
    public String toString() {
        return  " Ф.И.О -" + fullName +
                " Стаж вождения - " + experience +
                " Категория прав - " + categoryDrivers ;
    }
}

