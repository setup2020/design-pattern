public class ObserverImpl2 implements Observer {

    @Override
    public void update(int v) {
        System.out.println("Observateur 2");
      //  int etat=((ObservebleConcret)o).getEtat();
        System.out.println("Resultat :"+v *6);

    }

}
