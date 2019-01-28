/*Java example
  Class that calculates the distance a projectile a will travel, neglecting air resistance
*/

class rangecalc{
	rangecalc(double speed, double angleInDegrees)
	{
		double g, distance;
		g = 9.81;

		assert speed >=0 : " Negative Speed";
		assert angleInDegrees >= 0 : " Negative Angle";

		//Math.sin, and Math.cos expects angle in radians, so we convert in place, and then insert into sin and cos
		distance = 2*speed*speed*Math.sin((PI*angleInDegrees)/180)*Math.cos((PI*angleInDegrees)/180) /g;

		System.out.println("Range, neglecting air resistance, is " + distance + " meters");
	}

	public static void main(String[] arg){
		new rangecalc(20,45);
	}
}
