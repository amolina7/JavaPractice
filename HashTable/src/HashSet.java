import java.util.Vector;
public class HashSet {
    Vector<Integer> v_int = new Vector<Integer>(0, 1);
    public HashSet(){
    }
    public void add(int key){
        // Prevents from storing duplicate values
        if(!v_int.contains(key)) {
            v_int.add(key);
        }
        else{}
    }
    public void remove(int key){
        if(v_int.contains(key)){
            v_int.remove(v_int.indexOf(key));
        }
        else{}
    }
    public boolean contains(int key){
        return v_int.contains(key);
    }
    public void printH(){
        for(int i : v_int){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(3);
        System.out.println(h.contains(3));
        h.remove(3);
        System.out.println(h.contains(3));
    }
}


