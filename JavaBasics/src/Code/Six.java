package Code;

/*
Switch���
�����ﶬ�ж� case��ֻ��дֵ
������1 2 12��
�ļ���3 4 5��
�＾��6 7 8��
������9 10 11��
ֻд�����������и���һ������
*/
import java.util.Scanner;

public class Six{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������1-12��");	
		
		int month = sc.nextInt();
		/*
		switch(month){
			case 1:
				System.out.println("���·����ڴ���");
				break;
			case 2:
				System.out.println("���·����ڴ���");
				break;
			case 3:
				System.out.println("���·������ļ�");
				break;
			case 4:
				System.out.println("���·������ļ�");
				break;
			case 5:
				System.out.println("���·������ļ�");
				break;
			case 6:
				System.out.println("���·������＾");
				break;
			case 7:
				System.out.println("���·������＾");
				break;
			case 8:
				System.out.println("���·������＾");
				break;
			case 9:
				System.out.println("���·����ڶ���");
				break;
			case 10:
				System.out.println("���·����ڶ���");
				break;
			case 11:
				System.out.println("���·����ڶ���");
				break;
			case 12:
				System.out.println("���·����ڴ���");
				break;
			default:
				System.out.println("��������·��д�");
		*/
		
		//case ��͸
		switch(month){
			case 1:
			case 2:
			case 12:
				System.out.println("���·����ڴ���");
				break;
			case 3:				
			case 4:
			case 5:
				System.out.println("���·������ļ�");
				break;
			case 6:
			case 7:				
			case 8:
				System.out.println("���·������＾");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("���·����ڶ���");
				break;
			default:
				System.out.println("��������·��д�");
		}
	}
}