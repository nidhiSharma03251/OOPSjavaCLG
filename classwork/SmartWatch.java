package classwork;
public class SmartWatch implements FitnessTracker, NotificationReceiver{
    String watchBrand;
    String model;

    int StepCount;
    String notificationMsg;

    public SmartWatch(String watchBrand, String model){
        this.watchBrand=watchBrand;
        this.model=model;
    }

    public void showTime(){
        System.out.println("current timimg is 12:30am");
    }

    public void countSteps(){
        StepCount+=100;
        System.out.println("Total steps: "+StepCount);
    }

    public void calcCalories(){
        double calories = StepCount*0.04;
        System.out.println("Total calories :" +calories);
    }

    public void receiveNotification(){
        notificationMsg = "New message";
        System.out.println("Message received");
    }

    public void displayNotification(){
        System.out.println("Notification message"+ notificationMsg);
    }

    public static void main(String args[]){
    SmartWatch watch = new SmartWatch("Titan", "seriesPro10");

    watch.showTime();
    watch.countSteps();
    watch.receiveNotification();
    watch.calcCalories();
    watch.displayNotification();
    }

}

interface FitnessTracker {
    void countSteps();
    void calcCalories();
}

interface NotificationReceiver {
    void receiveNotification();
    void displayNotification();
}



