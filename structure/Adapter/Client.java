public class Client {

    public static void main(String[] args) {

        //--------------par heritage-----------------
        Target target1=new Adapter();
        target1.request(1, 10);

        //------------par composition----------------

        Target target=new Adapter2();
        target.request(20, 20);
        

    }
    
}
