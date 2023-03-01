import java.util.ArrayList;
import java.util.List;

public class ObservebleConcret implements Observable {

    private List<Observer> observers=new ArrayList<>();
    private int etat;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers)
            o.update(etat);
    }

    public int getEtat(){
        return etat;
    }

    public void setEtat(int etat){

        this.etat=etat;
        notifyObservers();
    }


}
