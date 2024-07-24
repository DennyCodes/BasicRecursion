// Main.java

class Main {
    public static int exponent(int base, int power){
    
      if (power==0) {
        return 1; 
      }
      return exponent(base, power-1)*base;
      
    }
    public static int fact(int num){
    
      if (num==0) {
        return 1; 
      }
      return fact(num-1)*num;
      
    }
    public static int digits(int num) {
      if (num%10==num) {
        return num;
      }
      
      return digits(num/10)+num%10;
    }
    public static int fib(int n) {
      if (n==1) {
        return 1;
      }
      else if (n==2) {
        return 2;
      }
      return fib(n-1)+fib(n-2);
    }
    public static boolean palin(String s) {
      if (s.length()==1) {
        return true;
      }
      else if (s.length()==0) {
        return true; 
      }
      else if (s.charAt(0)!=s.charAt(s.length()-1)) {
        return false;
        
      }
      return palin(s.substring(1,s.length()-1));
      
      
    }
    public static void main(String[] args) {
      System.out.println(exponent(3,4));
      System.out.println(fact(5));
      System.out.println(digits(108));
    	System.out.println(fib(5));
    	System.out.println(palin("ababa"));
    }
}