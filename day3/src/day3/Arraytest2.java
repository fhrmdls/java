package day3;

public class Arraytest2 {

	public static void main(String[] args) {
		
		String[] names = new String[5];
		names[0] = "��ƹ���";
		names[1] = "��ƹ�";
		names[2] = "���";
		names[3] = "��";
		names[4] = "�蹫��";
		
		//�迭�� �ݺ����� ���� ��� 
		//length ������ �˰������
		
		System.out.println(names.length);
		System.out.println(names[names.length-1]);
		
		//�÷� 3�� => double 
		//ù��° �÷°� ������ �÷� ����Ʈ 
		
		double[] eye = new double[3];
		eye[0] = 0.1;
		eye[1] = 1.1;
		eye[2] = 1.5;
		
		System.out.println(eye[0]);
		System.out.println(eye[2]);
		
		
		
	}

}
