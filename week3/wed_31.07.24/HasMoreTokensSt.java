import java.util.StringTokenizer;
public class HasMoreTokensSt{
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("Demonstrating methods from String Tokenizer class. This is a longer sentence to test.", " ");
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
