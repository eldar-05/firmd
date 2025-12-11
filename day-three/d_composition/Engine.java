package d_composition;

public class Engine {
    String type;
    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + type + " engine");
    }
    
    @Override
    public String toString(){
        return type;
    }
}
