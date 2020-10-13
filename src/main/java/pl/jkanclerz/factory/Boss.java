package pl.jkanclerz.factory;

class Boss implements Employee {
    private final Worker worker;

    Boss(Worker worker) {
        this.worker = worker;
    }

    @Override
    public Product doWork() {
        return worker.doWork();
    }
}
