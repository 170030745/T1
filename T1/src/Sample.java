import java.io.*;
import java.util.*;
class Sample
{
public static void main(String [] args)
{
 if(args.length==0)
{
 System.out.println("An integer number as argument is expected");
}
else
{
 int a=Integer.parseInt(args[0]);
if(a > 0)
{
 System.out.println(+a+ " is a positive number");
}
else if(a < 0)
{ 
  System.out.println(+a+ " is a negative number");
}
else
{
System.out.println(+a+ " neither negative nor positive number");
}
}
}
}