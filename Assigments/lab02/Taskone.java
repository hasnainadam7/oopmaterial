public class Taskone {

    
    public static void main(String[] args) {
        int month = 2;
        int year = 2016;
        int days=0;
        String monthName="undefined";

        switch (month) {
        case 1:
            days = 31;
             monthName="Jan";
            break;
        case 2:
         monthName="Feb";
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                days = 29;
            } else {
                days = 28;
            }

            break;
        case 3:
            days = 31;
             monthName = "March";
            break;
        case 4:
            days = 30;
             monthName = "April";

            break;
        case 5:

            days = 31;
             monthName = "May";
            break;
        case 6:

             monthName = "June";
            days = 30;
            break;
        case 7:

             monthName = "July";
            days = 31;
            break;
        case 8:

             monthName = "Aug";
            days = 31;
            break;

        case 9:

             monthName = "Sep";
            days = 30;
            break;
        case 10:

             monthName = "Oct";
            days = 31;
            break;
        case 11:

             monthName = "Nov";
            days = 30;
            break;
        case 12:

            monthName = "Dec";
            days = 31;
            break;

        }
        System.out.print(monthName + " " + year + " has " + days + " days\n");

    }
 }