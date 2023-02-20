public abstract class Component {
    protected String name;
    public Component(String name) {
        this.name = name;
    }
    protected int level;
    public abstract void view();

    public String indentation(){
        String str="";
        for (int i = 0; i < level; i++) {
       
            str+="\t";
        }
 
        return str;
    }
}