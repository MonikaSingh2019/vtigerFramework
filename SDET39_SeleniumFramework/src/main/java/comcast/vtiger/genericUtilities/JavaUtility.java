package comcast.vtiger.genericUtilities;

import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used for concatenate to Excel data
	 * @author Monika
	 */
	public int getRandomNum()
	{
		Random ran = new Random();
		int RanNum=ran.nextInt();
		return RanNum;
		
	}
	
	
}
