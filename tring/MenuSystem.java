package tring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuSystem {
	//2024.9.26.21.20...差退出程序，差其他选项。现在指南开一个固定长度的数组中一个个设置变量的值。
	//
	public static void main(String[] args) {
		ClassFile dish = new ClassFile();
		List<ClassFile> dishList = new ArrayList<ClassFile>();
		int a= 1;
		//new six object into aDishFile by loop.————————————————————————————————————————
		ClassFile[] aDishFile =  new ClassFile[6];//array'instantiation,but element not.
		for(int i=1;i<6;i++) {
			aDishFile[i] = new ClassFile();//element‘instantiation.
		}
		//——————————————————————————————————————————————————————————————————————————————
		
		dish.setAtribute(1, "lll", 3.1416926);
		System.out.println(dish.id+"\t"+dish.nameString+"\t"+dish.price);
		System.out.println();
//		----------------------print initial list------------------------------
		System.out.println("initial dishList:");
		
		System.out.println(dishList);
		System.out.println("\n\n\n\n");
//		-------------------------------------------------------
		
		dishList.add(dish);
		
//		System.out.println(dishList);cann't
//		-------------------------------------way of search data in dishList------------------------------------------------------------------------------
		System.out.println("search dishList of for loop: ");
		for(ClassFile index:dishList) {
			System.out.println("id="+index.id+'\t'+"nameString="+index.nameString+'\t'+"price="+index.price);
		}
//		--------------------------------------------------------------------------------------------------------------------
		
		//add ClassFile's choice
		Scanner inputScanner = new Scanner(System.in);
		while(true) {

			initialChoice();//
			
			System.out.print("please input a number to chose:");
			
			int num  = inputScanner.nextInt();
			
			switch(num) {
			
			case 1:
				while(true) {

				//-----------------
				for(int indexClassFile =a;indexClassFile<aDishFile.length;indexClassFile++) {

					System.out.println("other or 0 == continueadd or break");
					int dx = inputScanner.nextInt();
					a++;
					if(dx == 0)
						break;
				}
				System.out.print("loading----");
				//-----------------
				System.out.println("loaded");
				System.out.println("search dishList of for loop: ");
				System.out.println("----------------------------------------");
				for(ClassFile index:dishList) {
					System.out.println("id="+index.id+'\t'+"nameString="+index.nameString+'\t'+"price="+index.price);
				}
				System.out.println("----------------------------------------\n\n");
				System.out.println("other or 0 == continueadd or break");
				int dx = inputScanner.nextInt();
				if(dx == 0)
					break;
				}
			case 0:
				break;
			}
			
			if(num == 0) {
				break;
			}
			
			
			
		}
		
		
		
	}
	public static void initialChoice() {
		System.out.println("------------------");
		System.out.println("1.add ClassFile");
		System.out.println("");
		System.out.println("-------------------");
	}
	public static void adddDishClassFileIntoDishList() {
		
	}

}
