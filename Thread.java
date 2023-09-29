class Oddthread extends Thread{
public void run()
{
for(int i=1;i<=10;i=i+2)
{
System.out.println("Oddthread :"+i);
}
}
}
class Eventhread extends Thread{
public void run()
{
for(int i=0;i<=10;i=i+2)
{
System.out.println("Eventhread :"+i);
}
}
}
public class Thread
{
public static void main(String args[])
{
Oddthread t1=new Oddthread();
t1.start();
Eventhread t2=new Eventhread();
t2.start();
}
}