/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="080-1234-5678";
		taro.address="abc@eeeee";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person hikaru = new Person();
		hikaru.name="八木輝";
		hikaru.age=25;
		System.out.println(hikaru.name);
		System.out.println(hikaru.age);

		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person hanako = new Person();
		hanako.name="鈴木花子";
	    hanako.age=16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		// TODO 自動生成されたメソッド・スタブ

		Robot aibo = new Robot();
		aibo.name="aibo";
		aibo.talk();
		Robot asimo = new Robot();
		Robot pepper = new Robot();


	}

}