package com.epam.test.automation.java.practice1;

public class Main {

    private Main(){}
    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        if (n>0){
            return n*n;
        }
        else if (n<0) {
            return -n;
        }
        else{
            return 0;
        }
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        if (n / 100 > n / 10 % 10 && n / 100 >= n % 10) {
            if (n / 10 % 10 > n % 10) {
                n = n / 100 * 100 + n / 10 % 10 * 10 + n % 10;
            }
            else{
                n = n / 100 * 100 + n % 10 * 10 + n / 10 % 10;
            }
        }
        if (n / 10 % 10 > n / 100 && n / 10 % 10 >= n % 10) {
            if (n / 100 > n % 10) {
                n = n / 10 % 10 * 100 + n / 100 * 10 + n % 10;
            }
            else {
                n = n / 10 % 10 * 100 + n % 10 * 10 + n / 100;
            }
        }
        if (n % 10 > n / 100 && n % 10 >= n / 10 % 10) {
            if (n / 100 > n / 10 % 10) {
                n = n % 10 * 100 + n / 100 * 10 + n / 10 % 10;
            }
            else {
                n = n % 10 * 100 + n / 10 % 10 * 10 + n / 100;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(task1(n));
        System.out.println(task2(n));
    }

}