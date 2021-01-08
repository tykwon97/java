package chap07_12;
/*
 * ���� Ŭ����
 */
public class AnimalExample {
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();
		System.out.println("------");

		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		//�ڵ� Ÿ�� ��ȯ -> �����ǵ� �޼ҵ� ȣ��
		animal = new Dog();
		animal.sound();
		//�ڵ� Ÿ�� ��ȯ -> �����ǵ� �޼ҵ� ȣ��
		animal = new Cat();
		animal.sound();
		System.out.println("------");

		//�޼ҵ��� ������
		animalSound(new Dog()); //�ڵ� Ÿ�� ��ȯ
		animalSound(new Cat()); //�ڵ� Ÿ�� ��ȯ 
	}
	public static void animalSound(Animal animal)
	{
		animal.sound(); //�����ǵ� �޼ҵ� ȣ��
	}
}
