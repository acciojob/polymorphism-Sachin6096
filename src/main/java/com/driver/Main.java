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
        Product p = new Product();

        p.production(5,6);
        p.production(5,6,4);
        p.production(5.0,6.2);
    }
}