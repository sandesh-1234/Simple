package Polymorphism;

import retest.Forimlement;

public class Useimpliment implements Forimlement 
{
public void demo()
{
	System.out.println(" We completed declared incomplete method Here");
}

public void demo1()
{
	System.out.println("We completed declared incomplete method Here");
	
}
public static void main(String[] args)
{
	System.out.println(Useimpliment.a);
	Useimpliment ref =new Useimpliment();
	ref.demo();
	ref.demo1();
}
}
