package ploymorfhism;

public class TestShapeABC {
	
	public static void main(String agrs[]){
		
		//first object with 2 arguments
		ShapeABC obj=new ShapeABC();
		int rectangleresult=obj.addNumbers(10, 10);
		System.out.print(rectangleresult);
		
		// second object with 3 arguments
		ShapeABC obj2=new ShapeABC();
		int rectangleresult2=obj2.addNumbers(10, 10,30);
		System.out.print(rectangleresult2);
		
		// 3rd object with 4 arguments
		ShapeABC obj3=new ShapeABC();
		int rectangleresult3=obj3.addNumbers(10, 10,60,70);
		System.out.print(rectangleresult3);
		
		
	}

}
