package ch002;

import java.security.PublicKey;

public class Blocks {
    
    long l;
    {

    }

    //Declaration block
    {
        boolean b;
    }

    //Initialization block
    {
  //      b = true;
    l = 17L; 
    }

    //Definition block
    {
        int i = 6;
    }
public static void main(String[] args) {
    Blocks block_1 = new Blocks();
    System.out.println(block_1.l);

    {
        int t = 5;
        System.out.println(t);
    }

    block_1.f();

    //Inner class block
    class InnerClass{ }
//Method block
    public void f()
{
    //local class block
    new Blocks()
    {
        public void sop()
        {
            System.out.println(l);
        }
    };
}


}
