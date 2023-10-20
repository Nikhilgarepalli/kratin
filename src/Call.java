import java.util.Scanner;

public class Call {

    public  void Age(int x)
    {
        Scanner sc = new Scanner(System.in);
        if(x >=65)
        {
            System.out.println("Calculate pulse and blood pressure");

            System.out.println("Plese enter the Blood pressure");

            int bp = sc.nextInt();

            if(bp < 120)
            {
                System.out.println("Please take BP tablet");
            }
            else {
                System.out.println("Please Follow your daily routine same time and follow this regullarly to avoid deceases");
            }

        }
    }
}
