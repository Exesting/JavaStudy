import java.util.Scanner;

public class MobilePhone {
	public static Scanner scanner = new Scanner(System.in);
	private final int maxBattery = 100;
	private static int totalPhones = 0;
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;

	public MobilePhone() {
		this("brand", "model", 512, 42, true);
	}

	public MobilePhone(String brand, String model, int storageGB) {
		this(brand, model, storageGB, 87, false);
	}

	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
		this.brand = brand;
		this.model = model;
		this.storageGB = storageGB;
		this.batteryLevel = batteryLevel;
		this.isPoweredOn = isPoweredOn;
		totalPhones++;
	}

	public String displayInfoFirst() {
		System.out.println("==ИНФОРМАЦИЯ О ТЕЛЕФОНЕ==");
		return brand + "\n" + model + "\n" + storageGB + "\n" + batteryLevel + "\n" + isPoweredOn;
	}

	public String displayInfo(boolean showPowerStatus) {
		if (showPowerStatus == true) {
			System.out.println("==ИНФОРМАЦИЯ О ТЕЛЕФОНЕ==");
			return brand + "\n" + model + "\n" + storageGB + "\n" + batteryLevel + "\n" + isPoweredOn;
		} else if (showPowerStatus == false) {
			System.out.println("==ИНФОРМАЦИЯ О ТЕЛЕФОНЕ==");
			return brand + "\n" + model + "\n" + storageGB;
		}
	}

	public String displayTechSupport() {
		return "==ИНФОРМАЦИЯ О ТЕХПОДДЕРЖКЕ==" + "\n" + "TG: @anna_budrevich";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public void setStorageGB(int storageGB) {
		while (storageGB < 0) {
			System.out.println("Неправильная память");
			storageGB = scanner.nextInt();
		}
		this.storageGB = storageGB;
	}

	public void setPower(boolean isPoweredOn) {
		this.isPoweredOn = isPoweredOn;
	}

	public void setChargeBattery(int percent, int minutes) {
		while ((batteryLevel + percent) > 100) {
			System.out.println("Неправильный заряд");
			percent = scanner.nextInt();
		}
		batteryLevel += percent;
		System.out.println("Телефон будет заряжаться: " + minutes + " минут");
	}

	public void setUseBattery(int percent, String appName) {
		while ((batteryLevel - percent) < 0) {
			System.out.println("Неправильный заряд");
			percent = scanner.nextInt();
		}
		batteryLevel -= percent;
		System.out.println("Приложение, использовающее заряд: " + appName);
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getStorageGB() {
		return storageGB;
	}
			
	public boolean getPower() {
		return isPoweredOn;
	}

	public int getChargeBattery() {
		return batteryLevel;
	}
	public int getUseBattery() {
		return batteryLevel;
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}
}