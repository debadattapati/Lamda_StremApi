package LamdaExpressionStreamApi;
import java.util.*;
import java.util.stream.*;

public class ArrayToStream {

	
	public static void main(String[] args)
	{
	
		String[] arr = { "Lucky", "Ajmal", "Alok" };

		
		Stream<String> stm = Arrays.stream(arr);
		Stream<String> stm2 = Stream.of(arr);

		stm.forEach(System.out::println);
		stm2.forEach(str2 -> System.out.print(str2+" "));
		
		
		int arr1[] = { 1, 2, 3, 4, 5 };
		 
        IntStream stm1 = Arrays.stream(arr1);
       
        stm1.forEach(a -> System.out.print(a + " "));
        
        
        
        long[] arrL = { 3L, 5L, 6L, 8L, 9L };
        LongStream stmL = Arrays.stream(arrL);
        stmL.forEach(System.out::println);
  
        System.out.println();
  
        
        double[] arrD = { 1, 2, 3, 4, 5 };
        DoubleStream stmD = Arrays.stream(arrD);
        stmD.forEach(System.out::println);
	}
}
