

public class Main {
    public static void main(String[] args) {

//        Human maxim = new Human("Максим", "Минск", 1987, "бренд-менеджер");
//        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
//        Human katya = new Human("Катя", "Калининград", 1994, "продакт=менеджер");
//        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
//        Human vladimir = new Human("Владимир", "Казань", 2001, null);
//
//
//        maxim.greeting();
//        anya.greeting();
//        katya.greeting();
//        artem.greeting();
//        vladimir.greeting();


        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, 280, "Россия", null, null, "бензин");
        Car audi = new Car("Audi","A8 50 L TDI quattro", 3.0, "черный", 2020, 320,"Германия", null, null, "дизель");
        audi.setTransmission("АКПП");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2015, 250, "Германия", null, null, "малиновое варенье");
        bmw.setSummerTyres(false);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2015, 300,"Южная Корея", null, null, null);
        kia.setRegistrationNumber("м456ее799");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2015, 0,"Южная Корея", null, null);
        Car suzuki = new Car("Suzuki", "SX4", 0, null, 0, 0,null, null, null);

//        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);
//        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5);
//        Flower peony = new Flower("Пион",null, "Англия", 69.9,5);
//        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
//
//
//        lada.printCar();
//        audi.printCar();
//        bmw.printCar();
//        kia.printCar();
//        hyundai.printCar();
//        suzuki.printCar();
//
//        System.out.println(rose.toString());
//        System.out.println(chrysanthemum.toString());
//        System.out.println(peony.toString());
//        System.out.println(gypsophila.toString());

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия", null, 301,
                3500, 0, "Белорусский вокзал", "Минск Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270,
                1700, 0,"Ленинградский вокзал", "Ленинград-Пассажирский", 11);

        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus liaz = new Bus("ЛиАЗ", "697", 1970, "Россия", "зеленый", 100, "бензин");
        Bus ikarus = new Bus("Ikarus", "280", 1950, "Россия", "желтый", 90, "дизель");
        Bus volkswagen = new Bus("Volkswagen", "Microbus", 1962, "Германия", "оранжевый", 120, "кофе");

        System.out.println(liaz);
        System.out.println(ikarus);
        System.out.println(volkswagen);

        lada.refill();
        audi.refill();
        bmw.refill();
        liaz.refill();
        ikarus.refill();
        volkswagen.refill();
        lastochka.refill();

        kia.refill();

    }

}