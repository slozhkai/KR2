//Лошади
import java.util.ArrayList;
import java.util.List;
public class Horses {
    private int id;
    private String name;
    private String gender; // Изменили тип данных на String
    private int age;

    public Horses(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String toString(){
        return "\nИмя лошади: " + name + "\nПол лошади: " + gender + "\nВозраст: " + age;
    }

    public static double findAverageAge(List<Horses> horses) {
        if (horses.isEmpty()) {
            return 0;
        }

        int totalAge = 0;
        for (Horses horse : horses) {
            totalAge += horse.getAge();
        }

        return (double) totalAge / horses.size(); // Вычисление среднего возраста
    }
}
