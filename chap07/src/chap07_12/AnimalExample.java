package chap07_12;
/*
 * 실행 클래스
 */
public class AnimalExample {
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();
		System.out.println("------");

		//변수의 자동 타입 변환
		Animal animal = null;
		//자동 타입 변환 -> 재정의된 메소드 호출
		animal = new Dog();
		animal.sound();
		//자동 타입 변환 -> 재정의된 메소드 호출
		animal = new Cat();
		animal.sound();
		System.out.println("------");

		//메소드이 다형성
		animalSound(new Dog()); //자동 타입 변환
		animalSound(new Cat()); //자동 타입 변환 
	}
	public static void animalSound(Animal animal)
	{
		animal.sound(); //재정의된 메소드 호출
	}
}
