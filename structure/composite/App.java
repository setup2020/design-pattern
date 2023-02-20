public class App {
    public static void main(String[] args) {
        Folder root=new Folder("ROOT");
        Folder folder=new Folder("Structure");
       
      
        Folder folder2=new Folder("Comportement");
        Folder folder3=new Folder("Creation");

        root.add(folder);
        folder.add(new File("Composite pattern"));
        folder.add(new File("Proxy pattern"));
        root.add(folder2);
        root.add(folder3);
        root.view();
    }
}
