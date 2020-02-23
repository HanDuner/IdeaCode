package Code;

/*
珠穆朗玛峰
世界最高山峰是珠穆朗玛峰（8844.43米=8844430毫米），假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我要折叠多少次，可以折成珠穆朗玛峰的高度？
*/
public class Eveven{
	public static void main(String[] asgs){
		
		int count = 0;
		int mountain = 8844430;
		double paper = 0.1;
		while(paper <= mountain){
			paper *= 2;//纸张厚度加倍
			count ++;
		}
		System.out.println("需要折叠" + count + "次");
	}
}