package oop.labor08.elso;

import java.util.Objects;

public interface IQueue
{
    boolean isFull();
    boolean isEmty();

    void enQueue(Object object);
    Object deQueue();
    void printQueue();

}
