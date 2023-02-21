public class Adaptee {
    public int request1(int nb1,int bn2){
        return nb1*bn2;
    }

    public void request2(int nb){
        System.out.println("Ancienne requette: Résultat="+nb);
    }
}
