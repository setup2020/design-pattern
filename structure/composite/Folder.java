import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    private List<Component> lists= new ArrayList<>();

    public Folder(String name) {
        super(name);
       
    }

   
    @Override
    public void view() {
        String tab=indentation();
      
        System.out.println(tab+"Folder:"+name);
        lists.stream().forEach(l->{
         l.view();
        });
       
    }

    public Component add(Component component){
        component.level=this.level+1;
        lists.add(component);
        return component;
    }

    public void remove(Component component){
        lists.remove(component);
        System.out.println("component move");
    }
    
    
}