public class Jah {
	
	public static void main(String args[]) {
		marihuana m = new marihuana(); // хз что это у тебя за Reader был, тип переменной тоже должен быть marihuana  
		m.Scan(); 
		m.i = count(m.i); // напрямую доступ к полям класса нежелателен, нарушает инкапсуляцию. принято делать через метод, типа m.getI()

		if (m.i == 2) { // один знак = - это присваивание, а два - это проверка на равенство
			System.out.println("Давай не палимся, по тихому навалямися!");
		} else if (m.i == 1) { // можно использовать тут конструкцию "else if"
			System.out.println("А у меня есть, давай не палимся, по тихому навалямися!");
		} else {
			System.out.println("Че ты палишься?");
		}
		// и давай это, красивенько код оформляй, чтоб удобно было читать ;)
	}
	
	private static int count(int x) {
		x = x + 1;
		return x;
	}
}
