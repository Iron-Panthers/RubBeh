public class Gps {
    private String destination = "your mom's house";
    private int power = 100;
    private boolean isOn = true;

    public void setDestination(String target){
        System.out.println("Destination was "+destination+", and is now "+target);
        destination = target;
        power = Math.max(0,power - (int)(Math.random()*15));
        if (power == 0){
            System.out.println("GPS powering down...");
            isOn = false;
        }
        else if (power < 30){
            System.out.println("GPS power is low.("+power+")");
        }
    }

    public void charge(int amount){
        if(amount > (100-power)){
            System.out.println("Fatel overcharge error.\nExploding...");
            power = 0;
        }
        else if(amount < 1){
            System.out.println("This GPS does not support charging other devices, and requires 5v current to charge.");
        }
        else{
            System.out.println("GPS power increased by "+amount+"%");
            isOn = true;
            power += amount;
        }
    }

    @Override
    public String toString(){
        return
        "Power Level: "+power+"\nis on: "+isOn+"Current destination: "+destination;
    }
}
