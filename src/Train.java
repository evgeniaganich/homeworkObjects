public class Train extends Transport {
    private int price;
    private int travelTime;
    private String beginningStation;
    private String endStation;
    private int carriageNumber;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int price, int travelTime, String beginningStation, String endStation, int carriageNumber) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (price <= 0) {
            this.price = 50;
        } else {
            this.price = price;
        }
        if (travelTime <= 0) {
            this.travelTime = 30;
        } else {
            this.travelTime = travelTime;
        }
        if (beginningStation == null || beginningStation.isBlank() || beginningStation.isEmpty()) {
            this.beginningStation = "Москва Октябрьская";
        } else {
            this.beginningStation = beginningStation;
        }
        if (endStation == null || endStation.isBlank() || endStation.isEmpty()) {
            this.endStation = "Конечная";
        } else {
            this.endStation = endStation;
        }
        if (carriageNumber <= 0) {
            this.carriageNumber = 5;
        } else {
            this.carriageNumber = carriageNumber;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getBeginningStation() {
        return beginningStation;
    }

    public void setBeginningStation(String beginningStation) {
        this.beginningStation = beginningStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    @Override
    public String toString() {
        return "Поезд: " + getBrand() + " " + getModel() + ", " +
                "цена поездки: " + price +
                ", время в пути: " + travelTime +
                ", станция отправления: " + beginningStation +
                ", станция прибывания: " + endStation +
                ", количество вагонов: " + carriageNumber;
    }

    @Override
    public void refill() {
        System.out.println("Заправка дизелем");
    }
}
