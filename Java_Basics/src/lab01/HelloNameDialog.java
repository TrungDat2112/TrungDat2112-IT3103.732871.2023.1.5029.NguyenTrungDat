package lab01;
import javax.swing.JOptionPane;
public class HelloNameDialog{
	public static void main(String[] args){
		String result;
		result = JOptionPane.showInputDialog("Nguyen Trung Dat - 20215029 - Please enter your name:");
		JOptionPane.showMessageDialog(null,"Toi la Nguyen Trung Dat - 20215029. Hi " + result + "!");
		System.exit(0);}}