package com.company;


//Generics idea is to allow type (Integer, String, … etc and user defined types) to be a
// parameter to methods, classes and interfaces. Tüüp võib olla mistahes pmst
//Generics add re-usability by enabling you to to define a class or interface without specifying fixed parameter data types.
//For example With Java Generics you can write a generic method for sorting an array of objects, then invoke the generics method with integer arrays.


// A Simple Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
class GenericsN2ide<T>
{
    // An object of type T is declared
    T obj;
    // constructor
    GenericsN2ide(T obj) {
        this.obj = obj;
    }

    public T getObject()  {
        return this.obj;
    }
}

// Driver class to test above
class GenericsN2iteMain
{
    public static void main (String[] args)
    {
        // instance of Integer type
        GenericsN2ide <Integer> integerObj = new GenericsN2ide<>(15);
        System.out.println(integerObj.getObject());

        // instance of String type
        GenericsN2ide <String> stringObj =
                new GenericsN2ide<>("Sammalhabe");
        System.out.println(stringObj.getObject());
    }
}