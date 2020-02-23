package Code;

/*
	水仙花 
	一、在控制台输出所有“水仙花数”
	二、统计"水仙花"总共有多少个
	1、水仙花是一个三位数
	2、水仙花的个位、十位、百位的数字立方和等于原数
*/
public class Ten{
	public static void main(String[] args){
		int count = 0;
		for(int i = 100;i <= 999;i++){
			
			int unitPlace = i/1%10;
			int tenPlace = i/10%10;
			int hundredPlace = i/100%10;
			
			if(i == unitPlace*unitPlace*unitPlace + tenPlace*tenPlace*tenPlace + hundredPlace*hundredPlace*hundredPlace){
				//System.out.println("水仙花数："+ i);
				count++;
			}
		}
		System.out.println("水仙花数共有" + count + "个");
	}
}