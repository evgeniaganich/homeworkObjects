import transport.Car;

public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт=менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001, null);


        maxim.greeting();
        anya.greeting();
        katya.greeting();
        artem.greeting();
        vladimir.greeting();


        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi","A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        audi.setTransmission("АКПП");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2015, "Германия");
        bmw.setSummerTyres(false);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2015, "Южная Корея");
        kia.setRegistrationNumber("м456ее799");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2015, "Южная Корея");
        Car suzuki = new Car("Suzuki", "SX4", 0, null, 0, null);

        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5);
        Flower peony = new Flower("Пион",null, "Англия", 69.9,5);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);


        lada.printCar();
        audi.printCar();
        bmw.printCar();
        kia.printCar();
        hyundai.printCar();
        suzuki.printCar();

        System.out.println(rose.toString());
        System.out.println(chrysanthemum.toString());
        System.out.println(peony.toString());
        System.out.println(gypsophila.toString());

    }
    private static void printinfo(Car car) {

    }
}