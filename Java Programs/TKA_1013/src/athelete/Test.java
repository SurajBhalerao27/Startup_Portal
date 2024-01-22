package athelete;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Athelete athelete1 = new Athelete();
		athelete1.Player_id = 1;
		athelete1.name = "Suraj";
		athelete1.height = 178;
		athelete1.weight = 90;
		Athelete athelete2 = new Athelete();
		athelete2.Player_id = 2;
		athelete2.name = "Rahul";
		athelete2.height = 180;
		athelete2.weight = 70;
		Athelete athelete3 = new Athelete();
		athelete3.Player_id = 3;
		athelete3.name = "Akash";
		athelete3.height = 140;
		athelete3.weight = 75;
		Athelete athelete4 = new Athelete();
		athelete4.Player_id = 4;
		athelete4.name = "Aditya";
		athelete4.height = 188;
		athelete4.weight = 95;
		Athelete athelete5 = new Athelete();
		athelete5.Player_id = 5;
		athelete5.name = "Suhas";
		athelete5.height = 160;
		athelete5.weight = 65;

		ArrayList<Athelete> Athelist = new ArrayList<>();
		Athelist.add(athelete1);
		Athelist.add(athelete2);
		Athelist.add(athelete3);
		Athelist.add(athelete4);
		Athelist.add(athelete5);

		AtheleteHeightWeight ea = new AtheleteHeightWeight();
		double res = ea.EligibleAthelete(Athelist);
		System.out.println(res);
	}

}
