import java.util.Scanner;

public class ATM_Project{

    public static void main(String[] args) {
        
        int pin =1234;
        int balance = 10000;

        int Deposit_amount = 0;
        int Withdraw_amount = 0;

        String name;
        
        Scanner inp = new Scanner(System.in);

        //input from user

        System.out.println("Enter your pin Number\n\n");

        int password = inp.nextInt();


        //logic

        if(password==pin)
        {
            System.out.println("Enter your name: \n");
            name = inp.next();
            System.out.println("\n\nWelcome"+""+name+"\n");

            while(true){
                System.out.println("Press 1 to check your balance amount");
                System.out.println("Press 2 to deposit amount");
                System.out.println("Press 3 to withdraw amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to EXIT! \n\n");

                //Switch case
                int ch = inp.nextInt();

                if (ch == 5)
                {
                    System.out.println("Thankyou!\n");
                    break;
                }
                
                switch(ch)
                {
                    case 1:
                    {
                        System.out.println("Your current balance is: "+ balance + "\n");
                        break;
                    }

                    case 2:
                    {
                        System.out.println("How much amount you want to ADD to your account?");
                        Deposit_amount = inp.nextInt();
                        System.out.println("Successfully Deposited.\n");
                        balance = balance + Deposit_amount;
                        break;
                    }
                    
                    case 3:
                    {
                        System.out.println("How much amount you want to REMOVE from your account?");
                        Withdraw_amount = inp.nextInt();
                        if(Withdraw_amount > balance)
                        {
                            System.out.println("your balance is insufficient:(\n");
                            System.out.println("try lrss than your current balance.\n");
                        }
                        else
                        {
                            System.out.println("Withdrawal Successful\n\n");
                            balance = balance - Withdraw_amount;
                        }
                        break;
                    }

                    case 4:
                    {
                        System.out.println("Welcoome to all in one mini ATM\n");
                        System.out.println("Available balance amount in your account is "+ balance);
                        System.out.println("Amount Deposited                            "+ Deposit_amount);
                        System.out.println("Amount Withdrawn                            "+ Withdraw_amount+"\n");
                        System.out.println("Thanks for coming\n\n");
                        break;
                    }

                    default:
                    {
                        System.out.println("Please enter correct choice option!\n\n");
                        break;
                    }
                    

                }


            }
        }

        else
        {
            System.out.println("Please Enter Correct Password!\n");
        }

        inp.close();

    }
}