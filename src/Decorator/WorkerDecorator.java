package Decorator;

public class WorkerDecorator implements Worker{
    Worker worker;

    public WorkerDecorator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String working() {
        return worker.working();
    }
}
