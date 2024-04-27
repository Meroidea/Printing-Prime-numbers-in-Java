package firstProg;
import java.util.*;

public class suj {
    public static void main(String[] args){
    	//program to print all the prime numbers from 0 to 200
    	
    	int num;
    	int i;
    	int j;
    	
    	for(i=2; i<=200; i++) {
    		num=0;
    		for(j=2; j<i; j++) {
    			if(i%j==0) {
    				num=1;
    				break;
    			}
    		}
    			if(num==0) {
    				System.out.println(i);	
    			}
    	}
    	
    }	
}
