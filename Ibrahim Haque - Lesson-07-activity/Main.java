
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/

System.out.println("enter a value for X");
double x = Input.readDouble();
double y = Math.pow(x,7);
System.out.println(y);
/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/

  System.out.println("Enter the value for z");
    double z = Input.readDouble();
    double q = (Math.pow(z,3) +5);
    System.out.println("The value of q is:"+ q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
System.out.println("Enter the value for t");
System.out.println("Enter the value for r");
double t = Input.readDouble();
double r = Input.readDouble();
double s = (Math.pow(t,5) * Math.pow((r+2),4));
System.out.println("The value of s is:"+ s);
/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

System.out.println("Enter the value for A");
System.out.println("Enter the value for B");
double A = Input.readDouble();
double B = Input.readDouble();
double C = (Math.sqrt(A + B));
System.out.println("The value of C is:"+ C);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/


System.out.println("Enter the value for x1");
System.out.println("Enter the value for x2");
System.out.println("Enter the value for y1");
System.out.println("Enter the value for y2");
double x1 = Input.readDouble();
double x2 = Input.readDouble();
double y1 = Input.readDouble();
double y2 = Input.readDouble();
double d = (Math.sqrt(Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
System.out.println("The distance is:"+ d);

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/


System.out.println("Enter the degree");
double deg = Input.readDouble();
double g = (Math.sin(deg));
System.out.println("The value of g is:"+ g);


/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/

System.out.println("Enter the value for m");
System.out.println("Enter the value for n");
double M = Input.readDouble();
double N = Input.readDouble();
double k = (Math.pow(M,5)/(Math.sqrt(N - 1)));
System.out.println("The value of k is:"+ k);


/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/

System.out.println("Enter the value for a");
System.out.println("Enter the value for b");
System.out.println("Enter the value for c");
double a = Input.readDouble();
double b = Input.readDouble();
double c = Input.readDouble();
double quadratic = -(b) + Math.sqrt((Math.pow(b,2)- 4 * a *c)/ 2 *a);
System.out.println("The value of the quadratic formula is:"+ quadratic);



    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}