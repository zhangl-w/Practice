package com.neusoft.test;

import java.util.Scanner;

public class C {
	public static void main(String[] args) throws StringToolLongException{
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String s=scan.nextLine();
			try{
				if(s.length()>20){
					throw new StringToolLongException();
				}
				else{
					System.out.println(s);
				}
			}catch(StringToolLongException e){
				e.printStackTrace();
			}
			
		}
	}

}
