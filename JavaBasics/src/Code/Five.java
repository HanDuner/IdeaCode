package Code;

/*
���Խ���
���ݷ����õ���һ������ߡ�
*/
import java.util.Scanner;

public class Five{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����������ѯ����");
		int grade = sc.nextInt();
		
		if(grade < 0 || grade > 100){// (&& ��) (|| ��)
			System.out.println("�����������");
		}else if(grade >= 90 && grade <= 94 ){
			System.out.println("���ֳ�");
		}else if(grade >= 80){
			System.out.println("���г�");
		}else if(grade >= 70){
			System.out.println("���ν��");
		}else{
			System.out.println("����");
		}	
	}
}