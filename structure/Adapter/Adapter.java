public class Adapter extends Adaptee implements Target {

    @Override
    public void request(int nb1,int nb2) {
       int rest=request1(nb1, nb2);
       request2(rest);
    }
    
}
