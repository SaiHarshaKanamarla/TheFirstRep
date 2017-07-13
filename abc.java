import java.util.*;
class Test
{
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static int k=0;
	public void rotate(int [] arr)
	{
		int i;
		int temp = arr[0];
		for(i=0;i<arr.length-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	public void printarray(int [] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void rotatemany(int [] arr,int d)
	{
		int i;
		int sum1
		int j;
		for(i=0;i<d;i++)
		{
			sum1=0;
			rotate(arr);
			printarray(arr);
			for(j=0;j<arr.length;j++)
			{
				sum1 += arr[j] * j;
			}
			list.add(sum1);
		}
	}
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		Test t = new Test();
		t.rotatemany(arr,n);
	for(i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("max is "+Collections.max(list));
	}	
}