package ar.edu.taco.sbp;

public class DataLeftRightTree {

	public static class Data {
		
	}
	public static class Node {
		public /*@ nullable @*/ Node left;
		public /*@ nullable @*/ Node right;
		public /*@ nullable @*/ Data value;
	}
	
	public /*@ nullable @*/ Node root;
	
	//@ ensures \result==true;
	public boolean showInstance() {

		if (this.root==null)
			return true;
		
		if (this.root.left==null)
			return true;
		
		if (this.root.right==null)
			return true;

		if (this.root.value==null)
			return true;
		
		return false;
	}
	
}
