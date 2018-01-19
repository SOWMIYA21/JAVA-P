import java.util.*;
public class prime
{
public static void main(string[] args)
{
int low=20,high=50;
while(low<high)
{
boolean flag=flase;
for(int i=2;i<=low/2;i++)
{
if(low%i==0)
{
flag=true;
break;
}
}
if(!flag)
system.out.print(low +" ");
++low;
}
}
}
