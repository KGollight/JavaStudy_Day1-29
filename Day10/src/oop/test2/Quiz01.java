package oop.test2;

public class Quiz01 {

	public static void main(String[] args) {
		// ������ ����
		WorldCup fra = new WorldCup();
		WorldCup cro = new WorldCup();
		WorldCup bel = new WorldCup();
		WorldCup eng = new WorldCup();
		
		fra.grade = 1;
		fra.nation = "������";
		fra.region = "����";
		fra.name = "�׸��";
		
		cro.grade = 2;
		cro.nation = "ũ�ξ�Ƽ��";
		cro.region = "����";
		cro.name = "��帮ġ";
		
		bel.grade = 3;
		bel.nation = "���⿡";
		bel.region = "����";
		bel.name = "���������";
		
		eng.grade = 4;
		eng.nation = "�ױ۷���";
		eng.region = "����";
		eng.name = "�ظ�ĳ��";
		
		System.out.println("����\t"+"�̸�\t"+"����\t"+"��ǥ����\t");
		System.out.println(fra.grade+"\t"+fra.nation+"\t"+fra.region+"\t"+fra.name);
		System.out.println(cro.grade+"\t"+cro.nation+"\t"+cro.region+"\t"+cro.name);
		System.out.println(bel.grade+"\t"+bel.nation+"\t"+bel.region+"\t"+bel.name);
		System.out.println(eng.grade+"\t"+eng.nation+"\t"+eng.region+"\t"+eng.name);
	}

}
