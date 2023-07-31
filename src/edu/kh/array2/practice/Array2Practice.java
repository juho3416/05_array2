package edu.kh.array2.practice;

import java.util.Scanner;

public class Array2Practice {

	//빙고 게임 문제는 생략
	
	public void practice1() {
		
		int[][] arr = new int[3][3];
		
		int num = 0;
		
		for (int row=0; row<arr.length; row++) {
			
			for (int col=0; col<arr[row].length; col++) {
			
				System.out.printf("(%d, %d)",row,col);
			}
			
			System.out.println();
	
		}
		
	} //public void
	
	
	
	
	
	
	
	
	public void practice2() {
		
		int arr[][] = new int[5][5];
		
		int num = 0;
		
		for (int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				
			//	num = num + 1; (여기임)
				arr[row][col] = ++num; //한번에!
			//	num = num + 1; (여기 아님!)
				
				System.out.printf("%2d ", arr[row][col]);
								
			}
			
			System.out.println("");
			
		}
	
	} //public void
	
	
	
	
	
	
	
	
	
	public void practice3() {	
		
		int[][] arr = new int[4][4];
		
		int num=16;
		
		for (int row=0; row<arr.length; row++ ) {
			for (int col=0; col<arr[row].length; col++) {
				
				System.out.printf("%2d ", num);
				num = num - 1;
				
			}
			
			System.out.println();
		}
		
		
	} //public void
	
	
	
	
	
	
	
	
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
	
	
				
		for (int row=0; row<arr.length-1; row++) {
			
			int sumR = 0;
			
			for (int col=0; (col)<(arr[row].length-1); col++) {
				
				arr[row][col] = (int)( Math.random()*10+1 );
				
				sumR = sumR + arr[row][col];
			}
			arr[row][3] = sumR;
		
		}	
		
		
		for (int col=0; col<arr[0].length-1; col++) {
			
			int sumC = 0;
			
			for (int row=0; row<(arr.length-1); row++) {
		
				sumC = sumC + arr[row][col];
			}
			arr[3][col] = sumC;
			
		}
		
		
		int sumT = 0;		
		for (int row=0; row<arr.length-1; row++) {
			
			for (int col=0; (col)<(arr[row].length-1); col++) {
				
				sumT = sumT + arr[row][col];
	
			}
			arr[3][3] = sumT;
		
		}
		
				
		for (int row=0; row<arr.length; row++) {
			
			for (int col=0; (col)<(arr[row].length); col++) {
				
				System.out.printf("%2d ", arr[row][col]);
			}
			System.out.println();
		}
		
	
	}//public void
	
	
	
	
	
	
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int inputR = sc.nextInt();
		System.out.print("열 크기 : ");
		int inputC = sc.nextInt();
			
		int[][] arr = new int[inputR][inputC];
		
		for(int row=0; row<inputR; row++) {
			for (int col=0; col<inputC; col++) {
				
				int random = (int)(Math.random()*26 + 65);
	
				arr[row][col] = random;
				
	// char randomAlphabet = (char)random;
	// arr[row][col] = randomAlphabet;
	// System.out.print(arr[row][col] + " ");
	// 이렇게는 왜 문자가 안뜨고 숫자만 뜰까요?
	
				System.out.print((char)arr[row][col] + " ");
			}
			
			System.out.println();
		}
		
	} //public void
	
	
	
	
	
	
	
	
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		int[][] arr = new int[row][];
		
		int alphabet = (int)'a';
	
		int col;
		
		for (row=0; row<arr.length; row++) {
			
			System.out.printf("%d열의 크기 : ", row);
			col = sc.nextInt();
			arr[row] = new int[col];
			
			for(col=0; col<arr[row].length; col++) {
										
				arr[row][col] = alphabet;
				alphabet++;				
			}
		}
			
		for (row=0; row<arr.length; row++) {
			for(col=0; col<arr[row].length; col++) {
				
				System.out.print((char)arr[row][col] + " ");
			}
			System.out.println();
		}
	
	} //public void
	
	
	
	
	
	
	
	
	
	
	public void practice7() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		System.out.println("== 1분단 ==");
		
		int num=0;
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];		
		
		for (int row=0; row<arr1.length; row++ ) {
			for (int col=0; col<arr1[row].length;col++) {
				arr1[row][col] = students[num];
				System.out.print(arr1[row][col] + " ");
				num++;
			}
			System.out.println();
		}
	
		System.out.println("== 2분단 ==");
		
		for (int row=0; row<arr2.length; row++ ) {
			for (int col=0; col<arr2[row].length;col++) {
				arr2[row][col] = students[num];
				System.out.print(arr2[row][col] + " ");
				num++;
			}
			System.out.println();
		}
	
	}// public void
	
	
	
	
	
	
	
	
	
	
	
	
	public void practice8() {
		
		
		
	} //public void
	
	
	
	
	
	
	
	
	
	
	
	public void practice9() {
		
		
	} //public void
	
	
	
	
	
	
	
	
	
	
	
	public void practice10() {
		
		
	} //public void
	
	
	
	
} //public class
