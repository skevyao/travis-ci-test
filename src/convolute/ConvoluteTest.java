package convolute;

import convolute.Convolute;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ConvoluteTest {

	@Test
	public void test() throws Exception {
		List<String> testList1 = Arrays.asList("abc", "def", "ghi", "jkl");
		List<String> testList2 = Arrays.asList("mno", "pqr", "stu", "vwx");
		
		System.out.println(Convolute.convolute(testList1, testList2));
	}

}
