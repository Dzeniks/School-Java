public abstract class Shape{

    protected String color;

    public Shape(String color){
        this.color = color;
    }

    abstract public Double circumference();

    abstract public Double area();

    
}