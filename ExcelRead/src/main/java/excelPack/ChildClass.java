package excelPack;

import java.io.IOException;

public class ChildClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println(ParentClass.getStringData(1, 0));
		System.out.println(ParentClass.getIntegerData(1, 1));
		
		System.out.println(ParentClass.getStringData(2, 0));
		System.out.println(ParentClass.getIntegerData(2, 1));

	}

}
