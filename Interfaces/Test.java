class Phone {
    public void call(){
        System.out.println("Making a call...");
    }

    public void message(){
        System.out.println("Sending a message..."); 
    }
}

interface ICamera{
    void takePicture();
    void recordVideo();
}

interface IMusicPlayer{
    void play();
    void pause();
}

class SmartPhone  extends Phone implements ICamera, IMusicPlayer{
    public void videoCall(){
        System.err.println("SmartPhone making a video call...");
    }

    @Override
    public void takePicture() {
        System.out.println("SmartPhone taking a picture...");
    }

    @Override
    public void recordVideo() {
        System.out.println("SmartPhone recording a video...");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone playing music...");
    }

    @Override
    public void pause() {
        System.out.println("SmartPhone pausing music...");
    }
}

public class Test {
    public static void main(String[] args){
        // SmartPhone myPhone = new SmartPhone();
        // myPhone.videoCall();
        // myPhone.call();
        // myPhone.message();
        // myPhone.takePicture();
        // myPhone.recordVideo();
        // myPhone.play();
        // myPhone.pause();


        Phone myOldPhone = new Phone();
        myOldPhone.call();
        myOldPhone.message();

        ICamera myCamera = new SmartPhone();
        myCamera.takePicture();
        myCamera.recordVideo();

        IMusicPlayer myMusicPlayer = new SmartPhone();
        myMusicPlayer.play();
        myMusicPlayer.pause();
    }
}
