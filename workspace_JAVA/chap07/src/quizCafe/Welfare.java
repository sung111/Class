package quizCafe;

public class Welfare {

	void pay(Staff e) {
		System.out.println("¿ù±Þ ÁÜ");
		if (e instanceof Baristar) {
			Baristar baristar = (Baristar) e;
			baristar.pay();
		} else if (e instanceof Bread) {
			Bread bread = (Bread) e;
			bread.pay();
		} else if (e instanceof HallStaff) {
			HallStaff h = (HallStaff) e;
			h.pay();
		} else {
			System.out.println("¤µ¤¡");
		}
	}

	void study(Staff e) {
		System.out.println("°øºÎ ½ÃÄÑÁÜ");
		if (e instanceof Baristar) {
			Baristar baristar = (Baristar) e;
			baristar.study();
		} else if (e instanceof Bread) {
			Bread bread = (Bread) e;
			bread.study();
		} else if (e instanceof HallStaff) {
			HallStaff h = (HallStaff) e;
			h.study();
		} else {
			System.out.println("¤µ¤¡");
		}
	}

}
