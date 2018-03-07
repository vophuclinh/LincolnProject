import java.util.Scanner;
import java.util.Random;
public class test {

	public static void main(String[] args) {
		//System.out.println("Input: ");
		//Scanner sc = new Scanner(System.in);
		//String s = sc.next();
	String result=null;
	int count=0;
	String[] numEn= {"one","two","three","four","five","six","seven","eight","nine","ten"};
	String[] numDe= {"eins","zwei","drei","vier","funf","sechs","sieben","achts","neun","zehn"};
	Random rand = new Random();
	for (int j=0; j<1000;j++)
	{int n=rand.nextInt(10);
	result=Translate1.Translate(numEn[n]);
	System.out.print("Expected value:"+numDe[n]);
	System.out.print("        ");
	System.out.println("Real value:"+result);
	
	if(numDe[n].equals(result)) {count++;}
	}
	
	String t = "abc";
	result=Translate1.Translate(t);
	System.out.print("Expected value:Error!");
	System.out.print("        ");
	System.out.println("Real value:"+result);
	if(result.equals("Error!")) {count++;}
	
	if(count==1001) {
	System.out.print("All test successfull!!");
}}}
