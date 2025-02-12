package org.example.Interfaces;

interface Camera{
    void takesnap();
    void recording();

    default void videorecording(){
        System.out.println("Video recording ");
    }

}

interface Wifi {
    String[] getNetworks();

    void connectToNetworks(String network);

}

class MyCellPhone{
    void CallNumber(int number){
        System.out.println("Calling");
    }

    void PickCall(int number){
        System.out.println("Connecting........");
    }
}
class MySmartPhone extends MyCellPhone implements Wifi,Camera{
    public void takesnap(){
        System.out.println("Taking Snap");
    }
    public void recording(){
        System.out.println("CallRecording");

    }
   public String[] getNetworks(){
        System.out.println("Getting Networks");
        String [] networksList={"chandu","Praveen"};
        return networksList;
    }
    public void connectToNetworks(String network){
        System.out.println("conncetto+"+network);
    }

}


public class DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.recording();
        ms.videorecording();
        String [] array = ms.getNetworks();
        for (String item:array) {
            System.out.println(item);

        }
    }
}




