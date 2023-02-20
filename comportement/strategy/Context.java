public class Context {
    private Strategy strategy=new StrategyDefaultImpl();
    public void effectuerOperation(){
        System.out.println("********************");
         strategy.operation();
        System.out.println("==============");
    }


    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }
} 