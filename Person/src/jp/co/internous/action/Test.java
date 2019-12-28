package jp.co.internous.action;

public class Test {

	public static void main(String[]args) {
		Person taro=new Person();

		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="080-000-000";
		taro.address="taro.co.jp";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro=new Person();

		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="080-000-000";
		jiro.address="jiro.co.jp";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();

		Person hanako=new Person();

		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-000-000";
		hanako.address="taro.co.jp";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person kengo=new Person();

		kengo.name="中村圭吾";
		kengo.age=26;
		kengo.phoneNumber="080-000-000";
		kengo.address="taro.co.jp";

		System.out.println(kengo.name);
		System.out.println(kengo.age);
		System.out.println(kengo.phoneNumber);
		System.out.println(kengo.address);
		kengo.talk();
		kengo.walk();
		kengo.run();

		Robot aibo=new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
