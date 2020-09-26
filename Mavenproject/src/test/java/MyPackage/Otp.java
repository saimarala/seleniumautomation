package MyPackage;

import java.util.function.Supplier;

public class Otp {

	public static void main(String[] args) {
//		String otp="";
//		for(int i=0;i<6;i++) {
//			otp=otp+(int)(Math.random()*10);
//		}
//		System.out.println(otp);
		
//		Supplier<String> s=()->{
//			String otp="";
//			for(int i=0;i<6;i++) {
//				otp=otp+(int)(Math.random()*10);
//			}
//			return otp;
//		};
//		System.out.println(s.get());
		
		Supplier<String>s=()->{
			String pwd="";
			String symbols="ABCEDFGHIJKLMNOPQRSTUVWXYZ@#$";
		Supplier<Integer>d=()->(int)(Math.random()*10)	;
		Supplier<Character>c=()->symbols.charAt((int)Math.random()*29);
		
		for(int i=1;i<=8;i++) {
			if(i%2==0) {
				pwd=pwd+d.get();
			}else {
				pwd=pwd+c.get();
			}
		}
			return pwd;
		};
		
		System.out.println(s.get());
	}

}
