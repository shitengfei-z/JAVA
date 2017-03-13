
编写一个程序，输出字符串abcdefgh的全排列。（提示：可考虑递归）

public class permutation{
	public static int total = 0;  
	public static void main(String[] args){
		//char m;
		char[] chars={'a','b','c','d','e','f','g','h'};
	  //打印chars的全排列		
		permutate(chars,0);
		System.out.println(total); //统计总数
	}
	public static void permutate(char[] chars, int i) {
         if (i = chars.length)
             return;
         if (i == chars.length - 1) {
             System.out.println(String.valueOf(chars));
             total++;
         } else {
             for (int j = i; j  chars.length; j++) {
                 char temp = chars[j];
                 chars[j] = chars[i];
                 chars[i] = temp;
 
                 permutate(chars, i + 1);
 
                 temp = chars[j];
                 chars[j] = chars[i];
                 chars[i] = temp;
             }
         }
     }
			
}
