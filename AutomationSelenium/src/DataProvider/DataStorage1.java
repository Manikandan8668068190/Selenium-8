package DataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage1 {
	@DataProvider
	public String[][] registerData() {
		String[][] data= {
				{"virat","kohli","virat1234@gamil.com","virate@18","virate@18"},
				{"rohit","shrama","rohit12345@gmail","rohit@12","rohit@12"},
				{"Sachin","tendulkar","sachin12345@gmail","sachin@17","sachin@17"},
				{"ABD","villers","ABD360@gmail","villers@17","villers@17"},
				{"shain","warn","warn12345@gmail","warn@17","warn@17"}
		};
		return data;
	}
}
