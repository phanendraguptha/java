class ForEachMArray {
		public static void main(String args[]) {
			int sum = 0;
			int num[][] = new int[3][5];
		// give num some values
			for(int i = 0; i < 3; i++)
				for(int j=0; j < 5; j++)
					num[i][j] = (i+1)*(j+1);
		// use for-each for to display and sum the values
			for(int x[] : num) {
			/*for(int p=0;p<5;p++)
				System.out.println("p="+x[p]);*/
				for(int y : x) {
					System.out.println("Value is: " + y);
					sum += y;
					    }
				              }
			System.out.println("Summation: " + sum);
				}
			}
