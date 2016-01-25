package lecture_classes;

//klass
public class Frog {

	//instansvariabler
	private int age;
	private String name;
	private int size;
	private final int minAge = 1;
	
	//konstruktor
	public Frog(int age, int size, String name) {
		
		if(this.age > minAge){
		this.age = age;
		} else {
		this.age = minAge;
		}
		
		this.name = name;
		this.size = size;
	}
	//metoder
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getSize(){
		return age;
	}
}
