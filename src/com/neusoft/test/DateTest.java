package com.neusoft.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		System.out.println(sdf.format(d));
		
		/*(1)商业计算使用BigDecimal。

        (2)尽量使用参数类型为String的构造函数。

        (3) BigDecimal都是不可变的（immutable）的，在进行每一步运算时，都会产生一个新的对象，所以在做加减乘除运算时千万要保存操作后的值。
		BigDecimal加减乘除运算
		对于常用的加，减，乘，除，BigDecimal类提供了相应的成员方法。
		public BigDecimal add(BigDecimal value);                        //加法
		public BigDecimal subtract(BigDecimal value);                   //减法 
		public BigDecimal multiply(BigDecimal value);                   //乘法
		public BigDecimal divide(BigDecimal value);                     //除法
//		减乘除其实最终都返回的是一个新的BigDecimal对象，因为BigInteger与BigDecimal都是
//		不可变的（immutable）的，在进行每一步运算时，都会产生一个新的对象
		BigDecimal a = new BigDecimal("4.5");
		BigDecimal b = new BigDecimal("1.5");
		System.out.println("a + b =" + a.add(b));
		System.out.println("a - b =" + a.subtract(b));
		System.out.println("a * b =" + a.multiply(b));
		System.out.println("a / b =" + a.divide(b));
		这里有一点需要注意的是除法运算divide.
		BigDecimal除法可能出现不能整除的情况，比如 4.5/1.3，这时会报错java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
		其实divide方法有可以传三个参数
		public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode) 
		第一参数表示除数， 二个参数表示小数点后保留位数，第三个参数表示舍入模式。
		
		BigDecimal a1 = new BigDecimal("4.5635");
		a1 = a1.setScale(3, RoundingMode.HALF_UP);    //保留3位小数，且四舍五入
		System.out.println(a1);
        
        //BigDecimal比较大小
        BigDecimal a2 = new BigDecimal (101);
        BigDecimal b2 = new BigDecimal (111);
        //使用compareTo方法比较
        //注意：a、b均不能为null，否则会报空指针
        if(a2.compareTo(b2) == -1){
            System.out.println("a小于b");
        }
         
        if(a2.compareTo(b2) == 0){
            System.out.println("a等于b");
        }
         
        if(a2.compareTo(b2) == 1){
            System.out.println("a大于b");
        }
         
        if(a2.compareTo(b2) > -1){
            System.out.println("a大于等于b");
        }
         
        if(a2.compareTo(b2) < 1){
            System.out.println("a小于等于b");
        }
        
        
        //BigDecimal转String
        用toString()方法输出的就是普通的数字字符串。
          stripTrailingZeros()函数就是用于去除末尾多余的0的，
                         用toPlainString()函数代替toString(),避免输出科学计数法的字符串。
        // 浮点数的打印
        System.out.println(new BigDecimal("10000000000").toString());

        // 普通的数字字符串
        System.out.println(new BigDecimal("100.000").toString());

        // 去除末尾多余的0
        System.out.println(new BigDecimal("100.000").stripTrailingZeros().toString());

        // 避免输出科学计数法
        System.out.println(new BigDecimal("100.000").stripTrailingZeros().toPlainString());*/
		  myCalendar();
    }

    public static void myCalendar() {
        int lastDay=0,firstDay=0,currentDay=0;
        System.out.println("请输入一个日期：格式为：yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            lastDay = calendar.getActualMaximum(Calendar.DATE);	//当前日期中当前月对应的最大天数
            currentDay = calendar.get(Calendar.DATE);	//当前日期中的当前天
            calendar.set(Calendar.DATE, 1); // 设置为当前月的第一天
            firstDay = calendar.get(Calendar.DAY_OF_WEEK);	//第一天对应的星期数

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("日\t一\t二\t三\t四\t五\t六\n");
        for (int j = 1; j < firstDay; j++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= lastDay; i++) {
            if (i == currentDay) {
                System.out.print("#");
            }
            System.out.print(i + "\t");
            if ((i - (8 - firstDay)) % 7 == 0) {
                System.out.println("\n");
            }
        }

	}
	
	
}
