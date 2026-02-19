public class UncheckedException {
    public static void main(String[] args) {
        System.out.println("---------------ArithmeticException Example---------------");
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("Caught an unchecked exception: " + ae);
        }
        finally {
            System.out.println("Execution completed.");
        }


        System.out.println("----------ArrayIndexOutOfBoundsException Example----------");
        try{
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Caught an unchecked exception: " + aiobe);
        }
        finally {
            System.out.println("Execution completed.");
        }


        System.out.println("-----------------StringIndexOutOfBoundsException Example-----------------");
        try {
            String text = "Hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("Caught an unchecked exception: " + sioobe);
        }
        finally {
            System.out.println("Execution completed.");
        }


        /*
        System.out.println("---------------NullPointerException Example---------------");
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException npe) {
            System.out.println("Caught an unchecked exception: " + npe);
        }
        finally {
            System.out.println("Execution completed.");
        }
        */


        System.out.println("-----------------NumberFormatException Example-----------------");
        try {
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException nfe) {
            System.out.println("Caught an unchecked exception: " + nfe);
        }
        finally {
            System.out.println("Execution completed.");
        }


        /*
        System.out.println("-----------------ClassCastException Example-----------------");
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
            System.out.println("Casted string: " + str);
        } catch (ClassCastException cce) {
            System.out.println("Caught an unchecked exception: ");
        }
        finally {
            System.out.println("Execution completed.");
        }
        */
    }
}



