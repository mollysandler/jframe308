import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataManager  {

    public static boolean checkData(ArrayList<HashMap<String, Integer[]>> array) {
        for (HashMap<String, Integer[]> map : array) {
            for (Map.Entry<String, Integer[]> entry : map.entrySet()) {
                String key = entry.getKey();
                Integer[] values = entry.getValue();

                if (!checkName(key) || !checkValues(values)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkName(String key) {
        // Check if the string is a non-empty value
        return key != null && !key.isEmpty();
    }

    public static boolean checkValues(Integer[] values) {
        // Check if the value for the key is an integer array of length 4
        if (values == null || values.length != 4) {
            return false;
        }

        // Check if all the values in the array are non-negative
        for (int value : values) {
            if (value < 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<FileClass> convertData(ArrayList<HashMap<String, Integer[]>> array) {
        ArrayList<FileClass> result = new ArrayList<>();
        for (HashMap<String, Integer[]> map : array) {
            for (Map.Entry<String, Integer[]> entry : map.entrySet()) {
                String key = entry.getKey();
                Integer[] values = entry.getValue();

                FileClass fInfo = new FileClass(key, values[0], values[1], values[2], values[3]);
                result.add(fInfo);
            }
        }
        return result;
    }


    //data validation occurs in this class
//    FileClass file;
//
//    public DataManager(FileClass file){
//        this.file = file;
//    }

    public static boolean validateContents(FileClass file) {
        if (file.getName().equals((file.getName().toString()))) {
            if (file.getLinesOfCode() >= 0) {
                if (file.getLocal() >= 0) {
                    if (file.getGlobal() >= 0) {
//                        if (file.getInterfaces() >= 0) {
//                            return file.getParent().equals((file.getName().toString()));
//                        }//end of fifth if
                    }//end of fourth if
                }//end of third if
            }//end of second if
        }//end of first if
        return false;
    }// end of data validation
}
