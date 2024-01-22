package athelete;

import java.util.ArrayList;

public class AtheleteHeightWeight {

	double EligibleAthelete(ArrayList<Athelete> list) {

		for (int i = 0; i < list.size(); i++) {
			Athelete athelete = list.get(i);
			if (athelete.height >= 175) {
				if (athelete.weight >= 70) {
					System.out.println(
							"You Are Eligible Athelete for competition: " + athelete.Player_id + " " + athelete.name);
				}
			}
		}
		return 0;
	}

}
