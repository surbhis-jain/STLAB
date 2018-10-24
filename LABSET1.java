import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
		
		int a,b,c,choice;
		int min=1,max=200;
		while(true)
		{
		int ch=1;
		boolean checkTri;
		System.out.println("Enter three sides of a triangle\n");
		Scanner in= new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		System.out.println("Side a is = "+a+"\nSide b is = "+b+"\nSide c is = "+c);
		if ( a < min ||  a > max )
		{
			ch=0;
			System.out.println("Side a is not within the range (1 - 200)\n");
		}
		if ( b < min ||  b > max )
                {
			ch=0;
                        System.out.println("Side b is not within the range (1 - 200)\n");
                }
		if ( c < min || c > max )
                {
			ch=0;
                        System.out.println("Side c is not within the range (1 - 200)\n");
                }
		if(ch==0)
		{
			System.exit(0);
		}
		if( (a < b+c) && (b < a+c) && (c <a+b))
		{
			checkTri = true;
		}
		else
		{
			checkTri = false;
		}
		if(checkTri)
		{
		if( (a==b) && (b==c))
		{
			System.out.println("Equilateral triangle\n");
		}
		else if((a!=b) && ( a!=c) && (b!=c))
		{
			System.out.println("Scalene Triangle\n");
		}
		else
		{
			System.out.println("Isosceles Triangle\n");
		} 
	}
	else
	{
		System.out.println("Not a Triangle\n");
	}
		System.out.println("Do you want to contiue?\nEnter\n1.Yes\n2.No\n");
		choice = in.nextInt();
		switch(choice)
		{
			case 1 : break;
			case 2 : System.exit(0);
				break;
			default : System.out.println("Invalid choice\n");
		}
		in.close();
		}
	}	
}

