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
		} catch(Exception e) {
			System.out.println("Error command.");
		}
	}

	private static void doCommand(String command) {
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
				break;
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
				break;
			}
			break;
		case 3:
			
			if (cmd[1].charAt(0) == 'A') {
				operand1 = a;
			} else if (cmd[1].charAt(0) == 'B') {
				operand1 = b;
			}
			
			if (cmd[2].charAt(0) == 'A') {
				operand2 = a;
			} else if (cmd[2].charAt(0) == 'B') {
				operand2 = b;
			}
			
			result = operand1+operand2;
			if (cmd[1].charAt(0) == 'A') {
				a = result;
			} else if (cmd[1].charAt(0) == 'B') {
				b = result;
			}
			
			break;
		case 4:
			
			if (cmd[1].charAt(0) == 'A') {
				operand1 = a;
			} else if (cmd[1].charAt(0) == 'B') {
				operand1 = b;
			}
			
			if (cmd[2].charAt(0) == 'A') {
				operand2 = a;
			} else if (cmd[2].charAt(0) == 'B') {
				operand2 = b;
			}
			
			result = operand1*operand2;
			if (cmd[1].charAt(0) == 'A') {
				a = result;
			} else if (cmd[1].charAt(0) == 'B') {
				b = result;
			}
			break;
		case 5:
			if (cmd[1].charAt(0) == 'A') {
				operand1 = a;
			} else if (cmd[1].charAt(0) == 'B') {
				operand1 = b;
			}
			
			if (cmd[2].charAt(0) == 'A') {
				operand2 = a;
			} else if (cmd[2].charAt(0) == 'B') {
				operand2 = b;
			}
			
			result = operand1-operand2;
			if (cmd[1].charAt(0) == 'A') {
				a = result;
			} else if (cmd[1].charAt(0) == 'B') {
				b = result;
			}
			break;
		case 6:
			if (cmd[1].charAt(0) == 'A') {
				operand1 = a;
			} else if (cmd[1].charAt(0) == 'B') {
				operand1 = b;
			}
			
			if (cmd[2].charAt(0) == 'A') {
				operand2 = a;
			} else if (cmd[2].charAt(op) == 'B') {
				operand2 = b;
			}
			
			result = operand1/operand2;
			if (cmd[1].charAt(0) == 'A') {
				a = result;
			} else if (cmd[1].charAt(0) == 'B') {
				b = result;
			}
			break;
		case 7:
			break;
		default:
			break;
		}
		
	}

}
