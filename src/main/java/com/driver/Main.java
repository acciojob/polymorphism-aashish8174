package com.driver;

public class Main {
      //public static void main(String args[]){
          Product p = new Product();
          int prod1 = p.product(1,2);
          int prod2=p.product(3,4,5);
          double prod3 = p.product(6,7);
    //  }

    public class Product{
        public  int product(int x , int y){
            return x*y;
        }
        public  int product(int x,int y,int z){
            return x*y*z;
        }
        public  double product(double x,double y){
            return (double)x*y;
        }
    }
}