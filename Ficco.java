package homework;
import java.lang.*;

public class Ficco {
	
	public static int Fibonacci(int n){
		if(n==0){
		return 0;
		}
		if(n==1){
		return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
           for(int i=0 ; i<100 ; i++){
        	   int k = Fibonacci(i);
        	   System.out.println(k);
           }
	}

}
