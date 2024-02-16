public class DataManager  {



//will return a dataPanel later
    public boolean checkContents(FileClass file){
        if (file.getName().equals( (file.getName().toString()))){
            return true;
        }
        if (file.getLinesOfCode() >= 0) {
            return true;
        }
        if (file.getLocal() >= 0) {
            return true;
        }
        if (file.getGlobal() >= 0) {
            return true;
        }
        if (file.getInterfaces() >= 0 ) {
            return true;
        }
        return file.getParent().equals((file.getName().toString()));

        //if these are all true, create a panel with this info using the panelmanager thing
        //

    }//end of file

}
