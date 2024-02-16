import java.lang.*;
//puts stuff into a panel (what even is a panel? why do we need it)

public class PanelManager {
    DataPanel datapanel = new DataPanel();
    DataTable datatable;

    public PanelManager(String name, int linesOfCode, int local, int global, int interfaces, String parent){};

    public void showTable(Object[][] data){
        String[] columnNames = {"name", "linesOfCode", "local", "global", "interfaces", "parent"};
        DataTable datatable = new DataTable(data, columnNames);
    }

}
