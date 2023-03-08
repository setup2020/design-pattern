public class ThreadedTask extends Thread{
    private String taskName;

    public ThreadedTask(String task){
        this.taskName=task;
    }

    @Override
    public void run() {
        Singleton singleton=Singleton.getInstence();
        singleton.traiter(taskName);
    }
}
