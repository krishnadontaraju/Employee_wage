public class Employee_wage_builder{

    public static void main(String[] args) {
	int present_counter = 0;
	for( int rotater = 0; rotater < 30 ;rotater++ ){
		int attendance_checker = (Math.random() *100 ) % 2;
		if ( attendance_checker == 1 )
		 	present_counter += 1;
		}
	int Wage_per_hr = 20;
	int Working_hrs =  8;

	int total_wage = present_counter * Wage_per_hr * Working_hrs ;
	System.out.println("Your total Pay for " + present_counter +" Days is " + total_wage );





    }

}
