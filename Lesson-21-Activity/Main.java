class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    allowance();
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  void allowance(){
    int days = 0;
    int penny = 1;
    int final = Math.pow(penny,2);
    while(!(final == 500))
        days ++;
    if(final == 500)
      print("It takes (days) days to get to $5"); 
  }
}