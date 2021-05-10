package singleton;

public class AppConfig {
	private AppConfig() {

	}

	private static AppConfig obj = null;// create once ,only one object

	public static AppConfig getInstance() {
		if (obj == null)
			obj = new AppConfig();
		return obj;
	}

	void work() {
		System.out.println("Singleton Worked");
	}
}
