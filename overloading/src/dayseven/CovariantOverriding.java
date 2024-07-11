package dayseven;
	class Color{
		protected Color getColor() {
			Color s=new Color();
			return s;
		}
	}
	class Red extends Color{
//		@override
		public Red getColor() {
			Red s=new Red();
			return s;
		}
	}
public class CovariantOverriding {
	public static void main(String[] args) {
		Color c1=new Color();
		Color c2=c1.getColor();
		System.out.print(c2);
		Red r1=new Red();
		Red r2=r1.getColor();
		System.out.print(r2);
	}
}
