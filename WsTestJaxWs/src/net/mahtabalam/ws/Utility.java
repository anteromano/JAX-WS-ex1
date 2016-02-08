package net.mahtabalam.ws;

import java.util.HashMap;
import java.util.Map;

public class Utility {

	Map<String, State> stateMap;

	Utility() {
		stateMap = new HashMap<String, State>();
	}

	void loadData() {

		State rajasthan = new State("Rajasthan", "Jaipur", 33, "Hindi, Rajasthani", "Jaipur, Jodhpur, Udaipur",
				"Ajmer, Udaipur, Jaipur", "Rajasthan is famous for its marbles");
		State punjab = new State("Punjab", "Chandigarh", 22, "Hindi, Punjabi", "Amritsar", "Amritsar, Ludhiana",
				"Punjab is popular for its joyful punjabi people");
		State mp = new State("Madhya Pradesh", "Bhopal", 51, "Hindi", "Bhopal, Gwalior", "Bhopal, Gwalior",
				"Madhya Pradesh is well known for its wildlife and monuments");
		State haryana = new State("Haryana", "Chandigarh", 21, "Hindi, Haryanvi", "", "Hisar, Rohtak, Fridabad",
				"Haryana is popular for its haryanvi language");
		State gujrat = new State("Gujrat", "Gandhinagar", 33, "Hindi, Gujrati", "Ahmedabad, Vadodara, Gandhinagar",
				"Ahmedabad, Vadodara", "Gujrat is famous for its rich culture and dandiya nights");

		stateMap.put("Rajasthan", rajasthan);
		stateMap.put("Punjab", punjab);
		stateMap.put("Madhya Pradesh", mp);
		stateMap.put("Haryana", haryana);
		stateMap.put("Gujrat", gujrat);

	}

	State getState(String stateName) throws MyException {
		State state = null;
		state = stateMap.get(stateName);
		if (state == null) {
			throw new MyException(MyException.COUNTRY_NOT_FOUND);
		}
		return state;
	}

	State replaceState(String stateName, State state) {
		stateMap.remove(stateName);
		stateMap.put(stateName, state);
		return state;
	}

}
