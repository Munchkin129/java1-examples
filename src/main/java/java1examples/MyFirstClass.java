package java1examples;

public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        for (int count = 1; count <= 100; count++)
        {
            boolean alreadyPrinted = false;
            if (count % 5 == 0)
            {
                System.out.print("Fitz");
                alreadyPrinted = true;
            }
            if (count % 7 == 0)
            {
                System.out.print("Quark");
                alreadyPrinted = true;
            }
            if (alreadyPrinted == false)
            {
                System.out.print(count);
            }
            System.out.println("");
        }


        }


    }


