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
        if (shape.equals(array[1])){
            System.out.println("This will be a smooth ride");
           howMPH = howMPH + 5; 

        }else{
            System.out.println("That will be a bumpy ride") ;
            howMPH = howMPH - 3; 
        }
        
        if((airPressure >= 130)){

        }else if(60<airPressure && airPressure< 129){

        }else if (airPressure <59){

        }
    }
}
