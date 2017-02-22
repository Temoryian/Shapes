package org.cvtc.shapes;

//Abstract Shape functionality definition
public abstract class Shape {
	
private Dialog dialog;
	
	protected Dialog getDialog() {
		return dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	//Method to retrieve the surface area of a shape
	public abstract float getSurfaceArea();
	//Method to retrieve the volume of a shape
	public abstract float getVolume();
	
	public Shape(Dialog dialog) {
		setDialog(dialog);
	}
	
}
