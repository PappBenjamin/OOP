package labor7_2;

public class Main
{
    public static void main(String[] args) {

        Stack stack1 = new Stack(5);

        for(int i = 0; i < 10; ++i)
        {
            stack1.push(i);
        }

        while(!stack1.isEmty())
        {
            System.out.print(stack1.top() + " ");
            stack1.pop();
        }
    }


}
