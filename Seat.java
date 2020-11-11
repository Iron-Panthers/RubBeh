public class Seat { 
    //Seat (height, comfortability size) 
    private double heights;  
    private boolean comfortable; 
    private int size;  
    public Seat(double heights,boolean comfortable,int size){
        this.heights = heights;
        this.comfortable = comfortable;
        this.size = size;
    }
    public Seat(){
        heights = 20;
        comfortable = true;
        size = 3;
    }
    public String toString(){
        String output = new String();
        String output2 = new String();
        if(size > 3){
            output = "This is a good size for a bike";
        }else{
            output = " This is not a good size for a bike";
        }
        if(comfortable = true){
            output2 = " This will be a comfortable ride";
        }else if(comfortable = false){
            output2 = "This is not a comfortable ride ";
        }
        return output + " "+ output2 + " "+ " The height of this ride is " + heights;
    }
     
} 