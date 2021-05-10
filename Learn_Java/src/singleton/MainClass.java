package singleton;

public class MainClass {

	public static void main(String[] args) {
		//AppConfig data=new AppConfig();//not visible as private
		AppConfig obj=AppConfig.getInstance();
		obj.work();
	}

}
