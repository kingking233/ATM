import java.util.ArrayList;
import java.util.Arrays;

public class AccountOperation {
    String firstName;
    String lastName;
    String userId;
    String pin;
    ArrayList <String> Students = new ArrayList<>();
    ArrayList <ArrayList<String>> allStudent = new ArrayList<>();
    double balance =0.0;



    public void creatingProfile (String firstName, String lastName, String userId, String pin){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userId=userId;
        this.pin=pin;

        Students.add(firstName);
        Students.add(lastName);
        Students.add(userId);
        Students.add(pin);

        allStudent.add(Students);

         boolean isUnique = true;
        for (ArrayList<String> student : allStudent) {
            if (student.equals(Students)) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            allStudent.add(Students);
        }

    }

    public void accountValidation(String lastName, String userId, String pin){
        this.lastName=lastName;
        this.userId=userId;
        this.pin=pin;

        for (ArrayList<String> student : allStudent) {
            if (student.get(1).equals(lastName) && student.get(2).equals(userId) && student.get(3).equals(pin)) {
                System.out.println("Validation successful: " + student);
            }
        }

        System.out.println("Validation failed: No matching profile found.");

    }






    public void setDeposit(double balance){
        this.balance =this.balance+balance;
        System.out.println(this.balance );
    }

    public void setWithdrawal(double balance){
        this.balance=this.balance-balance;
    }


}
