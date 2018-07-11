package mvcPattern;

public class EmployeeController {
	
	private Employe model;
	private StarView view;
	public Employe getModel() {
		return model;
	}
	public void setModel(Employe model) {
		this.model = model;
	}
	public StarView getView() {
		return view;
	}
	public void setView(StarView view) {
		this.view = view;
	}
	public EmployeeController(Employe model, StarView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void updateView(String viewType){
		view.printEmployee(model);
	}
	

}
