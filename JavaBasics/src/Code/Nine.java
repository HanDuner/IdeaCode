package Code;

/*
	求偶数和
	1-100之间的偶数和
*/
public class Nine{
	public static void main(String[] args){
		
		int sum = 0;
		for(int i = 1;i <= 100;i++){	
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("1-100之间的偶数和为：" + sum);
	}
}