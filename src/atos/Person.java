package atos;

// 1. Création de la class person
public class Person {
	private String name ;
    private int age;
    private double salary;
    
 // 2. Création de constructeur  sans argument
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 3. Création de constructeur  avec argument

	public Person(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	//4.Création de constructeur qui prendra deux arguments age et nom
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary = -1;
	}
	
	//5. Création de méthode
	public String displayInfo(){
		return " name = " + name+ " age = " + age + " salary = " +salary;
	}
	
	
	//6. Création des objets

	public static void main(String[] args) {  
      
		Person person1 = new Person();
		Person person2 = new Person("Emmanuelle", 7, 200);
		
		//7. affichage des objets
		
		System.out.println(person1.displayInfo());
		System.out.println(person2.displayInfo());
		
		//8. affichage de l'objet avec deux paramètre
		
		
		Person person3 = new Person("Princesse", 8);
		if(person3.salary == -1) {
			System.out.println("Salaire non fourni");
		}
		
	}
	

	
	
	

}
