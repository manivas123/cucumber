package org.repoe;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reportingg {

	public static void generateJvm(String jsonfile) {
		
	File file=new File("C:\\Users\\SCLPT 059\\eclipse-workspace\\OmrBranchBookingAutomation\\target");
	Configuration c=new Configuration(file, "omr branch automation");
	
	c.addClassifications("Browser", "Chromer");
	c.addClassifications("Browser verision", "3445");
	c.addClassifications("Os", "win");
	List<String> json=new ArrayList<String>();
	json.add(jsonfile);
	
	ReportBuilder builder=new ReportBuilder(json, c);
	builder.generateReports();
	
	}
	
}
