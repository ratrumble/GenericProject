public class Seven<T>
{
    private T t;
    
    public void setT(T t){
        this.t = t;
    }
    
    public T getT(){
        return t;
    }
    
    public static void main(String args[]){
        Seven<Integer> intega = new Seven<Integer>();
        intega.setT(5);
        Seven<Number> numba = new Seven<Number>();
        numba.setT(5);
        //numba = intega;
    }
}