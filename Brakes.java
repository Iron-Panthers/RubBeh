public class Brakes {
    private boolean works = true; //i sure hope it does
    private int temp = 72; //f
    private int wearLevel = 0; //0 to 10
    private double breakingTime = 0; //cumulative

    //prints general break health info
    public void breakHealth() {
        System.out.println("tempature: "+temp+"\ntime spent breaking: "+breakingTime+"\nwear level:"+wearLevel+"\ncan break? "+works);
    }
    //temp getter
    public int getTemp() {
        return temp;
    }

    //returns the amount of mph reduced by breaking
    public int breakFor(int time) {
        time = Math.max(1, time);
        temp += (int) time/5;
        System.out.println("Break temp is now: "+temp);
        breakingTime += time;
        if(
            ((int) Math.random() * time) > 15 || time > 40 //this is not a good way to do this
        ){wearLevel += 1;}
        System.out.println("Wear level is now: "+wearLevel);
        return Math.max(1,time/3);
    }

    //lets breaks cool down
    public void unusedFor(int time){
        temp = Math.max(72,time/20);
        System.out.println("Break temp is now: "+temp);
    }

    @Override
    public String toString(){
        return
        "tempature: "+temp+"\ntime spent breaking: "+breakingTime+"\nwear level:"+wearLevel+"\ncan break? "+works;
    }

}
