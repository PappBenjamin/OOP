package labor7_2;

import java.util.ArrayList;


public class Stack
{
    private int cap;
    private ArrayList<Object> items;

    public Stack(int capacity)
    {
        this.cap = capacity;
        items = new ArrayList<>(this.cap);
    }

    public boolean isFull()
    {
        return items.size() == cap;
    }

    public boolean isEmty()
    {
        return items.size() == 0;
    }

    public void push(Object item) {
        if(this.isFull())
        {
            System.out.println("Stack is full");
            return;
        }

        items.add(item);
    }

    public void pop() {
        if(this.isEmty())
        {
            System.out.println("Stack is emty");
            return;
        }
        items.remove(items.getLast());
    }

    public Object top() {
        if(this.isEmty())
        {
            return null;
        }

        return items.getLast();
    }

    public int getSize()
    {
        return items.size();
    }
}
