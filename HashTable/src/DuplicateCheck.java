import java.util.HashSet;
import java.util.Set;
public class DuplicateCheck {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> s = new HashSet<>();
        for(Integer i : nums){
            if(s.contains(i)){
                return true;
            }
            // Will only add an entry if the value doesn't exist in the set
            s.add(i);
        }
        return false;
    }
    public static void main(String[] args){
        DuplicateCheck dc = new DuplicateCheck();
        int[] arr = {2, 4, 5, 6, 6};
        System.out.println(dc.containsDuplicate(arr));
    }
}
