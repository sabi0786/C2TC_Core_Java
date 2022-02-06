import java.util.Scanner;
class EvenOdd
{ 
public static void main(String[] args) {
	int num;
	System.out.println("Enter an number:");
	Scanner input = new Scanner(System.in);
	num = input.nextInt();
	if(num % 2 == 0)
		System.out.println("Even");
	else
		System.out.println("Odd");

	}

}
