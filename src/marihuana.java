import java.util.Scanner;

public class marihuana { // Классы принято писать с большой буквы
	
	int i;
	
	public void Scan() { // имя методов в Java принято писать с маленькой буквы, т.е. m.scan(), но это не ошибка, так, рекомендация   
		System.out.println("Макс, есть дед? Если да жми - 1 если нет - 0");
		Scanner scn = new Scanner(System.in);
		i = scn.nextInt();
	}

}
