package chap06_06;

//메소드 오버로딩

public class Calculator {
	//정사각형의 넓이
	double areaRectangel(double width)
	{
		return width*width;
	}
	
	//직사각형의 넓이
	double areaRectangel(double width, double height)
	{
		return width * height;
	}
}
