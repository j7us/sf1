package org.example;

public abstract class IdemponetCheckerDecorator<T, D> extends Job<T, D> {
    private final Job<T, D> job;

    public IdemponetCheckerDecorator(Job<T, D> job) {
        this.job = job;
    }

    @Override
    public D execute(T t) {
        boolean chechResult = checkProcessed(t);

        if (!chechResult) {
            throw new RuntimeException("IdemponetCheckerDecorator failed to execute job");
        }

        return job.execute(t);
    }

    protected abstract boolean checkProcessed(T t);
}
