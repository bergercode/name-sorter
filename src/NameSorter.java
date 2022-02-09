import java.io.IOException;
import java.util.ArrayList;

/**
 * Class runs Name sorter application which takes a .txt file and orders it alphabetically
 *
 * All code written by Daniel Berger on 09/02/21
 * Any IntelliJ suggestions on use of lambda's etc were ignored
 * Please see Github Repo for any notes
 *
 */
public class NameSorter {
    public static void main(String[] args) throws IOException {
        InputToList input = new InputToList(args[0]);
        ArrayList<String> answer = input.getInputList();
        SortList sorted = new SortList(answer);
        SaveList saveFile = new SaveList(answer);
    }
}
