package Code;

/*
���������
�������ɽ������������壨8844.43��=8844430���ף�����������һ���㹻���ֽ�����ĺ����0.1���ס�
���ʣ���Ҫ�۵����ٴΣ������۳����������ĸ߶ȣ�
*/
public class Eveven{
	public static void main(String[] asgs){
		
		int count = 0;
		int mountain = 8844430;
		double paper = 0.1;
		while(paper <= mountain){
			paper *= 2;//ֽ�ź�ȼӱ�
			count ++;
		}
		System.out.println("��Ҫ�۵�" + count + "��");
	}
}