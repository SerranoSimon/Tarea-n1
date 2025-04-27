import java.util.ArrayList;
public class DepositoGenerico<T> {
    private ArrayList<T> objs;
    public DepositoGenerico(){
        objs=new ArrayList<>();
    }
    public void add (T obj){
        objs.add(obj);
}
    public T get() {
    if (objs.isEmpty()) return null;
    return objs.remove(0);
    }
    public ArrayList<T> getArr(){
        return objs;
    }
}
