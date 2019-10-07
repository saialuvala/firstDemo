package com.interview.practise;

import java.util.Arrays;

class Exce0 extends Exception{

}
class Exce1 extends Exce0{

}
public class ExceptionDemo {

	public  void main(String args[]) {
		AbstartDemo d = new AbstartDemo();
		int total = 0;
		try {
			//throw new Exce1();
			//System.out.println("A");
			d.display();

			int n=9;
			int[] b = {10,20,20,10,10,30,50,10,20};
			int[] c = new int[n];
			 for (int c_i = 0; c_i < n; c_i++) {
		            c[c_i] = b[c_i];
		        }
		        Arrays.sort(c);
			
			for (int i = 0; i < n - 1; i++) {
	            if (i < n && c[i] == c[i + 1]) {
	                total++;
	                i = i + 1;
	            }
			
		}
		}
		catch(Exception e) {
			System.out.println("EXCEPTION");
		}
		System.out.println(total);

	}
}
