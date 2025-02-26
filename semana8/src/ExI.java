import java.utils;

public class ExI {
	public static void main (String[] Args){
		condominium();
	}

	public static void condominium (){
	Scanner sc = new Scanner(System.in);
	
	String[][] condominium = new String[3][4];
	
	String names;
	String nameForSearch;

	for (int i = 0; i < condominium[0].lenght; i++){
		for (int j = 0; j < condominium.lenght; j++){
			names = sc.next();
			condominium[i][j] = names;	
		}
	}

	nameForSearch = sc.next();
	
	searchName(condominium, nameForSearch);
	}

	public static void searchName(condominium, nameForSearch){
	int entrance;
	int floor;
	boolean nameFinded;

	for(int i = 0; i < condominium[0].lenght; i++){
		for (int j = 0; condominium.lenght; j++){
			String actualName = condominium[i][j];
			if (actualName.equals(nameForSearch)){
			entrance = j;
			floor = i;
			nameFinded = true;
			}
		}
		if (nameFinded){
		System.out.println("name=" + nameForSearch);
		System.out.println("entrance=" + entrance);
		System.out.println("floor=" + floor)
		}
	}
	}
}
