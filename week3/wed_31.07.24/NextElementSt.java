import java.util.StringTokenizer;
public class NextElementSt{
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day", " ");
		while (st.hasMoreTokens()){
			System.out.println(st.nextElement());
		}
	}
}

