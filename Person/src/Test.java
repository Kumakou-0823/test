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
	public static void main(String[] args){
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="090-0000-1234";
		taro.address="taro1234@gmail.com";
		taro.birthplace="栃木県";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(taro.birthplace);
		taro.talk();
		taro.walk();
		taro.run();

		Person ziro = new Person();
		ziro.name="木村次郎";
		ziro.age=18;
		ziro.phoneNumber="022-124-5678";
		ziro.address="ziro9841@yahoo.co.jp";
		ziro.birthplace="宮城県";
		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);
		System.out.println(ziro.birthplace);
		ziro.talk();
		ziro.walk();
		ziro.run();

		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-9876-5432";
		hanako.address="hanako6789@i.softbank.jp";
		hanako.birthplace="岐阜県";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.birthplace);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person kousuke = new Person();
		kousuke.name="熊谷幸亮";
		kousuke.age=24;
		kousuke.phoneNumber="090-4567-8273";
		kousuke.address="kousuke0304@icloud.com";
		kousuke.birthplace="岩手県";
		System.out.println(kousuke.name);
		System.out.println(kousuke.age);
		System.out.println(kousuke.phoneNumber);
		System.out.println(kousuke.address);
		System.out.println(kousuke.birthplace);
		kousuke.talk();
		kousuke.walk();
		kousuke.run();

		Robot aibo = new Robot();
		aibo.name="AIBO";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name="ASIMO";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name="PEPPER";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon = new Robot();
		doraemon.name="ドラえもん";
		System.out.println(doraemon.name);
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
	}








}
