class CTriangle extends CShape
{
protected double side_a;
protected double side_b;
protected double side_c;
}
public CTriangle(doublea,double b,double c)
{
side_a=a;
side_b=b;
side_c=c;
}
public void show()
{
System.out.print("color="+color+", ");
System.out.println("area="+a*b/2);
}
public class app11_1
{
public static void main(String args[])
{
CTriangle tri=new CTriangle(3,4,5);
tri.setColor("Red");
tri.show();
}
}
