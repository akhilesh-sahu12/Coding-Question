package com.akhil;
import java.util.*;

public class Main {
    public static void main(String[] args) {


    /*     //2D ArrayList=A dynamic list of lists
         // you can change the size of these lists during runtime
         ArrayList<ArrayList<String>>groceryList=new ArrayList();
        ArrayList<String> bakeryList=new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

         ArrayList<String> productList=new ArrayList();
         productList.add("tomatoes");
         productList.add("zuchhini");
         productList.add("peppers");

         ArrayList<String> drinkList=new ArrayList();
         drinkList.add("soda");
         drinkList.add("coffee");

         groceryList.add(bakeryList);
         groceryList.add(productList);
         groceryList.add(drinkList);

         System.out.println(groceryList);

       System.out.println(bakeryList);
         System.out.println(productList);
         System.out.println(drinkList);

     System.out.println(groceryList.get(0).get(0));
       //System.out.println(bakeryList.get(2));
*/

      /*   //  for-each = traversing technique to iterate through the element in an array/collection
         //             less steps, more readable
         //             less flexible

         //String[] animals={"cat", "Dog","rat","bird"};
         ArrayList<String>animals=new ArrayList<String>();
         animals.add("Cat");
         animals.add("Dog");
         animals.add("rat");
         animals.add("bird");

         for (String i:animals){
             System.out.println(i);
         }
*/
         /* //method = a block of code that is executed whenever it is called upon
       String name="akhil";
       int age=18;
         hello(name,age);
         hello();
          */
     /*    int x=3;
         int y=4;
       int z=  add(x,y);
         System.out.println(z);
       //  System.out.println(add(x,y));

      */
       /*  // Overloaded method = methods that share the same name but have different parameters
         //                     method name + parameter = method signature
         double x=add(1.5,26.7,5,8);
         System.out.println(x);

        */

      /*   // printf() = an optional method to control, format, and display text to the console window
         //            two arguments = format string + (object/variable/value)
         //            % [flags] [precision] [width] [conversion-character]
        // System.out.printf("%d this is a format str ",123);
         boolean myBoolean= true;
         char myChar='@';
         String myString ="Akhil";
         int myInt=43;
         double myDouble=10000;
        // System.out.printf("%b",myBoolean);
       //  System.out.printf("%c",myChar);
       //  System.out.printf("%s",myString);
       //  System.out.printf("%d",myInt);
      //   System.out.printf("%f",myDouble);
         //[width]
         // minimum number of characters to be written as output
        // System.out.printf("Hello %10s",myString);// 10 spaces before my String

         //[precision]
         // sets number of digit of precision when outputting floatting-point values
         //System.out.printf("You have this much money %.2f",myDouble);// after decimal 2 digit value

         //[flags]
         // add an effect to output based on the flag added to format specifier
         // - : left justify
         // + : output a plus ( + ) or minus ( - ) sign for a numeric value
         // 0 : numeric values are zero-padded
         // , : comma grouping separator if number > 1000
        // System.out.printf("You have this much money %20f",myDouble);
        // System.out.printf("You have this much money %+f",myDouble);
       //  System.out.printf("You have this much money %020f",myDouble);
         System.out.printf("You have this much money %,f",myDouble);

      */

 /*  final double PI=3.14159;
   System.out.println(PI);
   */

 /*// object = an instance of a class that may contain attributes and methods
 // Example : (phone, desk, computer, coffee cup)

    Car myCar1=new Car();
    Car myCar2=new Car();
         System.out.println(myCar1.model);
         System.out.println(myCar1.make);
         myCar1.drive();
         myCar1.brake();
         myCar2.drive();
         myCar2.brake();

  */

      /*   // constructor = special method that is called when an object is instantiated (created)
         Human human=new Human("Akhilesh",28,32.87);
         Human human1=new Human("sachin",23,32.7);
         System.out.println(human1.name);
         System.out.println(human.name);
         System.out.println(human.age);
         human1.eat();
         human.drink();

       */

     /*    //local = declared inside a method
         //        visible only to that method

         //global = declared outside a method, but within a class
         //         visible to all part of a class

         DiceRoller diceRoller=new DiceRoller();

      */

       /*  // overloaded constructors = multiple constructors within a class with same name,
         //                           but have different parameters
         //                           name + parametrs = signature
         Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerells", "pepperoni");
         System.out.println("Here are the ingredients of your pizza");
         System.out.println(pizza.bread);
         System.out.println(pizza.sauce);
         System.out.println(pizza.cheese);
         System.out.println(pizza.topping);
         Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzerells");
         System.out.println(pizza1.bread);
         System.out.println(pizza1.sauce);
         System.out.println(pizza1.cheese);
         Pizza pizza2 = new Pizza("thicc crust", "tomato");
         System.out.println(pizza2.bread);
         System.out.println(pizza2.sauce);
         Pizza pizza3 = new Pizza("thicc crust");
         System.out.println(pizza3.bread);
         Pizza pizza4 = new Pizza();
         System.out.println(pizza4.bread);
         System.out.println(pizza4.sauce);
         System.out.println(pizza4.cheese);
         System.out.println(pizza4.topping);

        */

        /*  // toString() = spacial method that objects inherit,
         //               that returns a string that "textually represent" an object
         //               can be used both implicitly and explicitly
          Car car =new Car();


          //System.out.println(car.toString());
          System.out.println(car.toString());
          System.out.println(car);

         */

 /*  int[] numbers=new int[4];
   char[] characters=new char[5];
   String[] strings=new String[6];

  // Food[] refrigerator=new Food[3];

         Food food1=new Food("pizza");
         Food food2=new Food("hamburger");
         Food food3=new Food("hotdog");
         Food[] refrigerator={food1,food2,food3};

       //  refrigerator[0]=food1;
       //  refrigerator[1]=food2;
       //  refrigerator[2]=food3;

         System.out.println(refrigerator[0].name);
         System.out.println(refrigerator[1].name);
         System.out.println(refrigerator[2].name);

  */


    /*       // method overriding = Declaring a method in sub class
          //                      which is already present in parent class
          //                      done so that a child can give its own implementation
         Animal animal=new Animal();
          Dog dog=new Dog();
                  dog.speak();
                  animal.speak();

     */



       /*   // abstract = abstract cannot be instantiated, but they can have a subclass
          //            abstract methods are declared without an implementation

          Car1 car1=new Car1();
        //  Vehicle1 vehicle1=new Vehicle1();
          car1.go();

        */


  /*  // Encapsulation = attributes of a class will be hidden or private,
    //                 can be accessed only through methods (getters & setters)
    //                 you should make attributes private if you don't have a reason to make them public/protected

          Car3 car2=new Car3("chevrolet","Camro", 2021);

          car2.setMake("Akg");
         System.out.println(car2.getMake());
         System.out.println(car2.getModel());
         System.out.println(car2.getYear());

   */

    /*     Car3 car1=new Car3("chevrolet","Camro", 2021);
        //  Car3 car2=new Car3("Ford","Mustang", 20222);
         // car2.copy(car1);
         Car3 car2=new Car3(car1);


          System.out.println(car1);
          System.out.println(car2);
          System.out.println();
          System.out.println(car1.getMake());
          System.out.println(car1.getModel());
          System.out.println(car1.getYear());
          System.out.println();
          System.out.println(car2.getMake());
          System.out.println(car2.getModel());
          System.out.println(car2.getYear());

     */
        /*
          //mcq
          System.out.println('a'+'b');//97+98=195
          System.out.println(65);

         */

          /*
          // caching range -128 to 127

          Integer num1=100;
          Integer num2=100;
          Integer num3=128;
          Integer num4=128;
          if(num1==num2)
          {
               System.out.println("num1==num2");
          }
          else {
               System.out.println("num1!=num2");
          }
          if(num3==num4)// 128>127  if x>127 then execute false
          {
               System.out.println("num3==num4");
          }
          else {
               System.out.println("num3!=num4");
          }

           */

        /* int a[]=new int[5];

          for(int i=0; i<5; i++)
          {
               System.out.println(a[i]);
          }

         */

    /*     // exception = an event that occurs during the execution of a program that,
         //             disrupts the normal flow of instruction
         Scanner sc = new Scanner(System.in);
  try {

       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = a / b;
       System.out.println(c);

  }
  catch (ArithmeticException e){
      System.out.println("you can't divide by zero! Idiot!");
  }
  catch (InputMismatchException e){
      System.out.println("please enter a number OMFG");
  }
  catch (Exception e){
      System.out.println("Something went wrong");
  }
 // finally {
 //     System.out.println("this will be always print");
 // }
  finally{
             sc.close();
         }

     */

 /*    try {
         FileWriter writer = new FileWriter("Akhil.txt");
         writer.write("Roses are red");
         writer.close();
     }
     catch (IOException e){
         e.printStackTrace();
     }

  */
       /*   float f=0.1f;

          if(f==0.1)
          {
               System.out.println("equil");
          }
          else
               System.out.println("not equil");//

        */
        /*  int x=1000;
          double y=56;
          System.out.println();
*/

          System.out.println("haloo");
     }
    /*static void hello(String name,int age){
        System.out.print("hello ");
        System.out.println(name);
        System.out.println("you are "+age+" years old");
    }*/
   /* static  int add(int x, int y){
        int z=x+y;
        return z;
        // return x+y;

    }*/

   /* static int add(int a, int b){
        System.out.println("#1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("#2");
        return a+b+c;
    }
    static int add(int a, int b, int c,int d){
        System.out.println("#3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("#4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("#5");
        return a+b+c;
    }
    static double add(double a, double b, int c,int d){
        System.out.println("#6");
        return a+b+c+d;
    }

    */


}
