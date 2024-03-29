import java.util.ArrayList;

public class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();


    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
    }


    public void bake(){
        System.out.println("Baking " + name);
    }

    public void cut(){
        System.out.println("Cutting " + name);
    }

    public void box(){
        System.out.println("Boxing " + name);
    }

    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}

