package com.neuedu.java;



public class ceshi2 {
    public int year;//0
    public int month;//0
    public int day;//0
    public static final int default_month = 2;
    public static final int default_day = 16;
    public ceshi2(int y, int m, int d) {
    	year = y; month = m; day = d;
    }
    public ceshi2(int y) {
    	this(y, default_month, default_day);
    }
    public ceshi2(int y, int m) {
    	this(y, m, default_day);
}
}
 class ChildConstructor extends ceshi2{
    public ChildConstructor(int h) {
    	super(1977, 8);
    }
    public static void main(String[] args) {
    	ChildConstructor t = new ChildConstructor(12);
    	System.out.println(t.year + "-" + t.month + "-" + t.day);
    }
}



