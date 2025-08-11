public class car {
    String model;
    int price; 
   
   car(String a, int b){
       this.model = a;
       this.price = b;
   }
   void display(){
    System.out.println("model :" + model);
    System.out.println("price :" + price);
   }
   public static void main(String [] args){
    car c = new car("Thar", 120000);
    c.display();
    c.display();
   }
}

    
