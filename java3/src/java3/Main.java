package java3;

public class Main {

	
		public static void main(String[] args) {
		
			String [] names = {"igor", "ira", "vika", "john"};
			
			for(int i = 0; i < names.length; i++){
				System.out.println(names[i]);
			}
			System.out.println();
			for(String n : names){
				
				System.out.println(n);
				
			}
			
			System.out.println("master");
			
			System.out.println("from git");
			
		}

	}
