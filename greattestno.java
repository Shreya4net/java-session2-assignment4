import java.util.Scanner;
public class greattestno {
public static void  main(String args[])
{
	System.out.println("Enter three diffrent numbers");
	Scanner inputTaker = new Scanner(System.in);
int x= inputTaker.nextInt();
int y= inputTaker.nextInt();
int z=inputTaker.nextInt();
if(x>y && x>z){
	System.out.println(x+ "is largest");
}else if(y>z && y>x){
	System.out.println(y+"is largest");
}else if(z>x && z>y){
	System.out.println(z+"is largest");
}
}
}



