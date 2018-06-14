import javax.swing.JOptionPane;

public class nocknoc {
	public static void main(String[] args) {
		String sam = JOptionPane.showInputDialog(null, "knock knock");
		if (sam.equals("whos there")) {
			String easy = JOptionPane.showInputDialog(null, "Europe");

			if (easy.equals("europe who")) {
				String yuy = JOptionPane.showInputDialog(null,
						"NO UR A POO!!!!!!!!!!!!!!!!! OH GET ROASTED AHHHHHHHHHHHHH!!!!!!!!");

			} else {
				JOptionPane.showInputDialog(null, "strike 2 yur owt!!!!!");
			}
		} else {
			JOptionPane.showInputDialog(null,
					"Say whos there.. im not going to remind you again and this is a good nocknock joce so show sum respect.");
		}
	}
}
