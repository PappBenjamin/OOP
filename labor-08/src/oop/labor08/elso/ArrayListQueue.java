package oop.labor08.elso;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue
{

    private int cap;
    private ArrayList<Object> items;

    public ArrayListQueue(int cap){
        this.cap = cap;
        items = new ArrayList<Object>(this.cap);
    }

    @Override
    public boolean isFull() {
       if(items.size() == this.cap)
       {
           return true;
       }
       return false;
    }
    @Override
    public boolean isEmty() {
        if(items.size() == 0)
        {
            return true;
        }
        return false;
    }
    @Override
    public void enQueue(Object object) {
        if(!isFull())
        {
            items.add(object);
            return;
        }

        System.out.println("Queue is full");
    }
    @Override
    public Object deQueue(){

        if(!isEmty())
        {
            Object temp = items.getFirst();
            items.removeFirst();

            return temp;
        }

        System.out.println("Queue is emty");
        return null;

    }
    @Override
    public void printQueue() {
        for (Object item : items)
        {
            System.out.println(item);
        }
    }

    @Override
    public boolean equals(Object arrayListQueue1)
    {

        if(this.items.size() == ((ArrayListQueue)arrayListQueue1).items.size())
        {
            for(int i = 0; i < ((ArrayListQueue)arrayListQueue1).items.size(); ++i)
            {
                if(this.items.get(i) != ((ArrayListQueue)arrayListQueue1).items.get(i))
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
