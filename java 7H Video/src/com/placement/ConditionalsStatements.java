package com.placement;

class ConditionalsStatements {
    public static void main(String[] args) {
        // if
        // if  else
        // if  else if  else if  else
        // switch
        int n=-8;

        /*if(n%2==0)
            System.out.println("Even number");
        if(n%2!=0)
            System.out.println("Odd number");*/
        if(n%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");

       /* if(n==0)
            System.out.println("Zero");
        else
            if(n>0)
             System.out.println("Positive number");
            else
                System.out.println("Negative number");*/
        if(n==0)
            System.out.println("Zero");
        else if(n>0)
            System.out.println("Positive number");
        else
            System.out.println("Negative number");

        if(n%2==0 && n>0){
            System.out.print("positive ");
            System.out.println("Even number");
        }
        else if(n%2!=0 && n<0){
            System.out.print("Positive ");
            System.out.println("Odd number");
        }
        else if(n%2==0 && n==0){
            System.out.print("Zero ");
            System.out.println("Even number");
        }
        else if(n%2==0 && n<0){
            System.out.print("Negative ");
            System.out.println("Even number");
        }
        else {
            System.out.print("Negative ");
            System.out.println("Odd number");
        }
        int i=8;
        int j=4;

        /*if(i>j)
          j=1;
        else
            j=2;
        System.out.println(j);*/
       // ?: ->condition ? expr1:expr2
        j = (i > j) ? 1 : 2;
        System.out.println(j);

       int num=4;

       /*if(num==1)
        System.out.println("one");
       else if(num==2)
        System.out.println("Two");
       else if(num==3)
        System.out.println("Three");
       else if(num==4)
        System.out.println("four");
       else
           System.out.println("greater than four");*/
        /*switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Greater than Four");
                break;
        }*/
        // Enhance Switch
        switch (num) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            default -> System.out.println("Greater than Four");
        }
      /*  if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else {
            System.out.println("Greater than Four");
        }*/

        char ch='C';
        switch(ch) {
            case 'A':
                System.out.println("One");
                break;
            case 'B':
                System.out.println("Two");
                break;
            case 'C':
                System.out.println("Three");
                break;
            case 'D':
                System.out.println("Four");
                break;
            default:
                System.out.println("Greater than Four");
                break;
        }

        // we can not use double (Switch)
        // String supported in 1.7 < .....

    }
}
