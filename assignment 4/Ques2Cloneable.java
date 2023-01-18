class copy {
	int x, y;
	copy()
	{
		x = 15;
		y = 20;
	}
}

// Driver Class
class Ques2Cloneable {
	public static void main(String[] args)
	{
		copy ob1 = new copy();

		System.out.println(ob1.x + " " + ob1.y);

		copy ob2 = ob1;

		ob2.x = 100;

		System.out.println(ob1.x + " " + ob1.y);
		System.out.println(ob2.x + " " + ob2.y);
	}
}

