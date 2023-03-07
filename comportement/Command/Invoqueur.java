import java.util.HashMap;
import java.util.Map;

public class Invoqueur {
    private Map<String,Command> commandes= new HashMap<String,Command>();
    
    public void addNewCommand(String ref,Command command){
        commandes.put(ref, command);
    }

    public void invoquer(String ref){
        Command cmde=commandes.get(ref);
        if(cmde != null) cmde.executer();
    }
}
