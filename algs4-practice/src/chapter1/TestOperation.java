package chapter1;

import java.util.Arrays;
public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = 1+"2";
		Num n = new Num(74);
//		int[] b = new int[10];
//		for(int i=0;i<10;i++) {
//			b[i]=b[b[i]];
//			System.out.println(b[i]);
//		}
		System.out.println(n.compareNum());
		System.out.println((char)('a'+4));
		
	}
}

class Num {
	private double n;
	
	public Num(double n) {
		this.n = n;
	}
	public Boolean compareNum() {
		return this.n > 0 && this.n<1;
		}
	}