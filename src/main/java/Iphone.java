public class Iphone extends  Mobile {
    @Override
    public String returnMessage(String title,String message){

        return super.returnMessage(title,message);
    }
    public void sentMessageError(){
        System.out.println("<iphone> Message cannot be sent");
    }
}
