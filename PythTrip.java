import java.math.*;
public class PythTrip{
	public static void main(String[] args){
		int answer = 0;
		for(int b=1;;b++){
			for(int a=0;a<b;a++){
				int c = (a*a)+(b*b);
				if((a+b+Math.sqrt(c))==1000){
					int temp = a*b*(int)Math.sqrt(c);
					System.out.println(temp);
					return;
				}
			}
		}
	}
}