package orange;

import org.testng.annotations.Test;

public class Pim extends Orange
{
	@Test()
	public void employee()
	{	
		Pom_class p=new Pom_class(driver);
		
		p.pim().click();
		p.add().click();
		p.fname().sendKeys(Ddt.read_ddt("employee", 0, 1));
		p.save().click();
		p.employeelist().click();
		p.ename().sendKeys(Ddt.read_ddt("employee", 1, 1));
		p.search().click();
		p.delete().click();
		p.yes_delete().click();
	}
}
