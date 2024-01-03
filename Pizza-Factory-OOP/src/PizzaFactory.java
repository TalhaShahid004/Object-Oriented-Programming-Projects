public class PizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}

