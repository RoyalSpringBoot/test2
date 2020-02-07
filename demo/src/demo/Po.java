package demo;

import java.util.Random;

public class Po {
	public static void main(String[] args) {
		Random random=new Random();

		while(true) {
			int a=random.nextInt(100);
			int b=random.nextInt(100);
			int c=100;

			if (a+b==c) {
				System.out.println("a"+a+",b"+b);
				////////hkkbj
			}
		}
	}

}
