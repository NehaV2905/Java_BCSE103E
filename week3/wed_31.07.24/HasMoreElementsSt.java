import java.util.StringTokenizer;
public class HasMoreElementsSt{
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("Hello everyone I am a java developer", " ");
		while (st.hasMoreElements()){
			System.out.println(st.nextToken());
		}
	}
}

