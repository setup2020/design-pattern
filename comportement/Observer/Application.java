public class Application {
    public static void main(String[] args) {
        ObservebleConcret sujet=new ObservebleConcret();
        ObserverImpl1 observerImpl1=new ObserverImpl1();
        sujet.addObserver(observerImpl1);
        ObserverImpl2 observerImpl2=new ObserverImpl2();
        sujet.addObserver(observerImpl2);
        sujet.setEtat(8);
        sujet.setEtat(7);
        sujet.deleteObserver(observerImpl1);
        sujet.setEtat(9);



    }
}
