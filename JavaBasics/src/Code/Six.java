package Code;

/*
Switch语句
春夏秋冬判断 case中只能写值
春季（1 2 12）
夏季（3 4 5）
秋季（6 7 8）
冬季（9 10 11）
只写了三个季节中各举一个例子
*/
import java.util.Scanner;

public class Six{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1-12月");	
		
		int month = sc.nextInt();
		/*
		switch(month){
			case 1:
				System.out.println("该月份属于春季");
				break;
			case 2:
				System.out.println("该月份属于春季");
				break;
			case 3:
				System.out.println("该月份属于夏季");
				break;
			case 4:
				System.out.println("该月份属于夏季");
				break;
			case 5:
				System.out.println("该月份属于夏季");
				break;
			case 6:
				System.out.println("该月份属于秋季");
				break;
			case 7:
				System.out.println("该月份属于秋季");
				break;
			case 8:
				System.out.println("该月份属于秋季");
				break;
			case 9:
				System.out.println("该月份属于冬季");
				break;
			case 10:
				System.out.println("该月份属于冬季");
				break;
			case 11:
				System.out.println("该月份属于冬季");
				break;
			case 12:
				System.out.println("该月份属于春季");
				break;
			default:
				System.out.println("您输入的月份有错");
		*/
		
		//case 穿透
		switch(month){
			case 1:
			case 2:
			case 12:
				System.out.println("该月份属于春季");
				break;
			case 3:				
			case 4:
			case 5:
				System.out.println("该月份属于夏季");
				break;
			case 6:
			case 7:				
			case 8:
				System.out.println("该月份属于秋季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("该月份属于冬季");
				break;
			default:
				System.out.println("您输入的月份有错");
		}
	}
}