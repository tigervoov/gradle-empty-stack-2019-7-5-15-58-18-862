public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sentMessage(Mobile mobile){
        mobile.sentMessageError();
    }
}
