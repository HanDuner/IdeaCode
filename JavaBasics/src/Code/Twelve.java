package Code;

/*
猜数字
程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
当猜错的时候根据不同情况给出相应的提示
1、如果猜的数字比真实数字大，提示你猜的数据大了。
2、如果猜的数字比真实数字小，提示你猜的数据小了。
3、如果猜的数字与真实数字相等，提示恭喜你猜中了。
*/
import java.util.Random;
import java.util.Scanner;
public class Twelve {
	public static void main( String[] args ) {
		Random r = new Random();
		int number = r.nextInt( 100 ) + 1;
		System.out.println("请输入你猜的数字：");
		
		while( true ) {
			Scanner sc = new Scanner( System.in );
			int writeNumber = sc.nextInt();
			
			if( writeNumber < number ) {
				System.out.println("你猜的数据小了");
			}else if ( writeNumber > number ) {
				System.out.println("你猜的数据大了");
			}else {
				System.out.println("恭喜你猜中了");
				break;
			}			
		}
	}
}