public class Jah {
	
	public static void main(String args[]) {
		marihuana m = new marihuana(); // �� ��� ��� � ���� �� Reader ���, ��� ���������� ���� ������ ���� marihuana  
		m.Scan(); 
		m.i = count(m.i); // �������� ������ � ����� ������ �����������, �������� ������������. ������� ������ ����� �����, ���� m.getI()

		if (m.i == 2) { // ���� ���� = - ��� ������������, � ��� - ��� �������� �� ���������
			System.out.println("����� �� �������, �� ������ ����������!");
		} else if (m.i == 1) { // ����� ������������ ��� ����������� "else if"
			System.out.println("� � ���� ����, ����� �� �������, �� ������ ����������!");
		} else {
			System.out.println("�� �� ��������?");
		}
		// � ����� ���, ����������� ��� ��������, ���� ������ ���� ������ ;)
	}
	
	private static int count(int x) {
		x = x + 1;
		return x;
	}
}
