import java.io.*;
import java.util.*;

/**
 * Class takes filename.txt String and reads it to Arraylist
 */
public class InputToList {

    private ArrayList<String> inputList;

    /**
     * Takes input file and turns this into Arraylist
     * @param filename
     * @throws FileNotFoundException
     */
    public InputToList(String filename) throws FileNotFoundException {
        this.inputList = readFile(filename);
    }

    /**
     * returns the Input list read from the read file
     * @return input ArrayList read from file
     */
    public ArrayList<String> getInputList() {
        return inputList;
    }

    /**
     * Reads each line of input file and stores each line as new Arraylist entry
     * @param file
     * @return Arraylist as read from input file
     * @throws FileNotFoundException
     */
    public static ArrayList<String> readFile(String file) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        FileInputStream input = new FileInputStream(file);
        Scanner sc = new Scanner(input);
        while(sc.hasNextLine()){
            list.add(sc.nextLine());
        }
        sc.close();
        return list;
    }
}
