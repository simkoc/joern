package inputModules.csv.csv2ast;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import inputModules.csv.KeyedCSV.KeyedCSVRow;

public class CSVAST
{

	List<KeyedCSVRow> nodeRows = new LinkedList<KeyedCSVRow>();
	List<KeyedCSVRow> edgeRows = new LinkedList<KeyedCSVRow>();

	public void addNodeRow(KeyedCSVRow row)
	{
		this.nodeRows.add(row);
	}

	public void addEdgeRow(KeyedCSVRow row)
	{
		this.edgeRows.add(row);
	}

	public Iterator<KeyedCSVRow> nodeIterator() {
		return this.nodeRows.iterator();
	}

	public Iterator<KeyedCSVRow> edgeIterator() {
		return this.edgeRows.iterator();
	}

	public int getNumberOfNodes()
	{
		return this.nodeRows.size();
	}

	public int getNumberOfEdges()
	{
		return this.edgeRows.size();
	}

    public String toString() {
        String ret = "";
        for(KeyedCSVRow elem : nodeRows) {
            ret += elem.toString();
            ret += "\n";
        }
        ret += "\n";
        for(KeyedCSVRow elem : edgeRows) {
            ret += elem.toString();
            ret += "\n";
        }
        return ret;
    }

}
