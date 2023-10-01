import java.util.*;

public class ExpValidCheck {
	public static void main(String[] args) {
		
		Stack st = new Stack();
		String expression = "(3+4)";
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='(')
					st.push(ch);
				else if(ch==')')
					st.pop();
			}
						
			if(st.isEmpty())
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			else
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		} catch(EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	}
}