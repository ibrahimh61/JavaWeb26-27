
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
//#1
	System.out.println("Enter your grade");
    double g = Input.readDouble();
	double result = gpa(g);
	System.out.println(result);

//#2

	System.out.println("Enter your grade level and the number of credits you currently have");
    int l = Input.readInt();
	int cr = Input.readInt();
	boolean total = isGraduating(l, cr);
	System.out.println(total);

//#3

	System.out.println("Enter your weight and height");
    double we = Input.readDouble();
	double he = Input.readDouble();
	String bmiFinal = BMI(we, he);
	System.out.println(bmiFinal);

//#4

System.out.println("Enter the weight of the product in pounds");
    double weig = Input.readDouble();
	double weigFinal = shippingCost(weig);
	System.out.println(weigFinal);

//#5

System.out.println("Enter the frequency (in hertz)");
    double freq = Input.readDouble();
	double decision = shippingCost(freq);
	System.out.println(freq);

  }
//#1
 double gpa(double grade){
  if (grade > 90)
    return ((grade) * 1.1);
  else
    return (grade);
  
}
//#2
boolean isGraduating(int gradeLevel, int credits){
  if(gradeLevel == 12 && credits >= 44)
    return true;
  else
    return false;
  
}
//#3
String BMI(double weight, double height){
  double bmi = ((weight)/(Math.pow(height,2) * 703));
  	if (bmi <= 18.4){
    	return ("Underweight");
  	}
  	else if(bmi >= 18.5 && bmi <= 24.9){
   	 return ("Normal");
  	}
  	else if (bmi >= 25.0 && bmi <= 39.9){
    	return ("Overweight");
  }
  else{
    return ("Obese");
  }
}
//#4
 double shippingCost(double wei){
    if (wei <= 10){
      return 0.00;
    }
    else if(wei > 10 && wei <=15){
      return 5.00;
    }
    else if(wei > 15 && wei <= 25){
      return 10.00;
    }
    else{
      return (10.00 + (wei * 2));
    }
  }
//#5
boolean blueOrViolet(double frequency){
  if ((frequency >= 600 && frequency <= 670) || (frequency >= 700 && frequency <= 750)){
    return true;
  }
  else{
    return false;
  }
}
  
}