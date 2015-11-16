
public class Cat {
    //Fields
    public String name;
    public String color;

    //constructors
    public Cat(String name, String color){

        this.name = name;
        this.color = color;
    }

    public Cat(){

        this.name = "Unnamed";
        this.color = "grey";
    }

    //Getter and Setter

    public String getName(){
        return name;
    }
    public String setName(String name){
        return name;
    }

    public String getColor(){
        return color;
    }
    public String setColor(String color){
        return color;
    }

    //Method

    public void sayMiau(){
        System.out.printf("Cat %s said: Miauuuuuuuu!%n", name);
    }
}

