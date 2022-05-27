import java.util.ArrayList;
import java.util.List;

public class GenericsWildCards {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3); ints.add(5); ints.add(10);
        double sum = sum(ints);
        System.out.println("Sum of ints="+sum);
        ///////////////----^^^upperBound code
        
        ///////////////---subtyping with generic wildcards
        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = intList;
        //wildcard parameters CAN be subtyped?
    }

    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;//values inside list don't have to be a Number to work. Can be any child of Number like Integer or Double
        //upperBound is Number, any type below the upperBound can be used
    }
    
    public static void printData(List<?> list){
      for(Object obj : list){
          System.out.print(obj + "::");
      }
  } //unbound wild card, can be anything, upperBound is Object
    
    public static void addIntegers(List<? super Integer> list){
      list.add(new Integer(50));
  }//lowerBound, achieved by using super keyword. Any type above integer can be used
}