﻿package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值");
		int n = input.nextInt();
		long m = 0;
		for(int i = 1 ; i <= n ; i++){
			m += Math.pow(2 , i);
		}
		System.out.println("到2^"+n+"="+m);
	}

}
