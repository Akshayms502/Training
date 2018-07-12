package serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	
	private List<Service> service;
	public Cache(){
		service=new ArrayList<Service>(); 
	}
	
	public Service getService(String serviceName){
		for(Service services: service){
			if(services.getName().equalsIgnoreCase(serviceName)){
				System.out.println("returning cache service"+serviceName+"object");
				return services;
			}
		}return null;
	}
	
	
	public void addService(Service newServices){
		boolean exists=false;
		
		for(Service services:service){
			if(services.getName().equalsIgnoreCase(newServices.getName())){
				exists=true;
			}
		}
		if(!exists)
			service.add(newServices);
	}
}
