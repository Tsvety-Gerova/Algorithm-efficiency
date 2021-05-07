
public class Circle implements Comparable<Circle> {
		 
		@Override
		public int compareTo(Circle arg0) {
			// TODO Auto-generated method stub
			return 0;
		}


		private int radius;
			
			public Circle() {
			}
			
			public Circle(int radius) {
				this.radius = radius;
			}
			
//			public int max (Circle c) {
//				return this.compareTo(c);
//			}
//			
//			public double sumArea (Circle[] c) {
//				for (int i = 0; i < 1000; i ++) {
//					sumArea += area;
//				} 
//				return sumArea;
//			}
//			
//			public Circle(int radius,  String color, boolean filled) {
//				this.radius = radius;
//				setColor(color);
//				setFilled(filled);
//			}

			public double getRadius() {
				return radius;
			}

			public void setRadius(int radius) {
				this.radius = radius;
			}
			
			public double getArea () {
				return (int) (radius * radius * Math.PI);
			}
			
			public double getPerimeter() {
				return 2 * radius * Math.PI;
			}
			
//			public void printCircle () {
//				System.out.println("The circl is created " + getDateCreated() + " and the radius is " + getRadius());
//			}
//			
			
			public String toString () {
				return "Circle " + "\nradius is " + radius;
			}
}
