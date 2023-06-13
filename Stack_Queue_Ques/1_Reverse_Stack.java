import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}
	public static void reverse(Stack<Integer> st)
	{
	    if(st.isEmpty())
	    {
	        return;
	    }
	    int x=st.pop();
	    reverse(st);
	    Insert_Down(st,x);
	}
	public static void Insert_Down(Stack<Integer> st,int x)
	{
	    if(st.isEmpty())
	    {
	        st.push(x);
	        return;
	    }
	    int y=st.pop();
	    Insert_Down(st,x);
	    st.push(y);
	}
}
