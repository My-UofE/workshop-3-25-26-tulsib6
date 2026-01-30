public class DemoIncrement {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        int a = 3;
        int b = a++ + 5;
        int x = 3;
        int y = ++x + 5;
        int p = 3;
        //++p;
        p++;
        int q = p + 5; 
        
        x = (x>0)?x:0;
        y = (x<100)?1:0;

        System.out.print("a: " + a);
        System.out.print(", b: " + b);
        System.out.print(", x: " + x);
        System.out.print(", y: " + y);
        System.out.print(", p: " + p);
        System.out.println(", q: " + q);

        // Replace the xxxxx in the following with the correct term
        System.out.println("i++ means pre-increment");
        System.out.println("++i means post-increment");
    }
}
