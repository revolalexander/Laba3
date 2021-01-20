public class WorkingTarget extends Item {
    private String worker;
    private boolean done;
    
    WorkingTarget(String name) {
        super(name);
        this.worker = null;

    }

    public void targetDone(String person) {
        this.done = true;
        this.worker = person;
        System.out.println(this.getName() + " - работа выполнена " + this.worker + "\n");
    }

}
