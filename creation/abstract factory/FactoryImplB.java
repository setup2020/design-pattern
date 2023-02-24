public class FactoryImplB implements AbstractFactory{

    @Override
    public AbstractPlugin getInstence() {

        return new PluginImplB();
       }
    
}
