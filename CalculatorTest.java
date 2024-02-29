package SmartCalculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	
			Scanner sc = new Scanner(System.in);

			@Test
			void testSimpleInterest() { //
			System.out.println("\n\n\t\t Finding the simple interest");
			Calculator  c = new Calculator ();
			System.out.println("Enter the princiapal amount: ");
			double principal = sc.nextDouble();
			System.out.println("Enter the rate: ");
			double rate = sc.nextDouble();
			System.out.println("Enter the time: ");
			double time = sc.nextDouble();
			c.setPrincipal(principal);
			c.setrate(rate);
			c.settime(time);
			
			
			assertEquals(2000,c.calculateSimpleInterest());  //p=10000, r=5, t=4
			}
			
			@Test
			void testSimpleInterest2() {
			System.out.println("\n\n\t\t Finding the simple interest");
			Calculator  c = new Calculator ();
			System.out.println("Enter the princiapal amount: ");
			double principal = sc.nextDouble();
			System.out.println("Enter the rate: ");
			double rate = sc.nextDouble();
			System.out.println("Enter the time: ");
			double time = sc.nextDouble();
			c.setPrincipal(principal);
			c.setrate(rate);
			c.settime(time);
			
			assertEquals(400,c.calculateSimpleInterest());  //p=5000, t=4, r=2
			}
			
			@Test
			void testCompoundInterest() {
				System.out.println("\n\n\t\t Finding the Compound interest");
				Calculator  c = new Calculator ();
				assertEquals(124415.99999999997,c.calculateCompoundInteresr());   //p=50000, t=5, r=20
				}
			
			@Test
			void testCompoundInterest2() {
				System.out.println("\n\n\t\t Finding the Compound interest");
				Calculator  c = new Calculator ();
				assertEquals(12762.815625000003,c.calculateCompoundInteresr());   //p=10000, t=5, r=5
				}
			
			@Test
			void testMean() {
				System.out.println("\t\t Finding the Mean");
				Calculator  c = new Calculator ();
				assertEquals(3,c.calculateMean());  //size = 5, input=1,2,3,4,5
				}
			
			@Test
			void testMean2() {
				System.out.println("\t\t Finding the Mean");
				Calculator  c = new Calculator ();
				assertEquals(5.5,c.calculateMean());  //size = 4, input=4,6,8,4
				}
			
			@Test
			void testFcatorila() {
				System.out.println("\n\n\t\t Finding the Factorial");
				Calculator  c = new Calculator ();
				assertEquals(120,c.calculateFactorial());  //5
				}
			
			@Test
			void testFcatorila2() {
				System.out.println("\n\n\t\t Finding the Factorial");
				Calculator  c = new Calculator ();
				assertEquals(6,c.calculateFactorial());  //3
				}
			
			@Test
			void testcalculatepercentage() {
				System.out.println("\n\n\t\t Finding the Percentage");
				Calculator  c = new Calculator ();
				assertEquals(96,c.calculatepercentage()); //totalMarks=500 marksObtained=480
				}
			
			@Test
			void testcalculatepercentage2() {
				System.out.println("\n\n\t\t Finding the Percentage");
				Calculator  c = new Calculator ();
				assertEquals(50,c.calculatepercentage()); //totalMarks=600 marksObtained=300
				}

}


