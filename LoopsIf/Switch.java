package LoopsIf;

public class Switch {
    /** The switch statement selects one of many code blocks to be executed */

    public void switchStmt() {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Sure is a weekday or weekend mate ?");
        }
    }
    // break allows us to stop the switch . stop the job once its done
    // default - allows us to run some code if there are not match case
}
