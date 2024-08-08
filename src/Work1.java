import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        // sual 1

//        Scanner scanner = new Scanner(System.in);
////        System.out.print("Ədədi daxil edin: ");
////        int number = scanner.nextInt();
////
////        int numberOfDigits = String.valueOf(number).length();
////        System.out.println("Ədədin mərtəbə sayı: " + numberOfDigits);

        //sual 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ədədi daxil edin: ");
//        int number = scanner.nextInt();
//
//        int sumOfDigits = 0;
//        while (number != 0) {
//            sumOfDigits += number % 10; // Hər bir rəqəmin cəmi
//            number /= 10; // Növbəti rəqəmə keçid
//        }
//
//        System.out.println("Ədədin sadə rəqəmlərinin cəmi: " + sumOfDigits);

        //Sual 3

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ədədi daxil edin: ");
//        int number = scanner.nextInt();
//
//        boolean isPalindrome = isPalindrome(number);
//
//        System.out.println("Ədəd palindrome-dır: " + isPalindrome);
//    }
//
//    public static boolean isPalindrome(int number) {
//        int originalNumber = number;
//        int reversedNumber = 0;
//
//        while (number > 0) {
//            int lastDigit = number % 10;
//            reversedNumber = reversedNumber * 10 + lastDigit;
//            number /= 10;
//        }
//
//        return originalNumber == reversedNumber;
//    }

        //Sual 4

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("1 ilə 12 arasında bir ədəd daxil edin: ");
//        int number = scanner.nextInt();
//
//        if (number >= 1 && number <= 12) {
//            switch (number) {
//                case 1:
//                    System.out.println("Yanvar");
//                    break;
//                case 2:
//                    System.out.println("Fevral");
//                    break;
//                case 3:
//                    System.out.println("Mart");
//                    break;
//                case 4:
//                    System.out.println("Aprel");
//                    break;
//                case 5:
//                    System.out.println("May");
//                    break;
//                case 6:
//                    System.out.println("İyun");
//                    break;
//                case 7:
//                    System.out.println("İyul");
//                    break;
//                case 8:
//                    System.out.println("Avqust");
//                    break;
//                case 9:
//                    System.out.println("Sentyabr");
//                    break;
//                case 10:
//                    System.out.println("Oktyabr");
//                    break;
//                case 11:
//                    System.out.println("Noyabr");
//                    break;
//                case 12:
//                    System.out.println("Dekabr");
//                    break;
//                default:
//                    System.out.println("Daxil etdiyiniz ədəd uyğun ay adı tapılmadı.");
//            }
//        } else {
//            System.out.println("Daxil etdiyiniz ədəd 1 ilə 12 arasında deyil!");
//        }

        //Sual 5
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ədədləri daxil edin (nümunə: 10 23 2 45 7): ");
//
//        String input = scanner.nextLine();
//        String[] numbers = input.split(" ");
//
//        // Ədədlərin sıralanması üçün birinci ədədi alırıq
//        int maxNumber = Integer.parseInt(numbers[0]);
//
//        for (int i = 1; i < numbers.length; i++) {
//            int currentNumber = Integer.parseInt(numbers[i]);
//            if (currentNumber > maxNumber) {
//                maxNumber = currentNumber;
//            }
//        }
//
//        System.out.println("Ən böyük ədəd: " + maxNumber);

        //Sual 6


            Scanner scanner = new Scanner(System.in);
            System.out.print("Ədədi daxil edin: ");
            int number = scanner.nextInt();

            boolean isUnique = checkUniqueDigits(number);

            System.out.println("Ədədin rəqəmləri unikal(dəyər təkrarlanmır): " + isUnique);
        }

        public static boolean checkUniqueDigits(int number) {
            String numString = String.valueOf(number);
            int[] digitCount = new int[10]; // Ədədin rəqəmlərinin sayını saxlamaq üçün bir array

            for (int i = 0; i < numString.length(); i++) {
                int digit = Character.getNumericValue(numString.charAt(i));
                digitCount[digit]++;

                if (digitCount[digit] > 1) {
                    return false;
                }
            }

            return true;
        }
//   }
}


