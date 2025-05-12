// MultiplicationTable.java

public class MultiplicationTable {

       public static void multiplication(int a, int b) {
    
        System.out.print("    ");
        for (int i = a; i <= b; i++) {
            System.out.printf("%4d", i);  
        }
        System.out.println();

        System.out.print("    ");
        for (int i = a; i <= b; i++) { 
            System.out.print("----");         
             }
        System.out.println();

             for (int row = a; row <= b; row++) {
            System.out.printf("%2d |", row); 
              for (int col = a; col <= b; col++) {
                System.out.printf("%4d", row * col);            
                 }
            System.out.println();  
           
        }
    }
}
