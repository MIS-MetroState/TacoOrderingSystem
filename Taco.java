import java.lang.reflect.Array;

public class Taco {

    //Attributes (variables that describe a taco)
    String fillingType;

    boolean spicy;
    double price;

    //Constructor method - makes a new taco
    public Taco() {

    }//end constructor method

    //Constructor method - makes a new taco and
    // populates the price of the taco
    public Taco(double price) {
        setPrice(price);
    } //end constructor method

    //Constructor method - makes a new taco and
    // populates the attributes of the taco
    public Taco(String fillingType, boolean spicy, double price) {
        setFillingType(fillingType);
        setSpicy(spicy);
        setPrice(price);
    } //end constructor method

    //Getters and setters for Taco attributes
    public String getFillingType() {
        return fillingType;
    }

    public void setFillingType(String fillingType) {
        this.fillingType = fillingType;
    }

    //Getter method (accessor method) that returns a value
    //that indicates if the taco is spicy
    //For booleans we use is instead of get
    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


} //end class
