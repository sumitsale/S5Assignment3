class Rectangle 
{ 
      int length ; 
      int breadth ; 
        Rectangle() 
        { 
           System.out.println("Constructor with Zero Parameter Called "); 
           length = breadth = 0 ; 
         } 
         Rectangle(int side) 
         { 
            System.out.println("Constructor with One Parameter Called"); 
            length = breadth = side ; 
         } 
         Rectangle(int l,int b) 
         { 
            System.out.println("Constructor with Two Parameters Called"); 
            length = l ; 
            breadth = b ; 
         } 
         int area() 
         { 
           return (length * breadth) ; 
         } 
} 
 public class S5Assignment3 
{ 
               public static void main(String[] args) 
          { 
                Rectangle r1 = new Rectangle(); 
                Rectangle r2 = new Rectangle(5); 
                Rectangle r3 = new Rectangle(7,8); 
                System.out.println("Area of First Rectangle is : "+ r1.area( )); 
                System.out. println("Area of Square is : "+ r2.area( )); 
                System.out.println("Area of Second Rectangle is : "+ r3.area( )); 
          } 
} 