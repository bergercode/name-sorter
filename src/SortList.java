import java.util.*;

/**
 * Class takes list and orders it based on last name on line
 */
public class SortList {

    private ArrayList<String> orderedList;

    /**
     * The constructor takes input List and sorts it based on Last/Family name
     * @param inputList
     */
    public SortList(ArrayList<String> inputList){
        this.orderedList = inputList;
        orderedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] higher = o1.split("\\s+");
                String[] lower = o2.split("\\s+");
                return higher[higher.length - 1].compareTo(lower[lower.length - 1]);
            }
        });
    }

    /**
     * Returns the list of sorted names
     * @return Arraylist of sorted names
     */
    public ArrayList returnSorted(){
        return this.orderedList;
    }

}