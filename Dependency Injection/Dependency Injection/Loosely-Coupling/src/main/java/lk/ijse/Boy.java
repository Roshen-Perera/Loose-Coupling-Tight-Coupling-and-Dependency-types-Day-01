package lk.ijse;

public class Boy {
    public void chatWithGirl(){
        Girl girl = new Girl();
        girl.chat();
        girl.chatwithNimal();

    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}