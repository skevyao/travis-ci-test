package convolute;

import classes.Pair;
import java.util.ArrayList;
import java.util.List;

public class Convolute {
	public static <T> List<Pair<T, T>> convolute(List<T> l1, List<T> l2) throws IllegalArgumentException {
		if (l1.size() != l2.size()) {
			throw new IllegalArgumentException("List lengths do not match!");
		}
		List<Pair<T, T>> retList = new ArrayList<>();
		
		if (l1.size() > 1) {
			retList = convolute(l1.subList(0, (l1.size() - 1)), l2.subList(1, l2.size()));
		}
		
		retList.add(new Pair<T, T>(l1.get(l1.size() - 1), l2.get(0)));
		return retList;
	}
}
