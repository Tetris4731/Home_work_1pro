import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> container;

    public Box () {
        this.container = new ArrayList<>();
    }
    public Box(T...fruit){
        this.container = new ArrayList( Arrays.asList(fruit) );
    }

    public float getWeight(){
        float w =0.0f;
        for(T fruit : container){
            w+=fruit.getWeight();
        }
        return w;
    }

    public boolean sameAvg (Box <?> another){
        return Math.abs( this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void transfer (Box <? super T> another){
        if(another == this){
            return;
        }
        another.container.addAll( this.container );
        this.container.clear();
    }

    public void add (T fruit){
        container.add( fruit );
    }

}
