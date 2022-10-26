import java.time.LocalDate;
public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfPlaces;
    private boolean summerTyres;
    private Car.Key key;
    private Car.Insurance insurance;

    private boolean electroCar;

    private String fuel;


    public Car(String brand, String model, double engineVolume,
               String color, int productionYear, int maxSpeed, String productionCountry, Car.Key key, Car.Insurance insurance) {
        super(brand, model, productionYear, color, productionCountry, maxSpeed);

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (key == null) {
            this.key = new Car.Key();
        } else {
            this.key = key;
        }
        this.bodyType = "седан";
        this.numberOfPlaces = 5;
        this.transmission = "МКПП";
        this.registrationNumber = "x000xx000";
        this.summerTyres = true;
        this.key = new Car.Key();
        this.insurance = new Car.Insurance();
        this.electroCar = false;

    }
    public Car(String brand, String model, double engineVolume,
               String color, int productionYear, int maxSpeed, String productionCountry, Car.Key key, Car.Insurance insurance, String fuel) {
        this (brand, model, engineVolume, color, productionYear, maxSpeed, productionCountry, key, insurance);
        this.electroCar = false;
        String fuelType1 = "бензин";
        String fuelType2 = "дизель";
        if (fuel == null || fuel.isEmpty() || fuel.isBlank()) {
            this.fuel = "бензин";
        } else {
            this.fuel = fuel;
        }
        if (!this.fuel.equals(fuelType1) && ! this.fuel.equals(fuelType2)) {
            this.fuel = "неизвестный вид";
        }
    }

    public void printCar() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя: " + engineVolume + ", цвет: " + getColor() + ", год выпуска: "
                + getProductionYear() + ", страна сборки: " + getProductionCountry() + ", тип кузова: " + bodyType + ", количество мест: "
                + numberOfPlaces + " , коробка передач: "
                + transmission + ", номер: " + registrationNumber + ", ключ: "
                +  (key.isKeylessAcess() ? "с ключом, " : "без ключа, ") + (key.isRemoteStartEngine() ? "удаленный доступ, " : "прямой доступ, ") +
                "страховка: номер " + insurance.number + ", стоимость: " + insurance.cost + ", дата окончания: " + insurance.expireTime);
    }


    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "MКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Car.Key getKey() {
        return key;
    }

    public void setKey(Car.Key key) {
        this.key = key;
    }

    public Car.Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Car.Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }
    public boolean isRegistrationNumberCorrect() {
        //x000xx000
        if (registrationNumber.length() != 9) {
            return false;
        }
        char chars[] = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isAlphabetic(chars[6])
                || !Character.isAlphabetic(chars[7]) || !Character.isAlphabetic(chars[8])) {
            return false;
        }
        return true;
    }

    public boolean isElectroCar() {
        return electroCar;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        String fuelType1 = "бензин";
        String fuelType2 = "дизель";
        if (fuel == null || fuel.isEmpty() || fuel.isBlank()) {
            this.fuel = "бензин";
        } else {
            this.fuel = fuel;
        }
        if (!this.fuel.equals(fuelType1) && ! this.fuel.equals(fuelType2)) {
            this.fuel = "неизвестный вид";
        }
    }

    @Override
    public void refill() {
        String fuelType1 = "бензин";
        String fuelType2 = "дизель";
        if (fuel == null || fuel.isEmpty() || fuel.isBlank()) {
            this.fuel = "бензин";
        } else {
            this.fuel = fuel;
        }
        if (!this.fuel.equals(fuelType1) && ! this.fuel.equals(fuelType2)) {
            this.fuel = "неизвестный вид";
        }
        if (electroCar == false) {
            System.out.println("заправляюсь на заправке, вид топлива: " + fuel);
        } else {
            System.out.println("зарядка на специальной электропарковке");
        }
    }

    public static class  Key {
        private final boolean remoteStartEngine;
        private final boolean keylessAcess;

        public Key(boolean remoteStartEngine, boolean keylessAcess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAcess = keylessAcess;
        }
        public Key() {
            this(false,false);
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAcess() {
            return keylessAcess;
        }

    }
    public static class Insurance {
        private final LocalDate expireTime;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireTime, double cost, String number) {
            if (expireTime == null) {
                this.expireTime = LocalDate.now().plusDays(365);
            } else {
                this.expireTime = expireTime;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }
        public Insurance() {
            this(null, 10000, null);
        }

        public LocalDate getExpireTime() {
            return expireTime;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
        public void checkExpireTime() {
            if (expireTime.isBefore(LocalDate.now()) || expireTime.isEqual(LocalDate.now())) {
                System.out.println("нужно срочно ехать оформлять новую страховку");
            }
        }
        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }
    }
}
