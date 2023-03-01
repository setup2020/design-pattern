public class Application {
    public static void main(String[] args) {
        ComposantAbstrait c=new ComposantContretImpl1();
        c.operation();
        System.out.println("------------------------");
        System.out.println("Decorateur 1");
        c=new DecoranteurConcretImpl1(c);
        c.operation();

        System.out.println("------------------------");
        System.out.println("Decorateur 2");
        c=new DecorateurConcretImpl2(c);
        c.operation();
    }
}
