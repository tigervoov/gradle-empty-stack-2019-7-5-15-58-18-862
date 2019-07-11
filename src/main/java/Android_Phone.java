public class Android_Phone extends Mobile {
    @Override
    public String returnMessage(String title,String message){
        return super.returnMessage(title,message);
    }

    @Override
    public void sentMessageError(){
        System.out.println("<Android> Message cannot be sent");
    }
}
