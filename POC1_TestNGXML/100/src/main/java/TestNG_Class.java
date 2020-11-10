import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import commonutility.CommonPage;

public class TestNG_Class extends CommonPage {

@BeforeClass
@Parameters ({"waitTime"})

public void instantiateVariables(String waitTime){
CommonPage.loadXMLParameterToTestData("waitTime", waitTime);
}

	 
	@Test(alwaysRun = true)
	
	public void sampleTest() 
	{
	System.out.println("data is  " + CommonPage.getTestData("waitTime"));	
	}
	
}
