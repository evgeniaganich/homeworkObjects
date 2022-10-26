public class Bus extends Transport {
    private String fuel;
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
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
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getProductionYear() {
        return super.getProductionYear();
    }

    @Override
    public String getProductionCountry() {
        return super.getProductionCountry();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }
    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        String fuelType1 = "бензин";
        if (fuel == null || fuel.isEmpty() || fuel.isBlank()) {
            this.fuel = "бензин";
        } else if (!fuel.equals(fuelType1)) {
            this.fuel = "дизель";
        }
    }
    @Override
    public String toString() {
        return "Автобус: " + getBrand() + " " + getModel() + ", цвет: " + getColor() + ", страна производства: " + getProductionCountry() +
               ", год производства: " + getProductionYear() + ", максимальная скорость: " + getMaxSpeed();
    }

    @Override
    public void refill() {
        System.out.println("заправляюсь на заправке, вид топлива: " + fuel);
    }
}
