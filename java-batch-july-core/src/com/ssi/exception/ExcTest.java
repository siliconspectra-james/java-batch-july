package com.ssi.exception;

public class ExcTest {

    //checked exception
    public void throwException () throws Exception {
        throw new Exception("MyException");
    }


    //throw exception to caller method
    public void dealException1() throws Exception {
        throwException();
    }

    //try catch to deal exception in current method
    public void dealException2() {
        try {
            throwException();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this is finally block");
        }

    }

    //unchecked exception
    public void dealException3() {
//        int i = 1/0;
        try {
            int i = 1/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        ExcTest excTest = new ExcTest();
        try {
            excTest.dealException1();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        excTest.dealException2();

        excTest.dealException3();
    }
}
