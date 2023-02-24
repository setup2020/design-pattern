public class FactoryImplA implements AbstractFactory {

    @Override
    public AbstractPlugin getInstence() {

        return new PluginImplA();
    }

}
