public class Wheels {
    //wheels (Shape, air pressure, size, speed)
    private String shape; 
    private double airPressure; 
    private int size;
    private int speed;
    private double howMPH = 10;
    private String[] array = {"square"," circle", "triangle", "diamond", "oval", "rectangle", "star", "heart"};
    public Wheels(String shape,int airPressure, int size,int speed){
        this.shape = shape;
        this.airPressure = airPressure;
        this.size = size;
        this.speed = speed;
        howMPH = speed;
        if (shape.equals(array[1])){
            System.out.println("This will be a smooth ride");
           howMPH = howMPH + 5; 

        }else{
            System.out.println("That will be a bumpy ride") ;
            howMPH = howMPH - 3; 
        }

        //end of shape

        if(size >= 15){
            howMPH = howMPH - 10;
            System.out.println("This bike is too big;it will not move very fast") ;
        }else if (size < 15 && 6 > size ){
            howMPH = howMPH + 5;
            System.out.println("This is a good sized bike") ;
        }else if( 5>= size){
            howMPH = howMPH - 5;
            System.out.println("That is an extreamly small bike that won't move very fast") ;
        }//end of is 

        //end of size
        
        if((airPressure >= 130)){
            howMPH = 0;
            System.out.println("You can't ride a bike with busted wheels") ;
        }else if(60<airPressure && airPressure< 129){
            howMPH =howMPH+5;
            System.out.println("Woooo, These tires are useable") ;
        }else if (airPressure <59){
            howMPH =howMPH-5;
            System.out.println("These are flat tires") ;
        }// end of if 

        //end of air pressure
 
    }
}
