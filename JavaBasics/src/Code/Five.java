package Code;

/*
考试奖励
根据分数得到不一样的玩具。
*/
import java.util.Scanner;

public class Five{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入分数查询奖励");
		int grade = sc.nextInt();
		
		if(grade < 0 || grade > 100){// (&& 与) (|| 或)
			System.out.println("输入分数有误");
		}else if(grade >= 90 && grade <= 94 ){
			System.out.println("游乐场");
		}else if(grade >= 80){
			System.out.println("自行车");
		}else if(grade >= 70){
			System.out.println("变形金刚");
		}else{
			System.out.println("胖揍");
		}	
	}
}