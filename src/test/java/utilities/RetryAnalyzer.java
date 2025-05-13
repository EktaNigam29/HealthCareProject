package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int count=0;
		int retry_count=0;
		if(count<retry_count)
		{
			count++;
			return true;
		}
		
		
		
		return false;
	}

}
