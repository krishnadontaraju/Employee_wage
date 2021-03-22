public class Employee_wage{

    public static void main(String[] args) {
	int present_counter = 0;
	for( int rotater = 0; rotater < 30 ;rotater++ ){
		int attendance_checker = (int) (Math.random() *100 ) % 2;
		if ( attendance_checker == 1 )
		 	present_counter += 1;
		}
	int Wage_per_hr = 20;
	int Working_hrs =  8;
	int part_time_hr = 4;
	int part_time_counter = 0;
	for( int rotater = 0; rotater < present_counter rotater++ ){
		int part_time_checker = (int) (Math.random() * 1000000 ) % 2;
		if( part_time_checker == 1 ){
			part_time_counter += 1;
		}
	}
	int part_time_wage = part_time_counter * part_time_hr * Wage_per_hr;
	int total_wage = present_counter * Wage_per_hr * Working_hrs  + part_time_wage ;
	System.out.println("Your total Pay for " + present_counter +" Days, with " + part_time_counter * 4 + " Part Hours is " + total_wage );





    }

}
