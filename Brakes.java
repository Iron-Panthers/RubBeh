public class Brakes {
    private boolean works = true; //i sure hope it does
    private int temp = 72; //f
    private int wearLevel = 0; //1 to 10
    private double breakingTime = 0; //cumulative

    //prints general break health info
    public void breakHealth() {
        System.out.println("ntempature: "+temp+"\ntime spent breaking: "+breakingTime+"\nhealth:"+wearLevel+"\ncan break? "+works);
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
        return Math.max(1,time/3);
    }

}
