import java.util.*;
public class App {
	public static void main(String[] args){
		//Scanner
		Scanner sc = new Scanner(System.in);
		//UI
		try {
			//mode of sieve
			System.out.println("Choose mode of program: ");
			System.out.println("1. you choose how many prime numbers should be displayed");
			System.out.println("2. you choose to what numbers prime numbers should be displayed");
			System.out.println("3. you check if the number you enter is the first number");
			System.out.print("Your choose mode of program: ");
			int mode = Integer.parseInt(sc.nextLine());
			//Main Switch
			switch(mode){
				case 1:
					first();
					break;
				case 2:
					second();
					break;
				case 3:
					third();
					break;
				default:
					System.out.println("Error: Enter Mode!");
			}
		} catch (Exception e){
			System.out.println("Error: Enter Mode!");
		}
	}
	// --- Modes ---
	//First Mode
	public static void first(){
		//Scanner
		Scanner sc1 = new Scanner(System.in);
		Array arr = new Array();
		//UI
		try {
			System.out.print("Enter how many prime numbers should be displayed: ");
			int howMuch = Integer.parseInt(sc1.nextLine());
			int count = 0;
			int i = 2;
			//Algorithm
			do{
				//Check ban
				if(arr.isBan(i) == false){
					arr.poz.add(i);
					//ban multi
					for(int n=0; n<howMuch; n++){
						arr.ban.add(i*n);
					}
					count++;
				}
				i++;
			} while(count != howMuch);
			System.out.println(howMuch + " first numbers are: ");
			for(int m=0; m<arr.poz.size(); m++){
				System.out.print(arr.poz.get(m));
				if(arr.poz.size()-1 != m){
					System.out.print(", ");
				}
			}
		} catch (Exception e){
			System.out.println("Error: Enter number!");
		}
	}
	//Second Mode
	public static void second(){
		//Scanner and Array
		Scanner sc2 = new Scanner(System.in);
		Array arr = new Array();
		//UI
		try {
			System.out.print("Enter to what numbers prime numbers should be displayed:");
			int num = Integer.parseInt(sc2.nextLine());
			for(int i=2; i<num; i++){
				//Check ban
				if(arr.isBan(i) == false){
					arr.poz.add(i);
					//ban multi
					for(int n=0; n<num; n++){
						arr.ban.add(i*n);
					}
				}
			}
			System.out.print("Prime numbers to " + num + " are: ");
			for(int m=0; m<arr.poz.size(); m++){
				System.out.print(arr.poz.get(m));
				if(arr.poz.size()-1 != m){
					System.out.print(", ");
				}
			}
		} catch (Exception e){
			System.out.println("Error: Enter number!");
		}
	}
	//Third Mode
	public static void third(){
		//Scanner
		Scanner sc3 = new Scanner(System.in);
		Array arr = new Array();
		//UI
		try {
			System.out.print("Enter number to check is it prime number: ");
			int num = Integer.parseInt(sc3.nextLine());
			for(int i=2; i<=num; i++){
				//Check ban
				if(arr.isBan(i) == false){
					arr.poz.add(i);
					//ban multi
					for(int n=0; n<num; n++){
						arr.ban.add(i*n);
					}
				}  
			}
			if(arr.getLast() == num){
				System.out.println(num + " is prime number!");
			} else {
				System.out.println(num + " is not prime number!");
			}
		} catch (Exception e){
			System.out.println("Error!");
		}
	}
}