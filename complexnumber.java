class comp
{
	float real=0, imag=0;
	comp()
	{
		real=imag=0;
	}
	comp(float r, float i)
	{
		real =r; imag=i;
	}
   comp add(comp c)
   {
	   comp res = new comp();
	   res.real = real + c.real;
	   res.imag = imag + c.imag;
	   return res;
   }
   comp subtract(comp c)
   {
	   comp res = new comp();
	   res.real = real - c.real;
	   res.imag = imag - c.imag;
	   return res;
   }
   comp multiply(comp c)
   {
	   comp res = new comp();
	   res.real = real*c.real - imag*c.imag;
	   res.imag = imag*c.real + real*c.imag;
	   return res;
   }
   void printdata()
   {
	   System.out.println("The complex number is "+real +" with imaginary "+imag);
   }
}
public class Complex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   comp c1 = new comp(10f,20f);
   comp c2 = new comp(30f,40f);
   comp c3 = c1.add(c2);
   comp c4 = c1.subtract(c2);
   comp c5 = c1.multiply(c2);
   c1.printdata();
   c2.printdata();
   c3.printdata();
   c4.printdata();
   c5.printdata();
   
	}

}
