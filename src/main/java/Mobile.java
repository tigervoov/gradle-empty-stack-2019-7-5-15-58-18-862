public class Mobile {
    private String name;
    private String color;
    private String brand;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public Mobile() {
    }

    public Mobile(String name, String color, String brand){
        this.name=name;
        this.color=color;
        this.brand=brand;
    }

    public void getAllInfo(){
        String allInfo="name:"+"["+this.name+"]"+"color:"+"["+this.color+"]"+"brand:"+"["+this.brand+"]";
        System.out.println(allInfo);
    }

    public String returnMessage(String title, String message) {
        String mess=title+message;
        return mess;
    }
    public void sentMessageError(){
        System.out.println(" Message cannot be sent");
    }

}
