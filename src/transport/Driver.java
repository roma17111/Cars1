package transport;

public class Driver <T extends Transport>{
    private CategoryDrivers categoryDrivers;
    private final String fullName;
    private boolean license;
    private int experience;



    public Driver(String fullName, boolean license, int experience,CategoryDrivers categoryDrivers) {
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
            this.categoryDrivers = categoryDrivers;
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

    public void start(T car) {
        System.out.println("\n" + "Водитель " + getFullName() +
                " управляющий транспортом " + car.getBrand() + " " + car.getModel() + "\n"
                + " и будет участвовать в заезде" );
    }

    public void stop() {
        System.out.println("Водитель "+ getFullName() +" останавливается.");
    }

    public void refill() {
        System.out.println("Водитель "+ getFullName() +" заправляет свой транспорт.");
    }

    @Override
    public String toString() {
        return
                " Ф.И.О -" + fullName +
                " Стаж вождения - " + experience +
                " Категория прав - " + categoryDrivers
                ;
    }
}
