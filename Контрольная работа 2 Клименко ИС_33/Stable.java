//Конюшня

class Stable {
    private String title; //Название конюшни
    private String address; //Адрес конюшни
    private int quantity; //Количество лошадей
    public static double cost = 1499.99; //Цена посещения


    public Stable(String title, String address, int quantity, double cost){
        this.title = title;
        this.address = address;
        this.quantity = quantity;
        this.cost = cost;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {

    }

    @Override
    public String toString() {
        return "Название конюшни: " + title + "\nАдрес: " + address + "\nКоличество лошадей: " + quantity + "\nЦена посещения: " + cost;
    }
}
