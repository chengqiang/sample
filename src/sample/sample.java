package sample;

public class sample {
	public static void main(String [] args)
	{
	    Outer tt=new Outer();
	    tt.test();
	 // Outer.Inner ttt=new Outer.Inner();
	    
	}
}
class Outer
{
     private int outer_i=100;
     void test()
     {
	    Inner in=new Inner();
	    in.display();
     }
 public class Inner
  {
      void display()
      {
	       System.out.print("display"+outer_i);
       }
  }

}
