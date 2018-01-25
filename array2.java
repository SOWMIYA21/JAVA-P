import java.util.scanner;
public class count_occurence
{
public static void main(string[]args)
{
int n,x,count=0,i=0;
scanner s=new scanner(system.in);
system.out.print("Enter no.of elements in array:");
n=s.nextInt();
int a[]=new int[n];
system.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
system.out.print("enterthe elements to count:");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
count++;
}
}
system.out.println("Number of elements:"+count);
}
}
