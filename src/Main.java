public class Main {
    public static void main(String[] args) {

        //Human maxim = new Human();
        //maxim.name = "Максим";
        //maxim.town = "Минск";
        //maxim.yearOfBirth = 1987;
        //maxim.job = "бренд-менеджер";

        //Human anya = new Human();
        //anya.name = "Аня";
        //anya.town = "Москва";
        //anya.yearOfBirth = 1993;
        //anya.job = "методист образовательных программ";

        //Human katya = new Human();
        //katya.name = "Катя";
        //katya.town = "Калининград";
        //katya.yearOfBirth = 1994;
        //katya.job = "продакт-менеджер";

//        Human artem = new Human();
//        artem.name = "Артем";
//        artem.town = "Москва";
//        artem.yearOfBirth = 1995;
//        artem.job = "директор по развитию бизнеса";

        Human maxim = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт=менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        Human vasya = new Human("Василий", null, -1991, null);


        maxim.greeting();
        anya.greeting();
        katya.greeting();
        artem.greeting();
        vasya.greeting();

//        Car lada = new Car();
//        lada.brand = "Lada";
//        lada.model = "Granta";
//        lada.productionYear = 2015;
//        lada.productionCountry = "Россия";
//        lada.color = "желтый";
//        lada.engineVolume = 1.7;

//        Car audi = new Car();
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.productionYear = 2020;
//        audi.productionCountry = "Германия";
//        audi.color = "черный";
//        audi.engineVolume = 3.0;
//
//        Car bmw = new Car();
//        bmw.brand = "BMW";
//        bmw.model = "Z8";
//        bmw.productionYear = 2015;
//        bmw.productionCountry = "Германия";
//        bmw.color = "черный";
//        bmw.engineVolume = 3.0;
//
//        Car kia = new Car();
//        kia.brand = "Kia";
//        kia.model = "Sportage 4-го поколения";
//        kia.productionYear = 2015;
//        kia.productionCountry = "Южная Корея";
//        kia.color = "красный";
//        kia.engineVolume = 2.4;
//
//        Car hyundai = new Car();
//        hyundai.brand = "Hyundai";
//        hyundai.model = "Avante";
//        hyundai.productionYear = 2015;
//        hyundai.productionCountry = "Южная Корея";
//        hyundai.color = "оранжевый";
//        hyundai.engineVolume = 1.6;

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi","A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия" );
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2015, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2015, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2015, "Южная Корея");

        Car suzuki = new Car("Suzuki", "SX4", 0, null, 0, null);


        lada.printCar();
        audi.printCar();
        bmw.printCar();;
        kia.printCar();
        hyundai.printCar();
        suzuki.printCar();
    }
}