class Over
{

float pi=3.14f;
int length,bredth,r;
void area(int r)
{
System.out.println("area of circle: "+(pi*r*r));
}
void area(int length,int bredth)
{
System.out.println("area of rectangle:"+(length*bredth));
}
}
class Overloading
{
public static void main(String[]args)
{
Over O=new Over();
O.area(2);
O.area(2,4);
}
}

