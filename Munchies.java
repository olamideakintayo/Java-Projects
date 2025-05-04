public class Munchies {

	public static int findMultiple(int number){
	return number * 5;
	}

	public static void displayPrimeNumber() {
        int number = 2;
	int counter = 0;

	while (counter < 50) {
	if (primeNumber(number)) {
	System.out.println(number);
	counter++;
	}
	number++;
	}
	}

	public static boolean primeNumber(int num) {
	if (num <= 1) return false;

	for(int count = 2; count <= Math.sqrt(num); count++) {
	if (num % count == 0) return false;
	}
	return true;
	}

	public static String displayAge(int ageYears) {
	int seconds = ageYears * 31_536_000;
        int minutes = ageYears * 521_600;
	int days = ageYears * 365;
	int months = ageYears * 12;
	int year = ageYears;
	
	return year + " year(s)\n" +
           months + " month(s)\n" +
           days + " day(s)\n" +
           minutes + " minute(s)\n" +
           seconds + " second(s)";
	}

	public static void displayDogAge(String name, int humanYears) {
    	int dogYears = humanYears * 7;
    	System.out.println(name + " is " + dogYears + " years old in dog years.");
	}

	  public static String findMultiplesOf7Not5() {
        String result = "";
	
	for(int count = 2000; count <= 3200; count++) {
	if (count % 7 == 0 && count % 5 == 0) {
		if(!result.equals("")) {
		result += ",";
		}
	result += count;
        
            }
        }

        return result;
    }


	public static int computeSumOfNumber(int number) {
	int sum = 0;
	 while (number > 0) {
        int digit = number % 10;
        sum += digit;         
        number = number / 10;   
    	}
	return sum;
	}

	public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}