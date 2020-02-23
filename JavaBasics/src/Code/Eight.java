package Code;

/*
	求和
	1-5之间的和
*/
public class Eight{
	public static void main(String[] args){

		int sum = 0;
		for(int i = 1;i <= 5;i++){
			sum += i;
		}
		System.out.println("1-5之间的和："+sum);
	}
}
