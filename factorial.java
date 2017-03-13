import java.util.Scanner;   //导包
public class factorial{
	 public static void main(String[] args){
	 	Scanner scanner = new Scanner(System.in); //从键盘输入数值
	 	int n = scanner.nextInt();  //定义阶数n
	 	int result = 1;
	 	for(int i=1;i<=n;i++){
	 		result*=i;
	 		}
	 	System.out.println("the factorial of"+n+"is"+result); //打印结果
	}
}
