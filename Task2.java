package homework.week.two;

public class Task2 {
    public static void main (String[] args) {
        String monthName = "April";
        if (monthName == "January") {
            System.out.println("Месец Януари -> 31 дена");
        } else if (monthName == "February") {
            System.out.println("Месец Февруари -> 29 дена");
        } else if (monthName == "March") {
            System.out.println("Месец Март -> 31 дена");
        } else if (monthName == "April") {
            System.out.println("Месец Април -> 30 дена");
        } else if (monthName == "May") {
            System.out.println("Месец Май -> 31 дена");
        } else if (monthName == "June") {
            System.out.println("Месец Юни -> 30 дена");
        } else if (monthName == "July") {
            System.out.println("Месец Юли -> 31 дена");
        } else if (monthName == "August") {
            System.out.println("Месец Август -> 31 дена");
        } else if (monthName == "September") {
            System.out.println("Месец Септември -> 30 дена");
        } else if (monthName == "October") {
            System.out.println("Месец Октомври -> 31 дена");
        } else if (monthName == "November") {
            System.out.println("Месец Ноември -> 30 дена");
        } else if (monthName == "December") {
            System.out.println("Месец Декември -> 31 дена");
        } else {
            System.out.println("Въведена е невалидна информация!");
        }
    }
}
