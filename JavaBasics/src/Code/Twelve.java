package Code;

/*
������
�����Զ�����һ��1-100֮������֣�ʹ�ó���ʵ�ֲ³���������Ƕ��٣�
���´��ʱ����ݲ�ͬ���������Ӧ����ʾ
1������µ����ֱ���ʵ���ִ���ʾ��µ����ݴ��ˡ�
2������µ����ֱ���ʵ����С����ʾ��µ�����С�ˡ�
3������µ���������ʵ������ȣ���ʾ��ϲ������ˡ�
*/
import java.util.Random;
import java.util.Scanner;
public class Twelve {
	public static void main( String[] args ) {
		Random r = new Random();
		int number = r.nextInt( 100 ) + 1;
		System.out.println("��������µ����֣�");
		
		while( true ) {
			Scanner sc = new Scanner( System.in );
			int writeNumber = sc.nextInt();
			
			if( writeNumber < number ) {
				System.out.println("��µ�����С��");
			}else if ( writeNumber > number ) {
				System.out.println("��µ����ݴ���");
			}else {
				System.out.println("��ϲ�������");
				break;
			}			
		}
	}
}