
public class FizzBuzz {

	public static void main(String[] args) {
		for (int number = 1; number <= 100; number++)
		    {
			number = number+1;
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (number % 5 == 0) {
				System.out.println("Buzz");
			} else if (number % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(number);
			}
		}

	}

}
