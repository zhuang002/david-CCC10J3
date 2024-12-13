import java.util.Scanner;

public class Main {

	static int a = 0;
	static int b = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		try {
			while (!command.trim().equals("7"))  {
				doCommand(command);
				command = sc.nextLine();
			}
		} catch(NumberFormatException e) {
			System.out.println("The value is not a number: "+command );
		} catch(OperationException e) {
			System.out.println("The operation is not from 1 to 7: "+command);
		} catch(OperandException e) {
			System.out.println("The operand is not 'A' or 'B'.");
		} catch(Exception e) {
			System.out.println("Unknow exception!!!");
		}
	}

	private static void doCommand(String command) throws OperandException, OperationException  {
		String[] cmd = command.split(" ");
		int op = Integer.parseInt(cmd[0]);
		int operand1=0, operand2=0, result=0;
		switch (op) {
		case 1:
			int value = Integer.parseInt(cmd[2]);
			/*if (cmd[1].equals("A")) {
				a = value;
			}
			if (cmd[1].equals("B")) {
				b = value;
			}*/
			switch (cmd[1].charAt(0)) {
			case 'A':
				a=value;
				break;
			case 'B':
				b=value;
				break;
			default:
				throw new OperandException();
			}
			break;
		case 2:
			switch (cmd[1].charAt(0)) {
			case 'A':
				System.out.println(a);
				break;
			case 'B':
				System.out.println(b);
				break;
			default:
				throw new OperandException();
			}
			break;
		case 3:
			
			if (cmd[1].charAt(0) == 'A') {
				operand1 = a;
			} else if (cmd[1].charAt(0) == 'B') {
				operand1 = b;
			} else {
				throw new OperandException();
			}
			
			if (cmd[2].charAt(0) == 'A') {
				operand2 = a;
			} else if (cmd[2].charAt(0) == 'B') {
				operand2 = b;
			} else {
				throw new OperandException();
			} 
			
			result = operand1+operand2;
			if (cmd[1].charAt(0) == 'A') {
				a = result;
			} else if (cmd[1].charAt(0) == 'B') {
				b = result;
			} else {
				throw new OperandException();
			}
			
			break;
		case 4:
			
			if (cmd[1].charAt(0) == 'A') {
				operand1 = a;
			} else if (cmd[1].charAt(0) == 'B') {
				operand1 = b;
			} else {
				throw new OperandException();
			}
			
			if (cmd[2].charAt(0) == 'A') {
				operand2 = a;
			} else if (cmd[2].charAt(0) == 'B') {
				operand2 = b;
			} else {
				throw new OperandException();
			}
			
			result = operand1*operand2;
			if (cmd[1].charAt(0) == 'A') {
				a = result;
			} else if (cmd[1].charAt(0) == 'B') {
				b = result;
			} else {
				throw new OperandException();
			}
			break;
		case 5:
			if (cmd[1].charAt(0) == 'A') {
				operand1 = a;
			} else if (cmd[1].charAt(0) == 'B') {
				operand1 = b;
			} else {
				throw new OperandException();
			}
			
			if (cmd[2].charAt(0) == 'A') {
				operand2 = a;
			} else if (cmd[2].charAt(0) == 'B') {
				operand2 = b;
			} else {
				throw new OperandException();
			}
			
			result = operand1-operand2;
			if (cmd[1].charAt(0) == 'A') {
				a = result;
			} else if (cmd[1].charAt(0) == 'B') {
				b = result;
			} else {
				throw new OperandException();
			}
			break;
		case 6:
			if (cmd[1].charAt(0) == 'A') {
				operand1 = a;
			} else if (cmd[1].charAt(0) == 'B') {
				operand1 = b;
			} else {
				throw new OperandException();
			}
			
			if (cmd[2].charAt(0) == 'A') {
				operand2 = a;
			} else if (cmd[2].charAt(op) == 'B') {
				operand2 = b;
			} else {
				throw new OperandException();
			}
			
			result = operand1/operand2;
			if (cmd[1].charAt(0) == 'A') {
				a = result;
			} else if (cmd[1].charAt(0) == 'B') {
				b = result;
			} else {
				throw new OperandException();
			}
			break;
		case 7:
			break;
		default:
			throw new OperationException();
		}
		
	}

}

class OperandException extends Exception {
}

class OperationException extends Exception {
	
}
