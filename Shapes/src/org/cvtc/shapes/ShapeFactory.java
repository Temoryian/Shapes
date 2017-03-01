package org.cvtc.shapes;

public class ShapeFactory {

	private Dialog dialog;
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	private Dialog getDialog() {
		return dialog;
	}
	
	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}

	public Cuboid buildCuboid(float width, float height, float depth) {
		return new Cuboid(getDialog(), width, height, depth);                  
	}
	
	public Cylinder buildCylinder(float radius, float height) {
		return new Cylinder(getDialog(), radius, height);                  
	}
	
	public Sphere buildSphere(float radius) {
		return new Sphere(getDialog(), radius);                  
	}
	
}
	
