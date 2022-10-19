public class Human {
    String name;
    String town;
    int yearOfBirth;
    String job;


    Human(String name, String town, int yearOfBirth, String job) {
        if (name == null) {
            this.name = "информация об имени не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "информация о городе не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth <= 0) {
            yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (job == null) {
            this.job = "информация о работе не указана";
        } else {
            this.job = job;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
           }

    public void greeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
