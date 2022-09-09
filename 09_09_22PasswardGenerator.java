package LamdaExpressionStreamApi;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.function.Predicate;


//interface Predicator {
//	public abstract boolean check(String otp);
//}
//
//interface Generator {
//	public abstract String generateOtp();
//}


public class PasswardGenerator {

	public static void main(String[] args) {
		Set<String> passward6 = new LinkedHashSet<>();
		Set<String> passwardNot6 = new LinkedHashSet<>();
		
		
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the no. of otp you want to generate");
		int passwardNo=scn.nextInt();
		
		
		
//		Generator og=()->{
//			int value=(int)(Math.random()*1000000);
//			String otpVal=String.valueOf(value);
//			
//			return otpVal;
//		};
		
		
		
		while(passwardNo>0)
		{
			IntSupplier value=()-> (int)(Math.random()*1000000);
			//String st=og.generateOtp();
			int ss=value.getAsInt();
			String st=String.valueOf(ss);
			
			Predicate<String > p=(l)->st.length()==6;
			
			
		   boolean bo=p.test(st);
		   
			if(bo==true)
			{
				passward6.add(st);

			}
			else {
				passwardNot6.add(st);
		
				
			}
			
		passwardNo--;

		 }
		
		System.out.println("....The 6digit otp generated are....");
		passward6.forEach(System.out::println);
		
		System.err.println("....The non 6digit otp generated are....");
		
		passwardNot6.forEach(System.err::println);
	}
	
}	
		
	
