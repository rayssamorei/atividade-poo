import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
		//Cria uma lista de elementos que só pode conter objetos do tipo Employee ou de uma classe que herda de Employee
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
		//Insira o número de funcionários:
        int n  = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Outsourced (y/n)? ");
			//Terceirizado (s/n)?
			char op = scanner.next().charAt(0);
			System.out.print("Name: ");
			//Nome:
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Hours: ");
			//Horas:
			int hours = scanner.nextInt();
			System.out.print("Value per hour: ");
			//Valor por hora:
			double valuePerHour = scanner.nextDouble();
            if (op == 'y') {
				System.out.print("Additional charge: ");
				//Recebimento adicional:
				double additionalCharge = scanner.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				//Adiciona na lista informações do empregador terceirizado
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
				//Adiciona informações do empregador que não é terceirizado
			}
        }
        
        System.out.println();
		System.out.println("PAYMENTS:");
		//PAGAMENTOS:
		for (Employee i : list) {
			//Percorre os elementos da lista e mostra suas informações de forma formatada
			System.out.println(i.getName() + " - $ " + String.format("%.2f", i.payment()));
		}
		
		scanner.close();
    }
}
