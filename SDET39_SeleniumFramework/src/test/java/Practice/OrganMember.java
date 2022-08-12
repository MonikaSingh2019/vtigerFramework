package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OrganMember {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        FileInputStream fis = new FileInputStream("./Data/Book1.xlsx");
        Properties p = new Properties();
        p.load(fis);
	}

}
