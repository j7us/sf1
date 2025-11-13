package org.example;

public abstract class Job<T, D> {

    public abstract D execute(T t);
}
