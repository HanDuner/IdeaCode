package Code;

/*
	ˮ�ɻ� 
	һ���ڿ���̨������С�ˮ�ɻ�����
	����ͳ��"ˮ�ɻ�"�ܹ��ж��ٸ�
	1��ˮ�ɻ���һ����λ��
	2��ˮ�ɻ��ĸ�λ��ʮλ����λ�����������͵���ԭ��
*/
public class Ten{
	public static void main(String[] args){
		int count = 0;
		for(int i = 100;i <= 999;i++){
			
			int unitPlace = i/1%10;
			int tenPlace = i/10%10;
			int hundredPlace = i/100%10;
			
			if(i == unitPlace*unitPlace*unitPlace + tenPlace*tenPlace*tenPlace + hundredPlace*hundredPlace*hundredPlace){
				//System.out.println("ˮ�ɻ�����"+ i);
				count++;
			}
		}
		System.out.println("ˮ�ɻ�������" + count + "��");
	}
}