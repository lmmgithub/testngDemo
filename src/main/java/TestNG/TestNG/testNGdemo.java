package TestNG.TestNG;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestNG.TestNG.Calculate;

public class testNGdemo {
	private Calculate calculate;
	
	/**
     * 在每个方法执行前执行
     * @throws Exception
     */

	@BeforeClass
	public void setUp()  {
        calculate=new Calculate();
   }
	
	/**
     * 在每个方法执行后执行
     * @throws Exception
     */
	
	@AfterClass
	public void tearup(){
		
		System.out.println("this is a end!");
	}
	
	@Test
	public void testAdd() {
        //调用所需要测试的函数
        //真实值
        double result=calculate.add(10, 20);
        //期望值
        double expect=30;
        //断言
        //assertEquals(expect, result);
        //delta代表的是误差值，当excepted与actual相差的绝对值小于这个值时测试通过。但大于等于时会失败。
        assertEquals(expect, result, 0);
   }
	 /**
     * 测试规范点:
     * 3、测试方法必须使用@Test注解，并且方法必须是public void，不能带任何参数；
     * 4、测试单元中的每个方法必须可以独立，测试方法之间不能有任何的依赖；
     * 5、测试方法最好使用test作为方法名的前缀
     */
	
	@Test
	public void testSubstract() {
		double result=calculate.substract(10, 5);
        assertEquals(5, result,0);
   }
	@Test
    public void testMultiply() {
		double result = calculate.multiply(2, 3);
         assertEquals(6, result,0);
    }
	
	@Test
    public void testDivide() {
		double result = calculate.divide(10, 3);
         assertEquals(3.3333333333333335, result, 0);
    }
    
    @Test
    public void testAdd1() {
    	double result = calculate.add(3, 5);         
         assertEquals(8, result, 0);
    }
    
    @Test
    public void testsubstract1() {
    	double result = calculate.substract(10, 3);
         assertEquals(7, result,0);
    }
    @Test
    public void testMultiply1() {
    	double result = calculate.multiply(10, 3);
         assertEquals(30, result,0);
    }
    @Test
    public void testDivide1() {
    	double result = calculate.divide(16, 3);
         assertEquals(5.33, result, 0);
    }
    
    @Test
    public void testCh() {
    	double a =Double.parseDouble("125"); 
    	double b =Double.parseDouble("15");     	
    	double result = calculate.divide(a, b);
         assertEquals(125.0/15, result, 0);
    }
    
    @Test
    public void testCh1() {
    	double a =Double.parseDouble("125a"); 
    	double b =Double.parseDouble("15");     	
    	double result = calculate.divide(a, b);
         assertEquals(125/15, result, 0);
    }
	
	


}
