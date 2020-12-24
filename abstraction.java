package com.company;

public abstract class abstraction {
    public abstract void something();
    public abstract void newthing();
}
class abstractImplementaion extends abstraction {

    @Override
    public void something() {
        System.out.println("Here something will happen");
    }

    @Override
    public void newthing() {
        System.out.println("Here Newthings will happen");
    }

    public static void main(String[] args)
    {
        abstractImplementaion ab = new abstractImplementaion();
        ab.something();
    }
}