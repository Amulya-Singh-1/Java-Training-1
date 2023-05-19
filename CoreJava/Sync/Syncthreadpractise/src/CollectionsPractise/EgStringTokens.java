package CollectionsPractise;

import java.util.StringTokenizer;

public class EgStringTokens {
	public static void main(String[] args) {
		String str="This is java's might.";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
