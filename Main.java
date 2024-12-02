import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountOperation account =new AccountOperation();
        System.out.println("Welcome to AT Money Bank");
        System.out.println("1. Create Account");
        System.out.println("2. Log into Account");

        System.out.println("2. Deposit");
        System.out.println("3. Withdrawal");
        System.out.println("4. Check Account Balance");

        Scanner choice = new Scanner(System.in);

        switch (Integer.parseInt(String.valueOf(choice.next()))) {
            case 1:
                Scanner Quit;
                int ans;
                do {
                    System.out.println("What is your first name");
                    Scanner firstName = new Scanner(System.in);
                    String st_firstName= firstName.next();


                    System.out.println("What is your last name");
                    Scanner lastName = new Scanner(System.in);
                    String st_lastName = lastName.next();


                    System.out.println("What is your userID");
                    Scanner Id = new Scanner(System.in);
                    String userId= Id.next();

                    System.out.println("Set your pin");
                    Scanner pin = new Scanner(System.in);
                    String st_pin= pin.next();

                    account.creatingProfile(st_firstName,st_lastName,userId,st_pin);

                    System.out.println(account.Students);

                    System.out.println("you want to continue");
                    Quit = new Scanner(System.in);

                    ans = Integer.parseInt(String.valueOf(Quit.nextInt()));

                } while (ans == 0);


            case 2:
                System.out.println("Answer the questions to Log in into your account");
                System.out.println("what is your First Name");
                Scanner logFirstName = new Scanner(System.in);
                String firstName = logFirstName.next();


                System.out.println("what is your userID");
                Scanner userId = new Scanner(System.in);
                String userIds = userId.next();

                System.out.println("What is your Pin");
                Scanner userPin = new Scanner(System.in);
                String logPin = userPin.next();

                account.accountValidation(firstName,userIds,logPin);
                break;

            case 3:
                System.out.println("How much do you want to Deposit");
                Scanner dept = new Scanner(System.in);
                account.setDeposit(Double.parseDouble(dept.next()));
                break;

            case 4:
                break;
        }
    }
}