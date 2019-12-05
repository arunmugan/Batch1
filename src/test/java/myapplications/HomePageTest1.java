package myapplications;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest1 {
	HomePageObjects1 homepage;
	HomePageObjects1 hp;
	int random= new Random().nextInt(5000);
	String email="tested"+random+"@gmail.com";

		
	public HomePageTest1(){
	hp=new HomePageObjects1();	
	
		}
	
	@Test
	public void Verifysuccess() {
		hp.SetEmail(email);
		Assert.assertTrue(hp.elementFound(hp.arrowbtn()));		
		Assert.assertTrue(hp.elementFound(hp.arrowbtn()));			
	}
	}
	
	

