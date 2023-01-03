package Decorator;

public class BadBuilder extends WorkerDecorator{
    public BadBuilder(Worker worker) {
        super(worker);
    }

public String doWorkButBad(){
        return "Also doing work but bad";
}

    @Override
    public String working() {
        return super.working() +" " + doWorkButBad();
    }
}
