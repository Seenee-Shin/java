package edu.kh.collection.run;

import edu.kh.collection.model.service.CollectionService;
import edu.kh.collection.model.service.MapService;
import edu.kh.collection.model.service.StudentManagementService;
import edu.kh.collection.model.service.setService;

public class CollectionRun {
public static void main(String [] args) {
	
	CollectionService service = new CollectionService();
	
//	service.example();
//	service.example2();	
//	service.example3();
//	service.example4();
//	service.example4();
	
	StudentManagementService stdService = new StudentManagementService();
//	stdService.displayMenu();
	
	setService sService = new setService();
	
//	sService.example1();
//	sService.example2();
//	sService.example3();
//	sService.example4();
	
	MapService mService = new MapService();
//	mService.example1();
	mService.example2();
}
}
