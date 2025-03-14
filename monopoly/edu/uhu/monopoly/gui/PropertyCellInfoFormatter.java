package edu.uhu.monopoly.gui;

import edu.uhu.monopoly.Cell;
import edu.uhu.monopoly.Player;
import edu.uhu.monopoly.PropertyCell;

public class PropertyCellInfoFormatter implements CellInfoFormatter {
    public String format(Cell cell) {
        PropertyCell c = (PropertyCell)cell;
        StringBuffer buf = new StringBuffer();
        Player owner = cell.getProprietary();
        String ownerName = "";
        if(owner != null) {
        	ownerName = owner.getName();
        }
        buf.append("<html><b><font color='")
                .append(c.getColorGroup())
                .append("'>")
                .append(cell.getName())
                .append("</font></b><br>")
                .append("$").append(c.getPrice())
				.append("<br>Owner: ").append(ownerName)
				.append("<br>* ").append(c.getNumHouses())
                .append("</html>");
        return buf.toString();
    }
}
