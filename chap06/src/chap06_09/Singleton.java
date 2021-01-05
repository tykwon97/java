package chap06_09;
/*
 * 싱글 톤 ------------> 아직 이해 못함
 */
public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance()
	{
		return singleton;
	}
}
