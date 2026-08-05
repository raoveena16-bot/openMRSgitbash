package testpackage;

public class myPolymorphism {
	public void animalSound () {
		System.out.println("Animal Sound");
	}

}
class dog extends myPolymorphism {
	public void animalsound()  {
		System.out.println("Bark");
	}
}
