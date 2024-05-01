package oop.labor08.elso;

import java.util.Objects;

public class CircularQueue implements IQueue
{

    private final int cap;
    private final Object[] items;
    private int front;
    private int rear;


    public CircularQueue(int cap) {
        this.cap = cap;
        this.front = this.rear = -1;
        items = new Object[this.cap];

    }

    @Override
    public boolean isFull() {
        if((this.front == 0 && this.rear == this.cap - 1) || (this.rear == this.front - 1))
        {
            return true;
        }

        return false;
    }
    @Override
    public boolean isEmty() {
        if(this.rear == -1 && this.front == -1)
        {
            return true;
        }

        return false;
    }
    @Override
    public void enQueue(Object object) {
        if(!isFull())
        {
            if(isEmty())
            {
                this.front = 0;
            }

            this.rear = (this.rear + 1) % this.cap;
            items[this.rear] = object;

        }
        else
        {
            System.out.println("Queue is full");
        }


    }
    @Override
    public Object deQueue() {
        if(!isEmty())
        {
            if(this.front == this.rear)
            {
                this.front = this.rear = -1;
                return null;
            }
            else
            {
                Object temp = items[front];
                this.front = (this.front + 1) % this.cap;
                return temp;
            }

        }
        else
        {
            System.out.println("Queue is emty");
            return null;
        }

    }
    @Override
    public void printQueue() {

        int i = this.front;

        while(true)
        {
            System.out.println(items[i]);

            if (i == this.rear)
            {
                break;
            }

            i = (i + 1) % this.cap;
        }
    }

    @Override
    public boolean equals(Object array) {

        if(this.rear == ((CircularQueue)array).rear)
        {
            for(int i = this.front; i != this.rear; i = (i + 1) % this.cap)
            {
                if(items[i] != ((CircularQueue)array).items[i])
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
