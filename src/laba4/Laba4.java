/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba4;
import java.util.Scanner;

/**
 *
 * @author 1710502
 */
public class Laba4 {
  
    public static int f(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return f(n - 1) + f(n - 2);
		}
	}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // считывание переменной n
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
 
		// получение n-ого по счёту числа Фибоначчи
		int fn = f(n);
 
		// вывод n-ого по счёту числа Фибоначчи
		System.out.println(fn);
	}
        // TODO code application logic here
    }
    

