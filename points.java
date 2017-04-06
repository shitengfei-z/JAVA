/*
编写一个表示二维平面上的点的类MyPoint，满足以下条件：
（1）定义private的成员变量x和y，表示点的x和y坐标，类型为double
（2）定义两个MyPoint的构造方法，一个构造方法不带参数，而且x和y的初始值为0，另一个构造方法有两个参数，参数名为x和y，类型为double，用这两个参数分别作为初始x和y坐标
（3）定义一个getD方法，有一个类型为MyPoint的对象参数，功能为返回当前对象和参数对象这两个坐标点的距离，返回值为double类型
（4）编写测试的main方法，调用getD计算两个点之间的距离

 输入：
 输入2行数据， 总共4个有理数。每2个数据一组，表示一个点的x和y坐标，每行的2个数据用空格隔开。例如：
 200.1 200.2
 200.3 200.4

输出：
 输出两个点之间的距离。例如：
 0.28284271247464315
*/
import java.util.Scanner;
public class points{
	public static void main(String[] args){
        
        //获得两个点座标的输入
    Scanner input=new Scanner(System.in); 
	  //String point1=input.nextLine();
	  double x1,y1;
	     double x2,y2;
	  x1=input.nextDouble();
	  y1=input.nextDouble();
	  x2=input.nextDouble();
    y2=input.nextDouble();
    MyPoint p1=new MyPoint(x1,y1);
    MyPoint p2=new MyPoint(x2,y2);
    double dist=p2.getD(p1);
    System.out.println(dist);                
        //输出两个点之间的距离
 
	}
}
  class MyPoint{
  	 private double x,y;
    MyPoint(){
        x=0;
        y=0;
    }
    MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double getD(MyPoint p){
        double deltaX=this.x-p.getX();
        double deltaY=this.y-p.getY();
        double dist=deltaX*deltaX+deltaY*deltaY;
        return Math.sqrt(dist);
    }
  	}
