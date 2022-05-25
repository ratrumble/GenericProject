public class Six <T>{
    
    private T t;
    
    public void setT(T t){
        this.t = t;
    }
    
    public T getT(){
        return t;
    }
    
    public static <T extends Number> void doSomething(Six<T> eric){
        System.out.println("the number is " + eric.getT());
    }
    
    public static void main(String args[]){
        Six<Integer> number = new Six<Integer>();
        number.setT(5);
        Six.doSomething(number);
        
        Six<Double> number1 = new Six<Double>();
        number1.setT(5.0);
        Six.doSomething(number1);
        
        Six<String> string = new Six<String>();
        string.setT("fart");
        //Six.doSomething(string);
    }
}
