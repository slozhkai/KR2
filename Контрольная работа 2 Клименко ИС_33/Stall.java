//Стойла

final class Stall extends Stable{
    private int stalls;
    private int watering_hole;
    private boolean heating;


    public Stall(String title, String address, int quantity, double cost, int stalls,
                 int watering_hole, boolean heating){
        super(title, address, quantity, cost);
        this.stalls = stalls;
        this.watering_hole = watering_hole;
        this.heating = heating;
    }


    public int getStalls() {
        return stalls;
    }

    public void setStalls(int stalls) {
        this.stalls = stalls;
    }

    public int getWatering_hole() {
        return watering_hole;
    }

    public void setWatering_hole(int watering_hole) {
        this.watering_hole = watering_hole;
    }

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    @Override
    public void display() {
        System.out.println("\nВы в стойле: ");
    }

    @Override
    public String toString() {
        return super.toString() + "\nКоличество стойл для лошадей: " + stalls + "\nСколько водопоев для лошадей: " + watering_hole + "\nЕсть ли отопление в стойлах: " + heating;
    }
}
