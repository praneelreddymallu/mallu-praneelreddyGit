
import java.util.*;
import java.util.stream.Collectors;
public class StringProblem {

	public static void main(String[] args)
	{
		String a;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the list size");
		n=sc.nextInt();
		System.out.print("enter the list elements");
		List<String> list=new ArrayList<String>();
		for(int i=0;i<=n;i++)
		{
			a=sc.nextLine();
			list.add(a);
		}
		List<String> b=list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		System.out.print(b);

	}

}