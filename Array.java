import java.util.*;
class Example{
//=========================================================================================================================
	public static String[]phoneNumberArry=new String[0];
	public static String[]nameArray=new String[0];
	public static String[]companyArray=new String[0];
	public static double[]salaryArray=new double[0];
	public static String[]birthdayArray=new String[0];
	public static String[] idArray =new String[0];

//=============================generate id============================================================================================

	public static String  generateid(){
		if (idArray.length==0)
		{
			 return "C0001";
		}
		String id = idArray[idArray.length - 1];
		int number = Integer.parseInt(id.split("C")[1]); //1
		number++;//2
		return String.format("C%04d",number); //printf("",) 
	
	}





//=============================clearConsole============================================================================================
	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
		} catch (final Exception e) {
			e.printStackTrace();
		// Handle any exceptions.
	}
}

//=============================addCountact / ExtendArray============================================================================================

	public static void ExtendArray(){
			
		String[]tempnunber=new String[phoneNumberArry.length+1];
		String[]tempname=new String[nameArray.length+1];
		String[]tempcompany=new String[companyArray.length+1];
		double[]tempsalary=new double[salaryArray.length+1];
		String[]tempbirthday=new String[birthdayArray.length+1];
		
		for (int i = 0; i < phoneNumberArry.length; i++)
		{
			tempnunber[i]=phoneNumberArry[i];
			tempname[i]=nameArray[i];
			tempcompany[i]=companyArray[i];
			tempsalary[i]=salaryArray[i];
			tempbirthday[i]=birthdayArray[i];
		}
		phoneNumberArry=tempnunber;
		nameArray=tempname;
		companyArray=tempcompany;
		salaryArray=tempsalary;
		birthdayArray=tempbirthday;
	}
	
	public static void addCountact(){
		clearConsole();
	L1:	do
		{
			Scanner input=new Scanner (System.in);
			System.out.println("+-------------------------------------+");
			System.out.println("|\t     Add Countact             |");
			System.out.println("+-------------------------------------+");
			System.out.println("");
			
			String id = generateid();
			System.out.println(id + "\n================\n\n");


			
			System.out.print("Enter name : ");
			String name=input.next();
			System.out.println("");
			
			
			System.out.print("Enter phone : ");
			String number=input.next();
			System.out.println("");
			
			System.out.print("Enter Company name : ");
			String compname=input.next();
			System.out.println("");
			
			System.out.print("Enter salary : ");
			double salary=input.nextDouble();
			System.out.println("");
			
			System.out.print("Enter Bith Day : ");
			String birth=input.next();
		
			System.out.println("");
			
			ExtendArray();
	
	/////////////////////////////////////////////////////////////
	
			phoneNumberArry[phoneNumberArry.length-1]=number;
			nameArray[nameArray.length-1]=name;
			companyArray[companyArray.length-1]=compname;
			salaryArray[salaryArray.length-1]=salary;
			birthdayArray[birthdayArray.length-1]=birth;
	
	/////////////////////////////////////////////////////////////
			System.out.println("");
			System.out.println("Contact has been added Succesfully ........... ");
			System.out.println("");
			System.out.print("Do you want to add another contact (Y/N)");
			
			
			
			char ch=input.next().toLowerCase().charAt(0);
			if (ch=='y')
			{
				continue;
			}else{
				break;
			}
			
		} while (true);
		
		clearConsole();
	} 
	
//=====================updateCountact/updatateName/updateCountactNumber/updateCompanyName=================================================================================================
		
	public static void updateSalary(int index){
		clearConsole();
		L1:do
		{
			Scanner input=new Scanner (System.in);
				System.out.println("+-------------------------------------+");
				System.out.println("|\t     Update Salary          |");
				System.out.println("+-------------------------------------+");
				System.out.println("");
			
				System.out.print("Input New  salary - ");
				double name=input.nextDouble();
				System.out.println("");
				
				salaryArray[index]=name;
				System.out.println("");
				
			System.out.println("\t contact has been successfuly...");
				
				System.out.print("Do you want to  another Update salary(Y/N)");
				char ch=input.next().toLowerCase().charAt(0);
				if (ch=='y')
				{
					continue ;
				}else{
					return ;
				}
		} while (true);
		
	}
	public static void updateCompanyName(int index){
		clearConsole();
		L1:do
		{
			Scanner input=new Scanner (System.in);
				System.out.println("+-------------------------------------+");
				System.out.println("|\t     Update Company Name          |");
				System.out.println("+-------------------------------------+");
				System.out.println("");
			
				System.out.print("Input New  Company Name - ");
				String name=input.next();
				System.out.println("");
				
				companyArray[index]=name;
				System.out.println("");
				
				System.out.println("\t contact has been successfuly...");
				
				System.out.print("Do you want to  another Update Company Name(Y/N)");
				char ch=input.next().toLowerCase().charAt(0);
				if (ch=='y')
				{
					continue;
				}else{
					break L1 ;
				}
		} while (true);
		
		
	}
	
	public static void updateCountactNumber(int index){
		
		L1:do
		{
			clearConsole();
			Scanner input=new Scanner(System.in);
			System.out.println("+-------------------------------------+");
			System.out.println("|\t     Update Countac Number          |");
			System.out.println("+-------------------------------------+");
			System.out.println("");
			
			System.out.println("\tUpdate Countac Number");
			System.out.println("==================");
			System.out.println("");
			
			System.out.print("Input New  Countac Number - ");
			String number=input.next();
			System.out.println("");
			
			phoneNumberArry[index]=number;
			System.out.println("");
			System.out.println("\t contact has been successfuly...");
			
			System.out.print("Do you want to search another Update contact(Y/N)");
				char ch=input.next().toLowerCase().charAt(0);
				if (ch=='y')
				{
					continue;
				}else{
					break L1 ;
				}
			
		} while (true);
		
		
	}
	
	public static void updatateName(int index){
		clearConsole();
		Scanner input=new Scanner (System.in);
	L1:do
		{
			clearConsole();
			System.out.println("+-------------------------------------+");
			System.out.println("|\t     Update Name            |");
			System.out.println("+-------------------------------------+");
			System.out.println("");
			
			System.out.println("\tUpdate Name");
			System.out.println("==================");
			System.out.println("");
			
			System.out.print("Input New name - ");
			String name=input.next();
			System.out.println("");
			nameArray[index]=name;
			System.out.println("\tContact has been  sucssfuly .....");
			System.out.println("");
			System.out.print("Do you want to search another contact(Y/N)");
				char ch=input.next().toLowerCase().charAt(0);
				if (ch=='y')
				{
					clearConsole();
					continue;
					
				}else if(ch=='n'){
					break L1;
				}
		} while (true);
		
	}
	
	public static void updateCountact(){
		
		
		{
			clearConsole();
			Scanner input=new Scanner (System.in);
			System.out.println("+-------------------------------------+");
			System.out.println("|\t     Update Countact            |");
			System.out.println("+-------------------------------------+");
			System.out.println("");
			
			System.out.print("Search contact by name or phone number - ");
			String name_phone=input.next();
			System.out.println("");
			
			int index=search(name_phone);
			
			display(index);
			
			System.out.println("");
			System.out.println("What do you want to update ...");
			System.out.println("");
			System.out.println("\t [01]Name");
			System.out.println("");
			System.out.println("\t [02]Phone Number ");
			System.out.println("");
			System.out.println("\t [03]Company Name  ");
			System.out.println("");
			System.out.println("\t [04]Salaty  ");
			System.out.println("");			
			System.out.print("Enter an optoin to countinue -> ");
			int num=input.nextInt();
			if (num==1)
			{
				updatateName(index);
				
			}else if (num==2)
			{
				updateCountactNumber(index);
			}else if (num==3)
			{
				updateCompanyName(index);
			}else if (num==4)
			{
				updateSalary(index);
			}
			
			
		} ;
		
	}

	
//==================================/search=/SearchContact=/display===================================================================================
	
	public static int search(String name){
		for (int i = 0; i < nameArray.length; i++)
		{
			if (nameArray[i].equals(name)||phoneNumberArry[i].equals(name))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void display(int index){
		System.out.println(" \tName : "+nameArray[index]);
		System.out.println("\tPhone Number : "+phoneNumberArry[index]);
		System.out.println("\tCompany Name : "+companyArray[index]);
		System.out.println("\tSalary : "+salaryArray[index]);
		System.out.println("\tB'Day : "+birthdayArray[index]);
				
		
	}
	
	
	public static void SearchContact(){
		clearConsole();
		Scanner input=new Scanner (System.in);
		
		do
		{
			System.out.println("+-------------------------------------+");
			System.out.println("|\t     Search Contact            |");
			System.out.println("+-------------------------------------+");
			System.out.println("");
			
			System.out.print("Search contact by name or phone number - ");
			String name_phone=input.next();
			
			int index=search(name_phone);
			
			if (index==-1)
			{
				System.out.println("No countact fund for "+name_phone);
				System.out.println("");
				System.out.print("Do you want to search another contact(Y/N)");
				char ch=input.next().toLowerCase().charAt(0);
				if (ch=='y')
				{
					continue;
				}else
				{
					break;
				}
			}else
			{
				display(index);
				System.out.println("");
				System.out.print("Do you want to search another contact(Y/N)");
				char ch=input.next().toLowerCase().charAt(0);
				if (ch=='y')
				{
					continue; 
				}else{
					break;
				}
			}
		} while (true);
		clearConsole();
	}
//===========================deleteCountact=/delete=============================================================================================
	
	public static void delete(int index){
		for (int i = index; i < nameArray.length-1; i++)
		{
			nameArray[i]=nameArray[i+1];
		}
		
		String[] newNameArray = new String[nameArray.length - 1];
		
		for (int i = 0; i < newNameArray.length; i++)
		{
			newNameArray[i]=nameArray[i];
		}
		nameArray=newNameArray;
		
	}
	
	public static void deleteCountact(){
		clearConsole();
		Scanner input=new Scanner (System.in );
		
		do
		{
			System.out.println("+-------------------------------------+");
			System.out.println("|\t     DELETE Contacts            |");
			System.out.println("+-------------------------------------+");
			System.out.println("");
			System.out.println("");
			System.out.print("Search contact by name or phone number - ");
			String name_phone=input.next();
			System.out.println("");
			
			int index=search(name_phone);
			display(index);
			System.out.println("");
			
			System.out.println("Do you want to delete this Contact(Y/N)");
			char ch=input.next().toLowerCase().charAt(0);
				if (ch=='y')
				{
					delete(index);
					
					System.out.println("\tCoustomer has been deleted succesfuly ");
			
					System.out.println("");
					System.out.print("Do you want to want to delete anohter contact (Y/N)");
					char ch1=input.next().toLowerCase().charAt(0);
					if (ch1=='y')
					{
						delete(index);

					}else{
						break;
					}
				}
			
			
		} while (true);
		
		
	}

//===============================listContact/==========================================================================================
		//String[]tempnunber=new String[phoneNumberArry.length+1];
		//String[]tempname=new String[nameArray.length];
		//String[]tempcompany=new String[companyArray.length+1];
		//double[]tempsalary=new double[salaryArray.length+1];
		//String[]tempbirthday=new String[birthdayArray.length+1];
		
	public static void sortSalary(){
		Scanner input=new Scanner (System.in);
		clearConsole();
		L1:do
		{
			System.out.println("\t\t+-------------------------------------+");
			System.out.println("\t\t|\t     List Contact by Salary     |");
			System.out.println("\t\t+-------------------------------------+");
			System.out.println("");
			
			for (int i = 0; i < salaryArray.length-1; i++)
			{
				for (int j = 0; j < salaryArray.length-1; j++)
				{
					if (salaryArray[j]>salaryArray[j+1])
					{
						double t=salaryArray[j];
						salaryArray[j]=salaryArray[j+1];
						salaryArray[j+1]=t;
						
						String tname=nameArray[j];
						nameArray[j]=nameArray[j+1];
						nameArray[j+1]=tname;
						
						String tnumber=phoneNumberArry[j];
						phoneNumberArry[j]=phoneNumberArry[j+1];
						phoneNumberArry[j+1]=tnumber;
						
						String tcompany=companyArray[j];
						companyArray[j]=companyArray[j+1];
						companyArray[j+1]=tcompany;
						
						String tbirth=birthdayArray[j];
						birthdayArray[j]=birthdayArray[j+1];
						birthdayArray[j+1]=tbirth;
						
						
					}
				}
				
			}
			
			//System.out.print(Arrays.toString(salaryArray));
			System.out.println("");
			
			
			System.out.println("+-----------------------------------------------------------------------------------+");
            System.out.printf("| %-14s | %-14s | %-14s | %-14s|  %-14s|\n","Name","Phone Number ","Company ","Salary ","Birthday|");
			System.out.println("+-----------------------------------------------------------------------------------+");

            for(int i  = 0; i<nameArray.length; i++){
                System.out.printf("| %-14s | %-14s | %-14s | %-14s|  %-14s|\n",nameArray[i],phoneNumberArry[i],companyArray[i],salaryArray[i],birthdayArray[i]);

		    }
			System.out.println("+-----------------------------------------------------------------------------------+");
			
			System.out.println("");
			
			System.out.print("Do you want to want to go home page  (Y/N)");
			char ch=input.next().toLowerCase().charAt(0);
			if (ch=='y')
			{
				break;
			}else
			{
				continue;
			}
			
		} while (true);
		
		clearConsole();
		
		
	}
	
	
	public static void sortBirth(){
		Scanner input=new Scanner (System.in);
		clearConsole();
		
		
		
		do
		{
			
			
			System.out.println("\t\t+-------------------------------------+");
			System.out.println("\t\t|\t     List Contact by Birthday     |");
			System.out.println("\t\t+-------------------------------------+");
			for (int i = 0; i <  birthdayArray.length-1; i++)
			{
				for (int j = 0; j < birthdayArray.length-1; j++)
				{
					if (birthdayArray[j].compareTo(birthdayArray[j+1])>0)
					{
						String t=birthdayArray[j];
						birthdayArray[j]=birthdayArray[j+1];
						birthdayArray[j+1]=t;
					
					
						double tsal=salaryArray[j];
						salaryArray[j]=salaryArray[j+1];
						salaryArray[j+1]=tsal;
						
						String tname=nameArray[j];
						nameArray[j]=nameArray[j+1];
						nameArray[j+1]=tname;
						
						String tnumber=phoneNumberArry[j];
						phoneNumberArry[j]=phoneNumberArry[j+1];
						phoneNumberArry[j+1]=tnumber;
						
						String tcompany=companyArray[j];
						companyArray[j]=companyArray[j+1];
						companyArray[j+1]=tcompany;
					
					
					}
				}
			}
			
			System.out.println("");
				
						System.out.println("+-----------------------------------------------------------------------------------+");
            System.out.printf("| %-14s | %-14s | %-14s | %-14s|  %-14s|\n","Name","Phone Number ","Company ","Salary ","Birthday|");
			System.out.println("+-----------------------------------------------------------------------------------+");

            for(int i  = 0; i<nameArray.length; i++){
                System.out.printf("| %-14s | %-14s | %-14s | %-14s|  %-14s|\n",nameArray[i],phoneNumberArry[i],companyArray[i],salaryArray[i],birthdayArray[i]);

		    }
			System.out.println("+-----------------------------------------------------------------------------------+");
			
			System.out.println("");
			
			System.out.print("Do you want to want to go home page  (Y/N)");
			char ch=input.next().toLowerCase().charAt(0);
			if (ch=='y')
			{
				break;
			}else
			{
				continue;
			}
			
		} while (true);
		
	}
	
	
	
	
	
	
	public static void sortName(){
		Scanner input=new Scanner (System.in);
		clearConsole();
		
		String[]tempnamearry=new String[nameArray.length];
		String[]tempnunberarry=new String[phoneNumberArry.length];
		for (int i = 0; i < nameArray.length; i++)
		{
			tempnamearry[i]=nameArray[i];
			tempnunberarry[i]=phoneNumberArry[i];
		}
		tempnamearry=nameArray;
		tempnunberarry=phoneNumberArry;
		
		
		do
		{
			
			
			System.out.println("\t\t+-------------------------------------+");
			System.out.println("\t\t|\t     List Contact by Name     |");
			System.out.println("\t\t+-------------------------------------+");
			System.out.println("");
			
			for (int i = 0; i < tempnamearry.length-1; i++)
			{
				for (int j = 0; j < tempnamearry.length-1; j++)
				{
					if (tempnamearry[j].compareTo(tempnamearry[j+1]) > 0)
					{
						String t=tempnamearry[j];
						tempnamearry[j]=tempnamearry[j+1];
						tempnamearry[j+1]=t;
					
						String tnumber=phoneNumberArry[j];
						phoneNumberArry[j]=phoneNumberArry[j+1];
						phoneNumberArry[j+1]=tnumber;
						
						String tcompany=companyArray[j];
						companyArray[j]=companyArray[j+1];
						companyArray[j+1]=tcompany;
					
						String birth=birthdayArray[j];
						birthdayArray[j]=birthdayArray[j+1];
						birthdayArray[j+1]=birth;
					
					
						double tsal=salaryArray[j];
						salaryArray[j]=salaryArray[j+1];
						salaryArray[j+1]=tsal;
					
					}
				}	
			}
			
			System.out.println("");
				
			System.out.println("+-----------------------------------------------------------------------------------+");
            System.out.printf("| %-14s | %-14s | %-14s | %-14s|  %-14s|\n","Name","Phone Number ","Company ","Salary ","Birthday|");
			System.out.println("+-----------------------------------------------------------------------------------+");

            for(int i  = 0; i<nameArray.length; i++){
                System.out.printf("| %-14s | %-14s | %-14s | %-14s|  %-14s|\n",tempnamearry[i],tempnunberarry[i],companyArray[i],salaryArray[i],birthdayArray[i]);

		    }
			System.out.println("+-----------------------------------------------------------------------------------+");
			
			System.out.println("");
			
			System.out.print("Do you want to want to go home page  (Y/N)");
			char ch=input.next().toLowerCase().charAt(0);
			if (ch=='y')
			{
				break;
			}else
			{
				continue;
			}
			
		} while (true);
		
	} 
	
	public static void listContact(){
		Scanner input=new Scanner(System.in);
		clearConsole();
		{
			System.out.println("+-------------------------------------+");
			System.out.println("|\t     Sort Contacts            |");
			System.out.println("+-------------------------------------+");
			System.out.println("");
			
			System.out.println("[01]Sorting by Name");
			System.out.println("");
			
			System.out.println("[02]Sorting by Salary");
			System.out.println("");
			
			System.out.println("[03]Sorting by Brithday");
			System.out.println("");
			
			System.out.print("Enter an option Countine -> ");
			char ch=input.next().toLowerCase().charAt(0);
			
			if (ch=='1')
			{
				sortName();
			}else if (ch=='2')
			{
				sortSalary();
			}else if (ch=='3')
			{
				sortBirth();
			}				
		} ;
		
		clearConsole();
	}
//=========================================================================================================================
	public static void Home(){
		clearConsole();
		do{	Scanner input=new Scanner (System.in);
			System.out.println("\t\t/$$$$$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$ ");
			System.out.println("\t\t|_  $$_/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
			System.out.println("\t\t  | $$  | $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
			System.out.println("\t\t  | $$  | $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
			System.out.println("\t\t  | $$  | $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
			System.out.println("\t\t  | $$  | $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
			System.out.println("\t\t/$$$$$$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
			System.out.println("\t\t|______/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/ ");
			System.out.println("\t\t");
			System.out.println("\t\t");
			System.out.println("\t  _____            _             _      ____                        _              ");
			System.out.println("\t / ____|          | |           | |    / __ \\                      (_)");
			System.out.println("\t| |     ___  _ __ | |_ __ _  ___| |_  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __ ");
			System.out.println("\t| |    / _ \\| '_ \\| __/ _` |/ __| __| | |  | | '__/ _` |/ _` | '_ \\| |_  / _ \\ '__|");
			System.out.println("\t| |___| (_) | | | | || (_| | (__| |_  | |__| | | | (_| | (_| | | | | |/ /  __/ |   ");
			System.out.println("\t \\_____\\___/|_| |_|\\__\\__,_|\\___|\\__|  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|  ");
			System.out.println("\t                                                   _/  |                           ");
			System.out.println("\t                                                  |___/       ");
			System.out.println("===================================================================================================");
			System.out.println("\t\t [01] Add Countact");
			System.out.println("\t\t [02] Update Countact");
			System.out.println("\t\t [03] Delete Countact");
			System.out.println("\t\t [04] Search Countact");
			System.out.println("\t\t [05] List Countact");
			System.out.println("\t\t [06] Exit");
			
			System.out.print(" Enter an option to continue -> " );
			int num=input.nextInt();
			
			if (num==1)
			{
				clearConsole();
				addCountact();
				
			}else if (num==2)
			{
				updateCountact();
			}else if (num==3)
			{
				deleteCountact();

			}else if (num==4)
			{
				SearchContact();

			}else if (num==5)
			{
				listContact();
			}
		}while(true);
	}
	public static void main (String args[]){
		Home();
	}
}
