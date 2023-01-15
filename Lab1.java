/**
 	* @author Denis Gridusov (368057)
 */
public class Lab1{
	
	// Test version
	public static void main(String[] args){
		// Task 1
		short[] d = new short[7];
		int k = 0;
		for (short i = 3; i <= 15; i+=2){
			d[k] = i;
			k++;
		}
		// Task 2
		float[] x = new float[13];
		for (int i = 0; i < 13; i++) {
			double number = Math.ceil(Math.random() * 10) + Math.random();
			number = number > 9.0 ? 9.0 - Math.random() : number;
			number = number < -7.0 ? -7.0 + Math.random() : number;
			x[i] = (float) (number);
		}
		// Task 3
		double[][] c = new double[7][13];
		for (int i = 0; i < 7; i++){
			for(int j = 0; j < 13; j++){
				if (d[i] == 13){
					c[i][j] = Math.log(Math.pow((2 * 2 * Math.abs(x[j])), 2));
				}
				if ((d[i] == 3) || (d[i] == 9) || (d[i] == 11)){
					c[i][j] = Math.atan(Math.sin(Math.tan(Math.pow(Math.E, x[j]))));
				}
				else{
					c[i][j] = Math.tan(Math.sin(Math.cbrt(Math.cbrt(x[j]))));
				}

			}
		}

		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 13; j++){
				System.out.println(c[i][j]);
			}
		}
	}
}