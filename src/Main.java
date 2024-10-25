import java.util.*;
import java.io.*;

class Test{
    private int _x;
    public Test(){}
    public Test (int x){
        _x = x;
    }
    public int getX(){
        return _x;
    }
    public void setX(int x ){
        _x = x;
    }

}
class Test2{
    private int _y;
    public Test2(){}
    public Test2 (int y){
        _y = y;
    }
    public int getY(){
        return _y;
    }
    public void setY(int y ){
        _y = y;
    }
}
class Stuff<T>{
    private T _thing;
    public Stuff(){
        _thing = null;
    }
    public Stuff(T t){
        _thing = t;
    }
    public T getThing(){
        return _thing;
    }
    public void setThing(T t){
        _thing = t;
    }
    public void print() {
        if (_thing != null) {
            System.out.println("Type: " + _thing.getClass().getName() +
                    ", value: " + _thing);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Stuff<Test> s = new Stuff<>();
        s.setThing(new Test(5));
        s.print();
        System.out.println(s.getThing().getX());
    }
}
