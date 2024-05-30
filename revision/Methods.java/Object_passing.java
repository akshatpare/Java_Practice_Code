public class Object_passing {
    // Here we will see how objects are passed as parameters. And also we will see how array is passed as a parameter.

    static void update(int A[]){
        A[0] = 25;
        System.out.println(A[0]);
    }
    public static void main(String args[]){
        int A[] ={1,2,3,4,5};
        System.out.println(A[0]);
        update(A);
    }
    /* 
     Now what we did here is we created an Array and we gave values to that array {1,2,3,4,5},
     
    Array holds objects
     the object is creared in heap and the reference is crated inside stack because a reference is also a variable
    reference holds the address of the array
     when we craete a method in java and we give parameter in the method that time in parameter we can put the reference that holds the address of 
    object and when we create an array we create an array the name of the array is actually a reference and the value that we store in the array is actually
    an object, so when we use referance of an arrya in the parameter it makes the copy of the referance of the actual array but it holds the actual address of 
    the array.
    
    /*As we know that there are actual and formal parameter, so when we create a method which has array referance in the parameter (formal parameter) it copys 
    the refernce of the actual reference which is in main method.  */

    //only the value of prematives is changed but the value of non premativs

    // index is used for going to the index of the array Ex: int index.
    // for changing the value of the index we are on we use value Ex: int value.
    // for changing the value of the index we are on we use value Ex: int value.
    
/* 
    
*/ 
}
