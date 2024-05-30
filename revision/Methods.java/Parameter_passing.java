public class Parameter_passing {
    //Non primitive datatype.

    // String
/* 
    void welcome(String n){
        System.out.println("Welc    ome Mr & Mrs " + n);

    }
    public static void main(String args[]){
        String name = "Victor";
        Parameter_passing obj = new Parameter_passing(); //in non primitive datatype if we do parameter passing we make the copy of the refrence of the object not the copy of the object So when the copy of the refrence of the object is made it actually refers to the real object. 
        obj.welcome(name);
    }
*/
    // Array

    static void passing(int A[], int index, int value){
        A[index] = value;

    }
    // Primitive Datatype method
    static void primitive_passing(int x, int value){
        x = value; 
        
    }
    
    public static void main(String args[]){
        
        int A[] = {1,2,3,4,5,90};
        passing(A,3,50);

        for(int x : A){
            System.out.println(x);
        }
    //Primitive 
        int a = 10; 
        primitive_passing(a, 20);
        System.out.println(a); // the primitive's value did not change because of the actual parameter 


    }

    // the actual term for primitive parameter passing is "call by value".
    // the actual term for non-primitive parameter passing is "call by reference".
    
}
