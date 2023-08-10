package com.driver;

public class Main {

    public static class Product{

        public int production(int x, int y)
        {
            return x*y;
        }

        public int production(int x, int y, int z)
        {
            return x*y*z;
        }

        public double production(double x, double y)
        {
            return x*y;
        }
    }


    public static void main(String[] args)
    {
        Product obj = new Product();

        int a = obj.production(5,6);
        int b = obj.production(5,6,4);
        double c = obj.production(5.0,6.2);
    }
}