package MyPackage;


import java.util.*;
import java.util.stream.Collectors;

public class Logics {

    public static void main(String[] args) {
        //swap two numbers
				/*int x=10,y=20;

				x=x+y;
				y=x-y;
				x=x-y;
				System.out.println(x);
				System.out.println(y);*/

        //fibonacci series
//				int n1=0,n2=1,num=10;
//				int n3=0;
//				System.out.print(n1+" "+n2);
//				for(int i=2;i<num;i++) {
//					n3=n1+n2;
//					System.out.print(" "+n3);
//					n1=n2;
//					n2=n3;
//				}

        //factorial

//				int fact=1,num=5;
        //
//				for(int i=1;i<=num;i++) {
//					fact=fact*i;
//				}
//				System.out.println("factorial "+num+"is: "+fact);
				//prime or not
//				  boolean flag=false;
//				int num=3;
//
//				for(int i=2;i<num;i++) {
//					if(num%i==0)
//					{
//						flag=true;
//						break;
//					}
//				}
//				if(!flag) {
//					System.out.println("prime");
//				} else {
//				    System.out.println("not prime");
//				}

				/*
				 * *
				 * ***
				 *


				for(int i=1;i<=5;i++) {
					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}*/

				/*	int l=5;

				for(int i=1;i<=l;i++) {

					for(int k=l-1;k>=i;k--) {
						System.out.print(" ");
					}


					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}*/
				/*int l=5;
				for(int i=1;i<=5;i++) {
						//spaces
					for(int k=l-1;k>=i;k--) {
						System.out.print(" ");
					}

					for(int j=1;j<=i;j++) {
						System.out.print("*");
					}

					for(int w=1;w<i;w++) {
						System.out.print("*");
					}
					System.out.println("");
				}*/

        //		try {
        //			while(2>1) {
        //
        //				System.out.println("hi");
        //
        //				int x=1;
        //				System.out.println(x);
        //				x++;
        //				if(x==10) {
        //					break;
        //				}
        //		}
        //		}
        //		catch(Exception e) {
        //
        //		}
        //multiplication table
//								System.out.println("enter data");
//								Scanner sc=new Scanner(System.in);
//								int num=sc.nextInt();
//							int num=5;
//								
//								for(int i=1;i<10;i++) {//
//									System.out.println(num+"*"+i+"="+(num*i));
//								}
        //sum of given number

//        		int num;
//        		int sum=0;
//        		Scanner sc=new Scanner(System.in);
//        		System.out.println("enter the num");
//        		num=sc.nextInt();
//        		while(num>0) {
//        			sum=sum+num%10;
//        			num=num/10;
//        		}
 //       	System.out.println(sum);


        //Palindrome number

//						int num=343;
//						int sum=0;
//						int  temp=num;
//						while(num>0) {
//							sum=(sum*10)+num%10;
//							num=num/10;
//						}
//						if(temp==sum) {
//							System.out.println("Palindrome number"+sum);
//						}
//						else {
//							System.out.println("not Palindrome number");
//						}

        //Armstrong number

//						int num=153;
//						int rem=0;
//						int sum=0;
//						int temp=num;
//
//						while(num!=0) {
//							rem=num%10;
//        					sum=sum+(rem*rem*rem);
//							num=num/10;
//						}
//						if(sum==temp) {
//							System.out.println("Armstrong number");
//						}
//						else {
//							System.out.println("not Armstrong number");
//						}

        //even or odd

        //		int num=50,rem=0;
        //		String x="56";
        //						rem=num%2;
        //		if(rem==0) {
        //			System.out.println("even");
        //		}
        //		else {
        //			System.out.println("odd");
        //		}
        //
        //int rem=0,arraysize=5;
        //		int myarray[]=new int[arraysize];
        //
        //		myarray[0]=23;
        //		myarray[1]=60;
        //		myarray[2]=50;
        //		myarray[3]=45;
        //		myarray[4]=30;

        //		int myarray[]=new int[] {20,50,23,3450,90};
        //		System.out.println(myarray.length);
        //
        //		for(int i=0;i<=myarray.length-1;i++) {
        //			rem=myarray[i]%2;
        //
        //			if(rem==0) {
        //				System.out.println("even");
        //			}else {
        //				System.out.println("odd");
        //			}
        //		}


        //		for(int i=0;i<5;i++) {
        //			if(i%2==0) {
        //				System.out.println("even");
        //			}else {
        //				System.out.println("odd");
        //			}
        //		}


        //for each

        //		int arr[]= {2,3,4,5,6,7};
        //		int a[]=new  int[] {3,4,7,9};
        //
        //		for(int i:arr) {
        //
        //			System.out.println(i);
        //
        //		}

        //		ArrayList<String> list=new ArrayList<String>();
        //		list.add("selenium");
        //		list.add("java");
        //		list.add("javarobot");
        //
        //		for(String i:list) {
        //			System.out.println(i);
        //		}

        //
        //		int arr[]=new int[5];
        //		System.out.println(arr.length);
        //		Scanner sc=new Scanner(System.in);
        //		System.out.println("enter 5 number");{
        //			for(int i=0;i<=arr.length-1;i++) {
        //				arr[i]=sc.nextInt();
        //			}
        //			int tot=0;
        //			for(int j=0;j<=arr.length-1;j++) {
        //				tot=tot+arr[j];
        //			}
        //			System.out.println(tot);
        //		}
        //		ArrayList<Integer> x=new ArrayList();
        //
        //		Scanner sc=new Scanner(System.in);
        //		System.out.println("enter array size");
        //		int s=sc.nextInt();
        //		System.out.println("enter data");
        //
        //		for(int i=0;i<s;i++) {
        //			x.add(sc.nextInt());
        //		}
        //
        //		int tot=0;
        //		for(int i=0;i<s;i++) {
        //			tot=tot+x.get(i);
        //		}
        ////
        ////		System.out.println(tot);
//						String a="google";
//						String 	p[]=a.split("o");
//						System.out.println(p.length);
//						//System.out.println(p[0]);
//						
//						for(int i=0;i<p.length;i++) {
//							System.out.println(p[i]);
//						}
        //*********************


        //reverse a stirng

//				String z="";
//				char e='i';
//				int c=0;
//				String str="this is selenium";
//				//op :muineles si siht
//				
//				for(int i=str.length()-1;i>=0;i--) {
//					//char w=str.charAt(i);
//					z=z+str.charAt(i);
//					//z=z+w;
//				}
//				System.out.println(z);


        //no of appereances of char
        //		System.out.println("enter a char");
        //		String a=sc.nextLine();
        //		String b=a.toLowerCase();
//				String x="id iii";
//						char e='i';
//						int c=0;
//						
//						for(int i=0;i<x.length();i++) {
//							char w=x.charAt(i);
//							
//							if(w==e) {
//								c=c+1;
//							}
//							
//						}
//						System.out.println(c);
        //no of word count
        //
        //		System.out.println("enter a word");
        //		String w=sc.nextLine();
//						int c=0;
//						String w="selenium";
//						String x="selenium selenium asas  sasa";
//						String p[]=x.split(" ");
//						
//						for(int i=0;i<p.length;i++) {
//							String act=p[i];
//							if(act.equalsIgnoreCase(w)) {
//								c=c+1;
//							}
//						}
//						System.out.println(c);
//				
        //// length can be used for int[], double[], String[]
        // to know the length of the arrays.

        // length() can be used for String, StringBuilder, etc
        // String class related Objects to know the length of the String

//				//			//reverse word*******************
//						String reversedString="";
//						String str="this is selenium";
//						//op: siht si muineles
//						String words[]=str.split(" ");
        //
//						
//						for(int i=0;i<words.length;i++) {
//								String word=words[i];
//								String reverseWord="";
//								
//							for(int j=word.length()-1;j>=0;j--) {
//								reverseWord=reverseWord+word.charAt(j);
//									
//								}
//							reversedString = reversedString+reverseWord+" ";
//						}
//						
//					System.out.println(reversedString);


        //
//				//selenium is this 
//				String str="this is selenium";
//				String words[]=str.split(" ");
//				String reverse="";
//				for(int i=words.length-1;i>=0;i--) {
//					reverse=reverse+words[i]+" ";
//				}
//				
//				System.out.println(reverse);
//				

//
//
//					int arr[]= {1,9,6,2,5,8};
//					int n=arr.length;
//					//System.out.println(n);
//							
//					int temp=0;
//					for(int i=0;i<n;i++){
//						
//						for(int j=i+1;j<n;j++) {
//							if(arr[i]>arr[j]) {
//								temp=arr[i];
//								arr[i]=arr[j];
//								arr[j]=temp;				
//								
//							}
//							
//						}
//						
//						
//					}
//						
//						
//				    for (int i = 0; i < arr.length; i++) {     
//				        System.out.print(arr[i] + " "); 
//				        
//				    } 	
//					System.out.println();	
        //    System.out.println(n-3);
        //split alphanumeric
//				StringBuffer alpha=new StringBuffer(),num=new StringBuffer(),special=new StringBuffer();
//				String num1="";
//				String alp="";
//				String spec="";
//				String str="geeks01$$for02geeks03!@!!";
//				for(int i=0;i<str.length();i++) {
//					if(Character.isDigit(str.charAt(i))) {
//						num.append(str.charAt(i));
//						num1=num1+str.charAt(i);
//					}else if(Character.isAlphabetic(str.charAt(i))) {
//						alpha.append(str.charAt(i));
//						alp=alp+str.charAt(i);
//					}else {
//						special.append(str.charAt(i));
//						spec=spec+str.charAt(i);
//					}
//				}
//				System.out.println(num1);
//				System.out.println(alp);
//				System.out.println(spec);

        //infinite for loop

//				for(;;) {
//					System.out.println("sel");
//				}
        //list of prime numbers

//				
//				int limit=100;
//				int flag=0;
//				for(int i=1;i<limit;i++) {
//					flag=0;
//					for(int j=2;j<i;j++) {
//						if(i%j==0) {
//							flag=1;
//							break;
//						}
//					}
//						
//					if(flag==0) {
//						System.out.print(i +" ");
//					}
//				}

        //largest number & smallest number

//				int a[]={2,4,5,10,8,7,2};
//				
//				int smallest=a[0];
//				int largest=a[0];
//				for(int i=1;i<a.length;i++) {
//					if(a[i]>largest) {
//						largest=a[i];
//					}else if(a[i]<smallest) {
//						smallest=a[i];
//					}
//					
//					
//				
//			}
        //
//				System.out.println("largest :"+largest);
//				System.out.println("smallest :"+smallest);

        //list even & odd

//				int num=50;
//				for(int i=1;i<=num;i++) {
//					if(i%2!=0) {
//						System.out.print("odd num :"+i+" ");
//						System.out.println();
//					}else {
//						System.out.print("even num :"+i+" ");
//						
//					}
//				}
        //We all know that JVM divides the allocated memory to a Java program into two parts. one is Stack and another one is heap. Stack is used for execution purpose and heap is used for storage purpose. In that heap memory, JVM allocates some memory specially meant for string literals. This part of the heap memory is called String Constant Pool.
        //For example, when you create string objects using string literal like below, they will be stored in the String Constant Pool.
//				String s1="sel";
//				String s2="sel";
//				System.out.println(s1==s2);//true
//				//And when you create string objects using new keyword like below, they will be stored in the heap memory.
//				String s3=new String("sel");
//				String s4=new String("sel1");
//				System.out.println(s3==s4);//false
//				//In simple words, there can not be two string objects with same content in the string constant pool. But, there can be two string objects with the same content in the heap memory.
//				String s5=new String("Hello");
//				String s6="Hello";
//				System.out.println(s5 == s6);//false

        //switch case

//				String n="3";
//				switch(n) {
//				case "1":
//					System.out.println("one");
//					break;
//				case "2":
//					System.out.println("two");
//					break;
//				case "3":
//					System.out.println("three");
//					break;
//				case "4":
//					System.out.println("four");
//					break;
//				case "5":
//					System.out.println("five");
//					default:
//						System.out.println("not matchinh");
        //	}
        //concatenation
//				int a=100;
//				int b=200;
//				String x="hello";
//				String y="world";
//				double c=12.33;
//				double d=10.33;
//				
//				System.out.println(a+b);
//				System.out.println(x+y);
//				System.out.println(a+b+x+y);
//				System.out.println(x+y+a+b);
//				System.out.println(x+y+(a+b));//adding a+b
//				System.out.println(a+b+x+y+a+x+b+y);
//				System.out.println(a+b+x+y+a+b);
//				System.out.println(c+d);
//				System.out.println(x+y+c+d);

        //swap two strings
//				String a="hello";
//				String b="world";
//				System.out.println("before swapping");
//				System.out.println("the value of a is:"+a);
//				System.out.println("the value of b is:"+b);
//
//				//append a and b
//		//System.out.println("test :"+b.substring(0));
//				a=a+b;//helloworld
//				//store initial string a in string b
//				b=a.substring(0,a.length()-b.length());
//				//store initial string b in string a
//				a=a.substring(b.length());
//
//				System.out.println("after swapping");
//
//				System.out.println("the value of a is:"+a);
//				System.out.println("the value of b is:"+b);
				//Remove the duplicates in the string
//				String names[]= {"java","JavaScript","Ruby","java","Ruby","dd"};
//				Set<String> store=new HashSet<String>();
//				for(String name:names) {
//					if(store.add(name)==false) {
//						System.out.println("duplicate element is :"+name);
//						store.remove(name);
//					}
//				}
//				System.out.println(store);

//				int names[]= {1,2,3,4,5,1,2};
//				Set<Integer>store=new HashSet<Integer>();
//				System.out.println(store);
//				for(Integer name:names) {
//					if(store.add(name)==false) {
//						System.out.println("duplicate element is :"+name);
//						store.remove(name);
//					}
//				}
//				System.out.println(store);
		//Set
		List<Integer> numbers=Arrays.asList(1,2,2,4,4,3,5,6,7,8,9,1,0,-1,-1,-2);
		List<String> names=new ArrayList<>(Arrays.asList("Java","Ruby","Selenium","Java","Pyton","test","test"));
		Set<String> linkedHashSet=new LinkedHashSet<>(names);
		System.out.println(linkedHashSet);
		Set<Integer> hashSet=new HashSet<>(numbers);
		System.out.println(hashSet);
		List<Integer>  numbersListWithoutDuplicate=new ArrayList<>(hashSet);
		System.out.println(numbersListWithoutDuplicate);
		//JDk 8 -Stream :
		Set<String> marks=names.stream().distinct().collect(Collectors.toSet());
		Set<String> set=names.stream().collect(Collectors.toSet());
		System.out.println(names.stream().distinct().collect(Collectors.toSet()));
		System.out.println(marks);
		System.out.println("set:"+marks);
//				
//				
//			int a=1000,b=000,c=300;
//				
//				if(a>b & a>c){
//					System.out.println("a is greater");
//					
//					}
//				else if(b>c){
//						
//					
//					System.out.println("b is greater");
//					
//				}
//				else {
//					System.out.println("c is greater");
//				}

//				
//				String str = "this # Is$ selenium123 Testing4";
//			//	str = str.replaceAll("[a-zA-Z0-9]", "");
//			//	str=str.replaceAll("[^0-9]","");
//				str=str.replaceAll("[^a-zA-Z0-9]", "");
//				System.out.println(str);

//				String[] str = { "GEEKS", "FOR", "GEEKS" }; 
//		        System.out.println(str[0].length()); 

//		        
//		        String str="he selenium";
//		        StringBuffer s=new StringBuffer(str);
//		        System.out.println(s.reverse());

        //how to find missing numbers in array
//				
//				int a[]= {1,2,3,5};
//				
//				int sum=0;
//				for(int i=0;i<a.length;i++) {
//					sum=sum+a[i];
//				}
//				System.out.println(sum);
//				int sum1=0;
//				for(int j=1;j<=5;j++) {
//					sum1=sum1+j;
//					
//				}
//				System.out.println(sum1);
//				System.out.println("missing number:"+(sum1-sum));
        //count no of vowels
//			String str="this is selenium";
//			char ch[]=str.toCharArray();
//			int count=0;
//			for(char c:ch) {
//				
//				switch(c){
//				case 'a':
//				case 'e':
//				case 'i':
//				case 'o':
//				case 'u':
//					count++;
//					//break;
//				
//				}
//				
//			}
//			System.out.println(count);

//			int count=0;
//				String str="this is selenium";
//				String str2="";
//				//char ch[]=str.toCharArray();
//				for(int i=0;i<str.length();i++) {
//					char w=str.charAt(i);
//							
//					if(w=='a' ||w=='e'||w=='i'||w=='o'||w=='u') {
//						System.out.print(w+" ");
//						count++;
//				}	else {
//					str2=str2+w;
//				}
//			}
//				System.out.println("");
//				System.out.println(count);
//				System.out.println(str2);

//				String s="java";
//				String s1="java";
//				s1="selenium";
//				//s=s1;
//				System.out.println(s.hashCode());
//				System.out.println(s1.hashCode());

        //Write a code to check whether one string is a rotation of another?
//				String str1 = "avajava";  
//		        String str2 = "javaava";
//		        
//		        String st3=str1+str2;
//		        if(st3.contains(str2) && str1.length()==str2.length()) {
//		        	System.out.println("rotation");        	
//		        }
//		        else {
//		        	System.out.println("not rotation");
//		        }
//				

//		        How do you count the number of occurrences of each character in a string?
//		        
//		        String s="mmababctamantlslmag";
//		        int count = 0 ;
        //
//		        for (int i = 0; i < s.length(); i++) {
        //
//		            for (int j = 0; j < s.length(); j++) {
        //
//		                if(s.charAt(i)==s.charAt(j))
//		                {
//		                    count++;
        //
//		                }
//		            }   
//		            System.out.println(s.charAt(i)+"--"+count);
//		            String d1=String.valueOf(s.charAt(i)).trim();
//		            s=s.replaceAll(d1,"");
//		            count = 0;
//		            
//		        }

        //HashMap

//				String str="selenium sai ";
//
//				HashMap<Character ,Integer> charCountMap=new HashMap<Character ,Integer>();
//				char[]ch=str.toCharArray();
//				for(char c:ch) {
//
//					if(charCountMap.containsKey(c)) {
//						charCountMap.put(c, charCountMap.get(c)+1);
//						//System.out.println(charCountMap.put(c, charCountMap.get(c)+1));
//					}else {
//						charCountMap.put(c, 1);
//					}
//				}
//
//		        for(Map.Entry entry :charCountMap.entrySet()) {
//
//		        	System.out.println(entry.getKey()+"  "+entry.getValue());
//		        }
//        //find occurance of duplicates
//        Set<Character> chrs=charCountMap.keySet();
//				for (char c:chrs){
//				    if (charCountMap.get(c)>1){
//				        System.out.println(c+":"+charCountMap.get(c));
//                    }
//                }

        //Java program to print alphabets
//		        for(char ch='a';ch<='z';ch++) {
//		        	System.out.println(ch);
//		        }

        //ip address
        // System.out.println(InetAddress.getLocalHost());

//		        String str="the order 1233456 has been placed";
//		        String p[]=str.split(" ");
//		        System.out.println(p[2]);
//		        
        //only one word reverse
//		        String str1="This is selenium java selenium";
//		        
//		        String[]p=str1.split(" ");
//		        String z="";
//		        for(int i=0;i<p.length;i++) {
//		        	String exp=p[i];
//		        	if(exp.equals("selenium")) {
//		        		for(int j=exp.length()-1;j>=0;j--) {
//		        			z=z+exp.charAt(j);
//		        			
//		        		}
//		        	}
//		        	
//		        }
//		        
//		System.out.println(z);
//		str1=str1.replace("selenium",z);
//		System.out.println(str1);

        // How do you count the number of occurrences of each character in a string?
//        String str="This is Selenium with Java is";
//        String[] words=str.split(" ");
//        Map<String,Integer>wordcount=new HashMap<>();
//        for (String word :words){
//          if(wordcount.containsKey(word)){
//              wordcount.put(word.toLowerCase(),wordcount.get(word)+1);
//          }else{
//              wordcount.put(word,1);
//          }
//        }
////          // How do you count the number of occurrences of each character in a string?
////        for(Map.Entry en:wordcount.entrySet()){
////            System.out.println(en.getKey()+":"+en.getValue());
////
////        }
// //       //*****************************************find occurance of duplicates
//        Set<String>wordstring=wordcount.keySet();
//        for (String word:wordstring){
//            if(wordcount.get(word)>1){
//                System.out.println(word+":"+wordcount.get(word));
//            }
//        }

        //Print hello world without using semi colon (;)
        //1
//		if(System.out.printf("hello world "+"\n")==null){
//		}
//		//2
//		if(System.out.append("hello world"+"\n")==null){
//        }
//		//3
//        if(System.out.append("hello world"+"\n").equals(null)){
//        }
//        //4
//        for (int i=0;i<1;System.out.println("hello world")){
//            i++;
//        }

//        //  output numbers from 1 to 100 without using numbers in your code
//       int one = 'A' / 'A';//1
//        String s1 = "..........";
//        for (int i = one; i <= s1.length() * s1.length(); i++) {
//            System.out.println(i);
//        }

//        //a-97 b-98 c-99 d-99
//        for (int i=one;i<='d';i++){
//            System.out.println(i);
//        }
        //Compare two int numbers (Integer caching)
//        //-128 to 127
//        Integer num1=100;
//        Integer num2=100;
//        if(num1==num2){
//            System.out.println("both are equal");
//        }else{
//            System.out.println("both are not equal");
//        }
        //What will be the output when you divide a number by zero?
        //Number=Integer,Double,Float
//        System.out.println(9.0 / 0);//Infinity
//        System.out.println(22.33f / 0);//Infinity
//        System.out.println(10 / 0.0);//Infinity
//        System.out.println(19.999999d / 0);//Infinity
////        System.out.println(1/0);//Arithmetic exception
////        System.out.println(0/0);//Arithmetic exception
//        System.out.println(0.0 / 0);//NaN
//        System.out.println(0.0 / 0.0);//NaN
//        System.out.println(12.33 / 0.0);//Infinity


    }

}
