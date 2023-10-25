import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        Stable st = new Stable("Великая конюшя Ростова-на-Дону", "Коммунистический пр. 32", 50, Stable.cost);
//        st.display();
//        System.out.println(st.toString());
//
//
//        Stall stl = new Stall("Великая конюшя Ростова-на-Дону", "Коммунистический пр. 32", 50, Stable.cost, 200, 60, true);
//        stl.display();
//        System.out.println(stl.toString());
//
//        Scanner sc = new Scanner(System.in);
//        HorsesList hrlist = new HorsesList();
//
//        Horses hr1 = new Horses(1, "Тузик", "Муж.", 21);
//        Horses hr2 = new Horses(2, "Гонщик", "Жен.", 3);
//        Horses hr3 = new Horses(3, "Тоби", "Муж.", 99);
//
//        System.out.println("Вот наши лошади: ");
//        hrlist.addHorses(hr1);
//        hrlist.addHorses(hr2);
//        hrlist.addHorses(hr3);
//
//        List<Horses> horses = hrlist.getHorses();
//        for(Horses hors : horses){
//            System.out.println(hors);
//        }
//
//        System.out.print("\nВведите ID вашей лошади: ");
//        int a = sc.nextInt();
//        Horses foundHors = hrlist.getHorsesID(a);
//        if(foundHors != null){
//            System.out.println("Найдена лошадь: " + foundHors);
//        }
//        else{
//            System.out.println("Лошадь не найдена");
//        }
//
//        double averageAge = Horses.findAverageAge(horses);
//        System.out.println("Средний возраст лошадей: " + averageAge);
//
        Scanner sc = new Scanner(System.in);
        EmployeeList emplst = new EmployeeList();

        Employee employee1 = new Employee(1, "Клименко Олег Юрьевич", "Директор");
        Employee employee2 = new Employee(2, "Сапонджян Хачатур Самвелович", "Конюх");
        Employee employee3 = new Employee(3, "Костин Данил Геогриевич", "Наездник");


        System.out.println("Наши сотрудники:");
        emplst.addEmployee(employee1);
        emplst.addEmployee(employee2);
        emplst.addEmployee(employee3);

        List<Employee> employees = emplst.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nВведите ID вашего сотрудника: ");
        int a = sc.nextInt();
        Employee foundEmployee = emplst.getEmployeeById(a);
        if (foundEmployee != null) {
            System.out.println("\nНайден сотрудник: " + foundEmployee);
        } else {
            System.out.print("\nСотрудник с идентификатором " + a + " не найден.");
        }

        emplst.salary();
    }
}
