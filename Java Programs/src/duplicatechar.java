
public class duplicatechar {
	public static void main(String[] args) {
		String s ="responsibility";
		int c;
		char st[]= s.toCharArray();
		
		for (int i = 0; i < st.length; i++) {
			c=1;
			for (int j = i+1; j < st.length; j++) {
				if (st[i]== st[j]&&st[i] != ' ') {
					c++;
					st[j]='0';
				}
			}
			if(c>1&&st[i] != '0') {
				System.out.println(st[i]);
			}
		}
	}
}
