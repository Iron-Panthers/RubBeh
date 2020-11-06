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
           howMPH = howMPH + 5; 

        }else{

            howMPH = howMPH - 3; 
        }

        //end of shape

        if(size >= 15){
            howMPH = howMPH - 10;
            
        }else if (size < 15 && 6 >= size ){
            howMPH = howMPH + 5;
           
        }else if( 5>= size){
            howMPH = howMPH - 5;
            
        }//end of is 

        //end of size
        if((airPressure >= 130)){
            howMPH = 0;
            
        }else if(60<=airPressure && airPressure<= 129){
            howMPH =howMPH+5;
            
        }else if (airPressure <=59){
            howMPH =howMPH-5;
            
        }// end of if 
    }
        public String toString() {
            String output = new String();
            String output2 = new String();
            String output3 = new String();
            if (shape.equals(array[1])){
               output = output + shape + (" : This will be a smooth ride ");
            }else{
                output = output + shape + (" : That will be a bumpy ride ") ;
            }
    
            //end of shape
            if(size >= 15){
                output2 = output2 +size + (" : This bike is too big; it will not move very fast ") ;
            }else if (size < 15 || 6 >= size ){
                output2 = output2 + size +(" :  This is a good sized bike ") ;
            }else if( 5>= size){
                output2 = output2 + size + ( " : That is an extreamly small bike that won't move very fast  " ) ;
            }//end of is 
    
            //end of size
            
            if((airPressure >= 130)){
                output3  = output3  + airPressure + (" :  You can't ride a bike with busted wheels ") ;
            }else if(60<=airPressure && airPressure<= 129){
                output3  = output3  + airPressure+ (" : Woooo, These tires are useable ") ;
            }else if (airPressure <59){
                output3  = output3  + airPressure + (" : These are flat tires ") ;
            }// end of if 
            return output + output2 + output3 +"This Bike will go " + howMPH + " miles per hour ";
          }//end tostring
        //end of air pressure
    
}
