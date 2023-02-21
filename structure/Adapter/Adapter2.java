public class Adapter2 implements Target{

    private Adaptee adaptee=new Adaptee();

    @Override
    public void request(int nb1, int nb2) {

        int res=adaptee.request1(nb1, nb2);
        adaptee.request2(res);

         }
    
}
