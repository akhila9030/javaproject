import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println(" enter number to sum");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{
	sum=sum+i;
}
System.out.println(sum);
	}

}
