/**
Hackerrank: https://www.hackerrank.com/challenges/phone-book/problem
*/
import java.util.*;

class Solution{
	public static void main(String []argh)
	{
		final Scanner in = new Scanner(System.in);
    final Map<String, Integer> contacts = new HashMap<>();
        
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            contacts.put(name, phone);
			in.nextLine();
		}
        
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(contacts.containsKey(s)) {
                System.out.println(s + "=" + contacts.get(s));
            } else {
                System.out.println("Not found");
            }
		}
        
    in.close();
	}
}


