import java.util.Objects;
import java.util.Scanner;

public interface Salary {
    Scanner sc = new Scanner(System.in);


    default void salary(){
        System.out.println("Введите должность вашего сотрудника:");
        String a = sc.nextLine();
        if(Objects.equals(a, "Конюх")){
            System.out.println("Зарплата конюха = 15.000руб");
        }
        if(Objects.equals(a, "Наездник")){
            System.out.println("Зарплата наездника  = 80.000руб");
        }
        if(Objects.equals(a, "Директор")){
            System.out.println("Зарплата директора = 100.000руб");
        }

    }


}