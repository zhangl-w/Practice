package com.neuedu.java;

import java.util.Arrays;

/**
 * 2、设计一个方法，形参是一个浮点数数组（取值饭费[1.0，10.0]）表示某项比赛的评委评分
 * 请去掉一个最高分和最低分，计算平均分并返回
 * @author Administrator
 *
 */






public class Test2 {

	
	private static double avgScore;

	public static double  avgScore(double[] d)
	{
		double m = 0;
		double sum=0;
		for(int i=1;i<d.length;i++)
		{
			for(int j=0;j<d.length-i;j++)
			{
				if(d[j]>d[j+1])
				{
					m=d[j];
					d[j]=d[j+1];
					d[j+1]=m;
				}
			}
		}
		for(int i=1;i<d.length-1;i++)
		{
			sum+=d[i];
		}
		double avg = sum/(d.length-2);
		return avg;
		
		
		


	}
	
	public static void main(String[] args) {
	
		double[] d={7.0,6.0,6.8,8.8,8.9,9.0,7.5,9.5};
		//Arrays.sort(d);//对数组进行升序排序
		double avg = avgScore(d);
		System.out.println(avg);
		
}

}
