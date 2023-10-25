import java.util.ArrayList;
import java.util.List;

class HorsesList {
    private List<Horses> horses = new ArrayList<>();

    public void addHorses(Horses hors) {
        horses.add(hors);
    }

    public List<Horses> getHorses() {
        return horses;
    }

    public Horses getHorsesID(int horsID){
        for(Horses hors : horses){
            if(hors.getId() == horsID){
                return hors;
            }
        }
        return null; // Если конь не найден
    }
}
