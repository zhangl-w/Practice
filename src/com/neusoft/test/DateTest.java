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
		
		/*(1)��ҵ����ʹ��BigDecimal��

        (2)����ʹ�ò�������ΪString�Ĺ��캯����

        (3) BigDecimal���ǲ��ɱ�ģ�immutable���ģ��ڽ���ÿһ������ʱ���������һ���µĶ������������Ӽ��˳�����ʱǧ��Ҫ����������ֵ��
		BigDecimal�Ӽ��˳�����
		���ڳ��õļӣ������ˣ�����BigDecimal���ṩ����Ӧ�ĳ�Ա������
		public BigDecimal add(BigDecimal value);                        //�ӷ�
		public BigDecimal subtract(BigDecimal value);                   //���� 
		public BigDecimal multiply(BigDecimal value);                   //�˷�
		public BigDecimal divide(BigDecimal value);                     //����
//		���˳���ʵ���ն����ص���һ���µ�BigDecimal������ΪBigInteger��BigDecimal����
//		���ɱ�ģ�immutable���ģ��ڽ���ÿһ������ʱ���������һ���µĶ���
		BigDecimal a = new BigDecimal("4.5");
		BigDecimal b = new BigDecimal("1.5");
		System.out.println("a + b =" + a.add(b));
		System.out.println("a - b =" + a.subtract(b));
		System.out.println("a * b =" + a.multiply(b));
		System.out.println("a / b =" + a.divide(b));
		������һ����Ҫע����ǳ�������divide.
		BigDecimal�������ܳ��ֲ������������������ 4.5/1.3����ʱ�ᱨ��java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
		��ʵdivide�����п��Դ���������
		public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode) 
		��һ������ʾ������ ����������ʾС�������λ����������������ʾ����ģʽ��
		
		BigDecimal a1 = new BigDecimal("4.5635");
		a1 = a1.setScale(3, RoundingMode.HALF_UP);    //����3λС��������������
		System.out.println(a1);
        
        //BigDecimal�Ƚϴ�С
        BigDecimal a2 = new BigDecimal (101);
        BigDecimal b2 = new BigDecimal (111);
        //ʹ��compareTo�����Ƚ�
        //ע�⣺a��b������Ϊnull������ᱨ��ָ��
        if(a2.compareTo(b2) == -1){
            System.out.println("aС��b");
        }
         
        if(a2.compareTo(b2) == 0){
            System.out.println("a����b");
        }
         
        if(a2.compareTo(b2) == 1){
            System.out.println("a����b");
        }
         
        if(a2.compareTo(b2) > -1){
            System.out.println("a���ڵ���b");
        }
         
        if(a2.compareTo(b2) < 1){
            System.out.println("aС�ڵ���b");
        }
        
        
        //BigDecimalתString
        ��toString()��������ľ�����ͨ�������ַ�����
          stripTrailingZeros()������������ȥ��ĩβ�����0�ģ�
                         ��toPlainString()��������toString(),���������ѧ���������ַ�����
        // �������Ĵ�ӡ
        System.out.println(new BigDecimal("10000000000").toString());

        // ��ͨ�������ַ���
        System.out.println(new BigDecimal("100.000").toString());

        // ȥ��ĩβ�����0
        System.out.println(new BigDecimal("100.000").stripTrailingZeros().toString());

        // ���������ѧ������
        System.out.println(new BigDecimal("100.000").stripTrailingZeros().toPlainString());*/
		  myCalendar();
    }

    public static void myCalendar() {
        int lastDay=0,firstDay=0,currentDay=0;
        System.out.println("������һ�����ڣ���ʽΪ��yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            lastDay = calendar.getActualMaximum(Calendar.DATE);	//��ǰ�����е�ǰ�¶�Ӧ���������
            currentDay = calendar.get(Calendar.DATE);	//��ǰ�����еĵ�ǰ��
            calendar.set(Calendar.DATE, 1); // ����Ϊ��ǰ�µĵ�һ��
            firstDay = calendar.get(Calendar.DAY_OF_WEEK);	//��һ���Ӧ��������

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("��\tһ\t��\t��\t��\t��\t��\n");
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
