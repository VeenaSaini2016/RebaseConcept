class A
{
	void m1(){System.out.println("m1 Method");}
	void m2(){System.out.println("m2 Method");}
}

class B extends A
{
	void m3(){System.out.println("m3 Method");}
	void m4(){System.out.println("m4 Method");}
}

class C extends B
{
	void m5(){System.out.println("m5 Method");}
	void m6(){System.out.println("m6 Method");}
}



class Demo extends C {

	public static void main(String args[])
	{
                Demo d=new D();
                d.m1();
                d.m2();
                d.m3();
                d.m4();
                d.m5();
                d.m6();


}

}
