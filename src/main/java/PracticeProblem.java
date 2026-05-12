import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PracticeProblem {

	public static void main(String args[]) {

	}

}

	class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
	this.name = name;
	this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

	class Parent extends Person {
	private Parent spouse = null;
	private Child[] children = new Child[0];

	public Parent(String name, int age, Parent spouse) {
		super(name, age);
		this.spouse = spouse;
	}

	public Parent(String name, int age) {
		super(name, age);
	}

	public Parent getSpouse() {
		return spouse;
	}
	public void setSpouse(Parent spouse) {
		this.spouse = spouse;
	}
	public Child[] getChildren() {
		return children;
	}
	public void setChildren(Child[] children) {
		this.children = children;
	}
	public void addChild(Child child) {
		children = Arrays.copyOf(children, children.length + 1);
		children[children.length -1] = child;
	}
}
	class Child extends Person {
		private Parent parent1;
		private Parent parent2; 
		private Child[] siblings = new Child[0];
		
		public Child(String name, int age, Parent parent1, Parent parent2) {
			super(name, age);
			this.parent1 = parent1;
			this.parent2 = parent2;
		}
		public Parent getParent1() {
			return parent1;
		}
		public Parent getParent2() {
			return parent2;
		}
		public Child[] getSiblings() {
			return siblings;
		}
		public void setSiblings(Child[] siblings) {
			this.siblings = siblings;
			
		}
		public void addSibling(Child child) {
			siblings = Arrays.copyOf(siblings, siblings.length + 1);
			siblings[siblings.length - 1] = child;
		}
}




