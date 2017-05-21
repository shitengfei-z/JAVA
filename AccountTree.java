/*
   编写程序读取科目表文件,在内存中建立科目树, 并遍历科目树中每个科目对象,序列化到磁盘上。
   （1）从文件中读取科目表，包括两种编码格式（一种是固定编码格式，一种是动态编码格式）
   （2）建立Account类，为从文件中读取的每个科目构造Account对象，并在内存中建立科目树
   （3）遍历科目树，将科目对象序列化到磁盘上
   
   输入：固定科目.txt 动态科目.txt
   输出：科目树的序列化文件
*/

import java.io.*;
public class AccountTree{
	public static void main(String[] args){
		File inputFile;
		FileReader reader=null;
		BufferedReader br=null;
		
		try{
			inputFile = new File("固定科目.txt");
			reader = new FileReader(inputFile);
			br = new BufferedReader(reader);
			}catch(FileNotFoundException ex){
				System.out.println(ex);
				}
		try{
			String account="";
			if(br!=null){
				while((account = br.readLine())!=null){
					System.out.println(account);
					}
				}
				reader.close();
			}catch(IOException ex){
				System.out.println(ex);
				}
	}
}
