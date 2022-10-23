package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;

    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfPlaces;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, double engineVolume,
               String color, int productionYear, String productionCountry) {
        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "МКПП",
                "х000хх000",
                "седан",
                5,
                true
            new Key(),
            new Insurance()
        );
    }
     if (brand == null) {
        this.brand = "default";
    } else {
        this.brand = brand;
    }
        if (model == null) {
        this.model = "default";
    } else {
        this.model = model;
    }
        if (productionCountry == null) {
        this.productionCountry = "default";
    } else {
        this.productionCountry = productionCountry;
    }
        if (engineVolume == 0) {
        this.engineVolume = 1.5;
    } else {
        this.engineVolume = engineVolume;
    }
        if (color == null) {
        this.color = "белый";
    } else {
        this.color = color;
    }
        if (productionYear == 0) {
        this.productionYear = 2020;
    } else {
        this.productionYear = productionYear;
    }
        if (key == null) {
        this.key = new Key();
    } else {
        this.key = key;
    }
        this.bodyType = "седан";
        this.numberOfPlaces = 5;
        this.transmission = "МКПП";
        this.registrationNumber = "x000xx000";
        this.summerTyres = true;

    public void printCar() {
        System.out.println(brand + " " + model + ", объем двигателя: " + engineVolume + ", цвет: " + color + ", год выпуска: " +
                productionYear + ", страна сборки: " + productionCountry + ", тип кузова: " + bodyType + ", количество мест: " + numberOfPlaces + " , коробка передач: "
         + transmission + ", номер: " + registrationNumber + ", ключ: " + key + ", страховка: " + insurance);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
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

    public String getColor() {
        return color;
    }


    public void setCarColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
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
    public static class  Key {
        private final boolean remoteStartEngine;
        private final boolean keylessAcess;

        public Key(boolean remoteStartEngine, boolean keylessAcess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAcess = keylessAcess;
        }
        public Key() {
            this(false,false)
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
            this(null, 10000, null)
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








