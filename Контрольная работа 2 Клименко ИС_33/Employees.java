//Сотрудники

class Employee{
    private int id;
    private String FIO;
    private String should;

    public Employee(int id, String FIO, String should) {
        this.id = id;
        this.FIO = FIO;
        this.should = should;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getshould() {
        return should;
    }

    public void setshould(String should) {
        this.should = should;
    }

    public void display() {
        System.out.println("Наш сотрудник");
    }

    public String toString(){
        return "\nФИО сотрудника: " + FIO + "\nДолжность: " + should;
    }



}
