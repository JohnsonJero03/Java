package com.company;
 class man
{
     void walk()
    {
        System.out.println("Man can walk");
    }
}
public class polymorphism  extends man{
    @Override
    void walk() {
//        super.walk();
        System.out.println("Man can walk and run fastly.");
    }

    public static void main(String[] args)
    {
        polymorphism p = new polymorphism();
        p.walk();
    }
}
