public class Human {
    public String name;
    private String town;
    private int yearOfBirth;
    public String job;


    Human(String name, String town, int yearOfBirth, String job) {

            if (name == null || name.isEmpty()) {
                this.name = "информация об имени не указана";
            } else {
                this.name = name;
            }
            if (town == null || town.isEmpty()) {
                this.town = "информация о городе не указана";
            } else {
                this.town = town;
            }
            if (yearOfBirth < 0) {
                yearOfBirth = 0;
            } else {
                this.yearOfBirth = yearOfBirth;
            }
            if (job == null || job.isEmpty()) {
                this.job = "информация о работе не указана";
            } else {
                this.job = job;
            }
           }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "информация об имени не указана";
        } else {
            this.name = name;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()) {
            this.town = "информация о городе не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job == null || job.isEmpty()) {
            this.job = "информация о работе не указана";
        } else {
            this.job = job;
        }
    }

    public void greeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
