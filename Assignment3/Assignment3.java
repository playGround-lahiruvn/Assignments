import java.util.Scanner;

public class Assignment3{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        String sub1;
        String sub2;
        String sub3;
        double marks1;
        double marks2;
        double marks3;
        
        

        final String RED = "\033[31m";
        final String BLUE_BOLD = "\033[34;1m";
        final String DEFAULT = "\033[30;0m";
        final String GREEN = "\033[32m";
        final String YELLOW = "\033[35m";


        // final String RED = "\033[31m";
        // final String DEFAULT = "\033[30;0m";

        final String ERROR_MSG = String.format("%s%s%s \n",RED,"%s",DEFAULT);

        app:
        {
            System.out.print("Enter your name : ");
            name = scan.nextLine().strip();

            if(name.length() == 0){
                System.out.printf(ERROR_MSG,"Invalid name");
                break app;
            }
        

            System.out.print("Enter your age : ");
            age =scan.nextInt();
            scan.nextLine();

            if(age < 10 || age >18){
                System.out.printf(ERROR_MSG,"Invalid age");
                break app;
            }

            //subject 1

            System.out.print("Enter subject 1 : ");
            sub1 = scan.nextLine();

            if(sub1.isBlank()){
                System.out.printf(ERROR_MSG, "Subject 1 can't be empty");
                break app;
            }else if(!sub1.startsWith("SE-")){
                System.out.printf(ERROR_MSG, "Subjects need to starts with SE-");
                break app;
            }

            System.out.print("Enter your marks 1 : ");
            marks1 = scan.nextDouble();
            scan.nextLine();

            if(marks1 < 0 || marks1 > 100){
                System.out.printf(ERROR_MSG, "Invalid marks");
                break app;
            }


            //subject 2

            System.out.print("Enter subject 2 : ");
            sub2 = scan.nextLine();

            if(sub1.isBlank()){
                System.out.printf(ERROR_MSG, "Subject 2 can't be empty");
                break app;
            }else if(!sub2.startsWith("SE-")){
                System.out.printf(ERROR_MSG, "Subjects need to starts with SE-");
                break app;
            }else if(sub2.equals(sub1)){
                System.out.printf(ERROR_MSG,"Subject 2 already exist");
                break app;
            }

            System.out.print("Enter your marks 2 : ");
            marks2 = scan.nextDouble();
            scan.nextLine();

            if(marks2 < 0 || marks2 > 100){
                System.out.printf(ERROR_MSG, "Invalid marks");
                break app;
            }

            //Subject 3


            System.out.print("Enter subject 3 : ");
            sub3 = scan.nextLine();

            if(sub3.isBlank()){
                System.out.printf(ERROR_MSG, "Subject 3 can't be empty");
                break app;
            }else if(!sub3.startsWith("SE-")){
                System.out.printf(ERROR_MSG, "Subjects need to starts with SE-");
                break app;
            }else if(sub3.equals(sub1) || sub3.equals(sub2)){
                System.out.printf(ERROR_MSG,"Subject 3 already exist");
                break app;
            }

            System.out.print("Enter your marks 3 : ");
            marks3 = scan.nextDouble();
            scan.nextLine();

            if(marks3 < 0 || marks3 > 100){
                System.out.printf(ERROR_MSG, "Invalid marks");
                break app;
            }

            double total = marks1 + marks2 + marks3;
            double avg = total / 3;
            
            

            String status; //Overall status
            String sub1Status;
            String sub2Status;
            String sub3Status;

            final String DESITICNATION = BLUE_BOLD + "Destincnation pass"+ DEFAULT;
            final String CREDIT_PASS = GREEN + "Credit pass" + DEFAULT;
            final String PASS = YELLOW + "Pass" + DEFAULT;
            final String FAIL = RED + "Fail" + DEFAULT;

            //Declare overall ststus

            if(avg >= 75){
                status = DESITICNATION;
            }else if(avg >= 65 ){
                status = CREDIT_PASS;
            }else if(avg >= 55){
                status = PASS;
            }else{
                status = FAIL;
            }

            //Subject 1 status

            if(marks1 >= 75){
                sub1Status = DESITICNATION;
            }else if(marks1 >= 65 ){
                sub1Status = CREDIT_PASS;
            }else if(marks1 >= 55){
                sub1Status = PASS;
            }else{
                sub1Status = FAIL;
            }

            //Subject 2 status

            if(marks2 >= 75){
                sub2Status = DESITICNATION;
            }else if(marks2 >= 65 ){
                sub2Status = CREDIT_PASS;
            }else if(marks2 >= 55){
                sub2Status = PASS;
            }else{
                sub2Status = FAIL;
            }

            //Subject 3 status

            if(marks3 >= 75){
                sub3Status = DESITICNATION;
            }else if(marks3 >= 65 ){
                sub3Status = CREDIT_PASS;
            }else if(marks3 >= 55){
                sub3Status = PASS;
            }else{
                sub3Status = FAIL;
            }

            


            //Generate Table

            sub1 = String.format("SE-%03d", Integer.valueOf(sub1.substring(3)));
            sub2 = String.format("SE-%03d", Integer.valueOf(sub2.substring(3)));
            sub3 = String.format("SE-%03d", Integer.valueOf(sub3.substring(3)));

            name = String.format("%s%s%s", BLUE_BOLD,name.toUpperCase(),DEFAULT);


            System.out.println("+".concat("-".repeat(50).concat("+")));

            System.out.printf("|%10s:  %-50s |\n", "Name", name);
            System.out.printf("|%10s:  %-36s |\n", "Age", age + " years old");
            System.out.printf("|%10s:  %-48s |\n", "Status", status);
            System.out.printf("|%10s:  %-36.2f |\n", "Total", total);
            System.out.printf("|%10s:  %-36s |\n", "Avg", String.format("%.2f",avg).concat("%"));

            //System.out.printf("+".concat("-".repeat(6).concat("+").concat("-").repeat(12).concat("+")));

            final String LINE = "+".concat("-".repeat(10).concat("+").concat("-".repeat(12)).concat("+").concat("-".repeat(26).concat("+")));

            System.out.println(LINE);

            System.out.printf("|%-10s|%-12s|%-26s| \n", "Subject","Marks","Grade");
            System.out.println(LINE);
            System.out.printf("|%-10s|%-12s|%-40s| \n", sub1,marks1,sub1Status);
            System.out.printf("|%-10s|%-12s|%-36s| \n", sub2,marks2,sub2Status);                                             
            System.out.printf("|%-10s|%-12s|%-38s| \n", sub3,marks3,sub3Status);







            System.out.println("+".concat("-".repeat(50).concat("+")));

        }

       


    }
}