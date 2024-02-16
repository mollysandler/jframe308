public class DataManager  {
    //data validation occurs in this class
    FileClass file;

    public DataManager(FileClass file){
        this.file = file;
    }

    public boolean validateContents(FileClass file) {
        if (file.getName().equals((file.getName().toString()))) {
            if (file.getLinesOfCode() >= 0) {
                if (file.getLocal() >= 0) {
                    if (file.getGlobal() >= 0) {
                        if (file.getInterfaces() >= 0) {
                            return file.getParent().equals((file.getName().toString()));
                        }//end of fifth if
                    }//end of fourth if
                }//end of third if
            }//end of second if
        }//end of first if
        return false;
    }// end of data validation

    public DataPanel createPanel(FileClass file){
        PanelManager dp = new PanelManager(file.getName(), file.getLinesOfCode(),
                file.getLocal(), file.getGlobal(), file.getInterfaces(), file.getParent());


        //if these are all true, create a panel with this info using the panelmanager thing
    }//end of datapanel maker

}
