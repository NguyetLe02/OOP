import javax.swing.JOptionPane;

public class CalTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and " ;
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2 + " \n" ;
		
		Double num1 = Double.parseDouble(strNum1);
		Double num2 = Double.parseDouble(strNum2);
		
		Double sum = num1 + num2;
		strNotification += "Sum : " + sum;
		
		Double difference = Math.abs(num1 - num2);
		strNotification += "\nDifference : " + difference;
		
		Double product = num1 * num2;
		strNotification += "\nProduct : " + product;
		
		if(num2 == 0) {
			strNotification += "\nKhong the chia mot so cho 0!";
		}else {
			Double quotient = num1 / num2;
			strNotification += "\nQuotient : " + quotient;
		}
		
		JOptionPane.showMessageDialog(null, strNotification ,
				"Calculate two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}