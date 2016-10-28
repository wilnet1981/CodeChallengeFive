import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        double numberOne;
        double numberTwo;
        String operator;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Choose your first number, please: ");
        numberOne = Double.parseDouble(keyboard.nextLine());
        
        System.out.print("Choose your second number, please: ");
        numberTwo = Double.parseDouble(keyboard.nextLine());
        
        do
        {
            System.out.print("Choose your operator, please: ");
            operator = keyboard.nextLine();
        }
        while (!operator.equals("-") && !operator.equals("+") && !operator.equals("*") && !operator.equals("/"));
        if (numberOne == 0 || numberTwo == 0 && operator.equals("/"))
        {
            System.out.println("For division, choose a number different from zero, please");
        }
        else if (operator.equals("+"))
        {
            System.out.println(add(numberOne, numberTwo));
        }
        else if (operator.equals("-"))
        {
            System.out.println(subtract(numberOne, numberTwo));
        }
        else if (operator.equals("*"))
        {
            System.out.println(multiply(numberOne, numberTwo));
        }
        else if (operator.equals("/"))
        {
            System.out.println(divide(numberOne, numberTwo));
        }

    }
    public static double add(double numberOneInputed, double numberTwoInputed)
    {
       return numberOneInputed + numberTwoInputed;
    }
    public static double subtract(double numberOneInputed, double numberTwoInputed)
    {
       return numberOneInputed - numberTwoInputed;
    }
    public static double multiply(double numberOneInputed, double numberTwoInputed)
    {
       return numberOneInputed * numberTwoInputed;
    }
    public static double divide(double numberOneInputed, double numberTwoInputed)
    {
       return numberOneInputed / numberTwoInputed;
    }
}
