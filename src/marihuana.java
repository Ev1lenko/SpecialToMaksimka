import java.util.Scanner;

public class marihuana { // ������ ������� ������ � ������� �����
	
	int i;
	
	public void Scan() { // ��� ������� � Java ������� ������ � ��������� �����, �.�. m.scan(), �� ��� �� ������, ���, ������������   
		System.out.println("����, ���� ���? ���� �� ��� - 1 ���� ��� - 0");
		Scanner scn = new Scanner(System.in);
		i = scn.nextInt();
	}

}
