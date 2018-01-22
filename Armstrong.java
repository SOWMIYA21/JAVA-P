import java.util.*;
import java.lang.*;
import java.io.*;
class java
{
public static void main(string[]args)
{
int num=371,number,temp,total=0;
number=num;
while(number!=0)
{
temp=number%10;
total=total+temp*temp*temp;
number/=10;
}
if(total==num)
system.out.println(num+"is an Armstrong number");
else
system.out.println(num+"is not an Armstrong number");
}
}
