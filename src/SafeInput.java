import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }
        while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int number;

        while (true)
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt())
            {
                number = pipe.nextInt();
                pipe.nextLine();
                return number;
            }
            else
            {
                System.out.println("Invalid input. Enter an integer.");
                pipe.nextLine();
            }
        }
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double number;

        while (true)
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble())
            {
                number = pipe.nextDouble();
                pipe.nextLine();
                return number;
            }
            else
            {
                System.out.println("Invalid input. Enter a number.");
                pipe.nextLine();
            }
        }
    }

    public static int getRangedInt(Scanner pipe, String prompt,
                                   int low, int high)
    {
        int number;

        while (true)
        {
            System.out.print("\n" + prompt + " [" + low + " - "
                    + high + "]: ");

            if (pipe.hasNextInt())
            {
                number = pipe.nextInt();
                pipe.nextLine();

                if (number >= low && number <= high)
                {
                    return number;
                }
                else
                {
                    System.out.println("Number is outside the range.");
                }
            }
            else
            {
                System.out.println("Invalid input. Enter an integer.");
                pipe.nextLine();
            }
        }
    }

    public static double getRangedDouble(Scanner pipe, String prompt,
                                         double low, double high)
    {
        double number;

        while (true)
        {
            System.out.print("\n" + prompt + " [" + low + " - "
                    + high + "]: ");

            if (pipe.hasNextDouble())
            {
                number = pipe.nextDouble();
                pipe.nextLine();

                if (number >= low && number <= high)
                {
                    return number;
                }
                else
                {
                    System.out.println("Number is outside the range.");
                }
            }
            else
            {
                System.out.println("Invalid input. Enter a number.");
                pipe.nextLine();
            }
        }
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String answer;

        while (true)
        {
            System.out.print("\n" + prompt + " (Y/N): ");
            answer = pipe.nextLine();

            if (answer.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if (answer.equalsIgnoreCase("N"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter Y or N.");
            }
        }
    }

    public static String getRegExString(Scanner pipe, String prompt,
                                        String regEx)
    {
        String answer;

        while (true)
        {
            System.out.print("\n" + prompt + ": ");
            answer = pipe.nextLine();

            if (answer.matches(regEx))
            {
                return answer;
            }
            else
            {
                System.out.println("Invalid format. Try again.");
            }
        }
    }

    public static void prettyHeader(String msg)
    {
        int width = 60;
        int insideWidth = width - 6;
        int leftSpaces = (insideWidth - msg.length()) / 2;
        int rightSpaces = insideWidth - msg.length() - leftSpaces;

        for (int i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");

        for (int i = 0; i < leftSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}