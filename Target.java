import java.util.Scanner;
class Target
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Waste Collected:");
        int Collection=sc.nextInt();
        
        if(Collection>=100)
        {
            System.out.println("Collection Target Achieved");  
        }
            else
            {
            System.out.println("More Waste Collection Required");
        }

    }
}