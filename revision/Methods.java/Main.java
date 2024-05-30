public class Main{

    //lets see how to call a method by making the method static and by object.

    /* 
    // first we will see how to call a method by making the method static.

    static int max(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = max(a, b);
        System.out.println(c);
    }
    // This is how we call a method by making it static.
    */
    /* 
    //Now we will se how a call a method by making an object.

    int max(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        Main m = new Main();
        System.out.println(m.max(a,b));
    }

    // This is how we call a method by object.
    */
    // We will see that if the value of a formal parameter is changed then also the actual value will remain the same.
    
    // This is also called parameter passing.
    static void inc(int x){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a = 50;
        inc(a);
        System.out.println(a);
    }
    
}