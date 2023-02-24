public class Application {
  public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    // instaciation statique
    AbstractFactory factory=new FactoryImplA();
    AbstractPlugin plugin=factory.getInstence();
    plugin.traitement();

    AbstractFactory factory2=new FactoryImplB();
    AbstractPlugin plugin2=factory2.getInstence();
    plugin2.traitement();


      // instaciation dynamique
      AbstractFactory factoryDinamique=(AbstractFactory) Class.forName("FactoryImplB").newInstance();
      AbstractPlugin plugin3=factoryDinamique.getInstence();
      plugin3.traitement();
      
  }
}
