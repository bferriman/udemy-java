package Switch;

public class Main {

    public static void main(String[] args) {

        //you can switch on bytes, shorts, ints, chars, and Strings

        int switchValue = 1 ;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;  //break in default is not strictly necessary
        }

        String month = "Feb";

        switch(month.toLowerCase()) {
            case "jan":
                System.out.println("It's January");
                break;

            case "feb":
                System.out.println("It's the best month");
                break;

            case "mar":
                System.out.println("It's March");
                break;

            default:
                System.out.println("I'm tired of writing month cases");
                break;
        }
    }
}