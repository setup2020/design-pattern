public class DecorateurConcretImpl2 extends DecorateurAbstrait{

    public DecorateurConcretImpl2(ComposantAbstrait composant) {
        super(composant);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void operation() {
        System.out.println("Je suis le decorateur 2, avant j'ajoute X");
      
        composant.operation();

        System.out.println("Je suis le decorateur 2, apres j'ajoute Y");
    }
    
}
