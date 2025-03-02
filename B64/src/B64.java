import java.util.Scanner;

public class B64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter month (full name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();

            String[] validMonths = {"January", "Jan.", "Jan", "1", "February", "Feb.", "Feb", "2", "March", "Mar.", "Mar", "3",
                    "April", "Apr.", "Apr", "4", "May", "5", "June", "Jun.", "Jun", "6", "July", "Jul.", "Jul", "7",
                    "August", "Aug.", "Aug", "8", "September", "Sept.", "Sep", "9", "October", "Oct.", "Oct", "10",
                    "November", "Nov.", "Nov", "11", "December", "Dec.", "Dec", "12"};

            boolean isValid = false;
            for (String valid : validMonths) {
                if (valid.equalsIgnoreCase(monthInput)) {
                    isValid = true;
                    break;
                }
            }

            if (isValid) {
                break;
            }
            System.out.println("Invalid month. Please enter again.");
        }

        while (true) {
            System.out.print("Enter year (non-negative number): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    break;
                }
            }
            System.out.println("Invalid year. Please enter again.");
            scanner.nextLine(); // Consume the invalid input
        }

        int days;
        switch (monthInput.toLowerCase()) {
            case "january": case "jan.": case "jan": case "1":
            case "march": case "mar.": case "mar": case "3":
            case "may": case "5":
            case "july": case "jul.": case "jul": case "7":
            case "august": case "aug.": case "aug": case "8":
            case "october": case "oct.": case "oct": case "10":
            case "december": case "dec.": case "dec": case "12":
                days = 31;
                break;

            case "april": case "apr.": case "apr": case "4":
            case "june": case "jun.": case "jun": case "6":
            case "september": case "sept.": case "sep": case "9":
            case "november": case "nov.": case "nov": case "11":
                days = 30;
                break;

            case "february": case "feb.": case "feb": case "2":
                days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
                break;

            default:
                days = -1;
        }

        System.out.println("Number of days in " + monthInput + " " + year + " is: " + days);
        scanner.close();
    }
}
