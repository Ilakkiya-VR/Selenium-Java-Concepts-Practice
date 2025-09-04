package SeleniumClass;

public class LoopAssign {

	public static void main(String[] args) {
		// print I am Batman﻿ five times
		for(byte a=0;a<5;a++) 
		{System.out.println("I am Batman");}
		System.out.println("---------");
		//print I am Batman﻿1 9 times
		for(byte a=1;a<10;a++) 
		{System.out.println("I am Batman"+a);}
		System.out.println("---------");
		//10 to 1 using for, while and do-while loop
		for(byte a=10;a>0;a--) 
		{System.out.println(a);}
		System.out.println("---------");
		byte b=10;
		while(b>0) {System.out.println(b);b--;}
		System.out.println("---------");
		byte c=10;
		do
		{
			System.out.println(c);
		     c--;}
		while(c>0);
		System.out.println("---------");
		byte d=0;
		while(d<10)
		{System.out.println("Hello World");
		d++;
		}
		System.out.println("---------");
		for(int m=0;m<=50;m++) {
			if(m%5==0) 
			{System.out.println(m);}	
		}
		System.out.println("---------");
		int n=0;
		while(n<=50) {
			if(n%5==0) 
			{System.out.println(n);}
			n++;
		}
		System.out.println("---------");
		int p=0;
		do {
			if(p%5==0)
				{System.out.println(p);}
			p++;
		  }
		while(p<=50);
		System.out.println("---------");
		for(int q=0;q<=30;q++) {
			if(q%3==0) 
			{System.out.println(q);}	
		}
		System.out.println("---------");
		int r=0;
		do
		{if(r%10==0)
		{System.out.println(r);}
		r++;
		}
		while(r<=100);
		System.out.println("---------");
		for(int num=0;num<=100;num++) {
			if(num%2==0) 
			{System.out.println("Even Number:"+num);}	
			else
				System.out.println
				("Odd Number:"+num);
		}
			System.out.println("---------");
			int s=1;
				while(s<=1) {

					break;
				}
				System.out.println("---------");
				for(char ch='A';ch<='Z';ch++)
					{System.out.println(ch+":ASCII Value:"+(int)ch); }
				System.out.println("--------");
				char x='a';
				while(x<='z') {System.out.println(x+":ASCII Value:"+(int)x);x++;}
				System.out.println("--------");
				char z='0';
				do
				{System.out.println(z+":ASCII Value:"+(int)z);
				z++;}
				while(z<='9');
				System.out.println("--------");
				float de=1.0f;
				while(de<=10.0) {System.out.println(de);de++;}
				System.out.println("--------");
				for(int ab=0;ab<=99;ab++) {
					if(ab%9==0) {System.out.println(ab);}
				}
				System.out.println("--------");
				for(char bc='a';bc<='z';bc++) {
					if(bc=='a') System.out.println(bc);
					else if(bc=='e') System.out.println(bc);
					else if(bc=='i') System.out.println(bc);
					else if(bc=='o') System.out.println(bc);
					else if(bc=='u') {System.out.println(bc);
					}
					System.out.println("--------");
					for(char cd='a';cd<='z';cd++) {
						if(cd=='a'||cd=='e'||cd=='i'||cd=='o'||cd=='u') System.out.println(cd);
					}
					System.out.println("--------");
					for(int ef=1;ef<=10;ef++) {
						System.out.println(ef);
						if(ef%7==0) {System.out.println("Bye, See You Tomrrow");break;}
					}
					System.out.println("--------");
					for(int i=0;i<=10;i++) {System.out.println("Cycle"+i%2);
					                    
					                        }
					                 
					                 }
	}       
				}			
	
	
					
	
	
	
	

