import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class takes ordered ArrayList and Writes to txt file
 */
public class SaveList {
    private ArrayList<String> listToSave;

    /**
     * Takes list and uses FileWriter to write each line to txt file
     * @param list List of names to be saved to txt file
     * @throws IOException
     */
    public SaveList(ArrayList list) throws IOException {
        try{
            FileWriter fr = new FileWriter("sorted-names-list.txt");
            for(int i = 0;i < list.size()-1;i++){
                fr.write(list.get(i).toString()+ "\n");
                System.out.println(list.get(i).toString());
            }
            fr.close();
        }catch (IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }

    }
}