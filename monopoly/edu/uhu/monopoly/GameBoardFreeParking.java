
package edu.uhu.monopoly;

public class GameBoardFreeParking extends GameBoard {
	public GameBoardFreeParking() {
		super();
		JailCell jail = new JailCell();
		Cell freeParking = new FreeParkingCell();
		GoToJailCell goToJail = new GoToJailCell();
		addCell(jail);
		addCell(freeParking);
		addCell(goToJail);

	}
}
