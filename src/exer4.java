import java.util.Scanner;

public class exer4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //Q1

        for(int i = 1;i<=100;i++){
           if ((i%3==0)&&(i%5==0)) {
               System.out.println("FizzBuzz");
            }else if (i%3==0)
            { System.out.println("fizz");
            } else if (i%5==0) {
               System.out.println("buzz");}
           else {
               System.out.println(i);
           }
       }

        System.out.println(" ");

        //Q2
        System.out.println("enter a word : ");
        String word=s.nextLine().trim();
        String revarce="";
        for(int i=word.length()-1;i>=0;i--){
            revarce+=word.charAt(i);
        }
        System.out.println(revarce);

        //Q3
       System.out.print("enter any number if you want to find the factorial :");
        int num1=s.nextInt();
        int factorial=1;
        for(int i=1;i<=num1;i++){
            factorial*=i;}
        System.out.println("the factorial is :"+factorial);

        //Q4
        System.out.println(" ");
        System.out.println("Enter first number : ");
        int base=s.nextInt();
       System.out.println("Enter second number : ");
        int power=s.nextInt();
        int result=1;
        for(int i = 0;i<power;i++) {
            result=result*base;
        }
       System.out.println("the answer is : "+result);

        //Q5


       int sumeven = 0;
       int sumodd = 0;
       System.out.println("how many numbers do you want ? ");
       int count = s.nextInt();
       for (int i = 0; i < count; i++) {
            System.out.println("enter a number: ");
            int num = s.nextInt();
            if (num % 2 == 0) {
               sumeven += num;
           } else {
               sumodd += num; }
            }
        System.out.println("sum of even numbers is: " + sumeven);
        System.out.println("sum of odd numbers is: " + sumodd);





        //Q6

      System.out.println("enter a positive integer: ");
       int num = s.nextInt();
       boolean prime=true;
       if(num<=1){
           prime=false;
       }
       for (int i = 2; i < num; i++) {
           if (num % i == 0){
             prime=false;
             break; }
        } if (prime) {
           System.out.println("prime");
       } else {
            System.out.println("not prime");
       }

       s.nextLine();


        //Q7

       for (int i=1;i<=4;i++){
           System.out.println(i +" week: ");
            for(int j=1;j<=7;j++){
                System.out.println(" day: "+j);
            }
       }

         //Q8

        System.out.println("enter the word: ");
        String word1=s.nextLine();
       boolean ispalindrome =true;
       String revarcee="";
       for(int i=word1.length()-1;i>=0;i--) {
           revarcee += word1.charAt(i);
       }if (revarcee.equals(word1)) {
           System.out.println("palindrome");
        }else if (!revarcee.equals(word1)){
            System.out.println("its not palindrome");
        }










    }
}





