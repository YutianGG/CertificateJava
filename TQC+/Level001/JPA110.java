package Level001;

public class JPA110
{
	public static void main(String[] args)
	{
	    double totalarea;
	    System.out.printf("圓形面積為：%f \n",calCircle(5));
	    System.out.printf("三角形面積為：%f \n",calTriangle(10,5));
	    System.out.printf("方形面積為：%f \n",calRectangle(5,10));
	    totalarea = calCircle(5) + calTriangle(10,5) + calRectangle(5,10);
	    System.out.printf("此圖形面積為：%f \n",totalarea);
	}
	static double calCircle(int r)
	{
		return r * r * 3.1415926;   
	}
	static double calTriangle(int b, int h) 
	{
		return b * h / 2;
	}
	static double calRectangle(int l, int w) 
	{
		return l * w;
	}
}

/*
import java.util.Scanner;
public class JPD01 {
    public static void main(String args[]) {
        double totalarea;
        System.out.printf("圓形面積為：%f \n",calCircle(5));
        System.out.printf("三角形面積為：%f \n",________________);
        System.out.printf("方形面積為：%f \n",_______________);
        totalarea = __________________________________________;
        System.out.printf("此圖形面積為：%f \n",totalarea);
    }
    _______ ______ calCircle(_____) {
        
    }
    ______ ____ calTriangle(_____________) {
        
    }
    ______ ____ calRectangle(______________) {
        
    }
}
*/