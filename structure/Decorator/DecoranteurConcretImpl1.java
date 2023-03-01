public class DecoranteurConcretImpl1 extends DecorateurAbstrait{

    public DecoranteurConcretImpl1(ComposantAbstrait composant) {
        super(composant);
      
    }

    @Override
    public void operation() {
        System.out.println("Je suis le decorateur 1, avant j'ajoute X");
      
        composant.operation();

        System.out.println("Je suis le decorateur 1, apres j'ajoute Y");
    }
    
}
