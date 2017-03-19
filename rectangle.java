/*
创建一个简单的表示矩形的Rectangle类，满足以下条件：
（1）定义两个成员变量heigth和width，表示矩形的长和宽，类型为整型 
（2）定义一个getArea方法，返回矩形的面积 
（3）定义一个getPerimeter方法，返回矩形的周长 
（4）在main函数中，利用输入的2个参数分别作为矩形的长和宽，调用getArea和getPermeter方法，计算并返回矩形的面积和周长
 输入：
 输入2个正整数，中间用空格隔开，分别作为矩形的长和宽，例如：5 8
 输出：
 输出2个正整数，中间用空格隔开，分别表示矩形的面积和周长，例如：40 26
*/
import java.util.Scanner;
public class rectangle{
	public static void main(String[] args){
        
        //获得长和宽的输入
        Scanner input=new Scanner(System.in); 
	String LW=input.nextLine();
                  
 	//将输入得到的字符串转换为长和宽的数值
 	String[] temp=LW.trim().split(" ");
 	heigth = Integer.parseInt(temp[0]);
 	width = Integer.parseInt(temp[1]);
 	//weight=input.nextInt();
 	System.out.print(getArea());
 	System.out.print(" ");
 	System.out.print(getPerimeter());
        //输出面积和周长 
	}
	static int heigth,width;
	static int getArea(){
		return heigth*width;
		}
	static int getPerimeter(){
		return 2*(heigth+width);
		}
}
