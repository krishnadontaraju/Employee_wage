public class Employee_wage{

    public static void main(String[] args) {
	int Wage_per_hr = 20;
	int Working_hrs =  8;
	int part_time_hr = 4;
	int part_time_counter = 0;
	for( int rotater = 0; rotater2 < 20; rotater2++ ){
		int part_time_checker = (int) (Math.random() * 1000000 ) % 2;
		switch (part_time_checker){
			case 1 :
				part_time_counter += 1;
				break;
			case 0 :
				break;
			default :
				System.out.println("The System has gone nuts !");
				break
		}
	}
	int part_time_wage = part_time_counter * part_time_hr * Wage_per_hr;
	int total_wage = 20 * Wage_per_hr * Working_hrs  + part_time_wage ;
	System.out.println("Your total Pay for 20 Days, with " + part_time_counter * 4 + " Part Hours is " + total_wage );





    }

}
