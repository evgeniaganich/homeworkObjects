public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerName = flowerName;
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    @Override
    public String toString() {
        return "Цветок: " + flowerName + ", цвет: " + flowerColor + ", страна происхождения: " + country + ", стоимость: " + cost + " рублей, срок стояния: " + lifeSpan + " дней.";
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
}
