import java.lang.*;

public class PanelManager {
    DataPanel datapanel = new DataPanel();
    DataTable datatable;

    public PanelManager(){};

    public void showTable(Object[][] data){
        String[] columnNames = {"name", "linesOfCode", "local", "global", "interfaces", "parent"};
        DataTable datatable = new DataTable(data, columnNames);

    }

}
