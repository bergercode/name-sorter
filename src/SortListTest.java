import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class SortListTest {

    @Test
    void isListSorted(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("John Smith");
        list.add("Daniel Berger");
        list.add("Rick James");
        list.add("Susan Smooth");
        list.add("Amanda Huginkis");
        Assertions.assertNotEquals(list.get(0), "Daniel Berger");
        Assertions.assertEquals(list.get(list.size()-1), "Amanda Huginkis");
        SortList sorted = new SortList(list);
        ArrayList<String> sortedList = new ArrayList<>();
        sortedList = sorted.returnSorted();
        Assertions.assertEquals(sortedList.get(0),"Daniel Berger");
        Assertions.assertEquals(sortedList.get(sortedList.size()-1), "Susan Smooth");
        Assertions.assertNotEquals(sortedList.get(0), "Rick James");
    }
}