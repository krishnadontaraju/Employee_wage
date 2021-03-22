public class Employee_wage{

	public static void main(String[] args) {
        int total_hrs = 0;
        int working_days = 0;
        int Wage_per_hr = 20;
        int Working_hrs =  8;
        int part_time_hr = 4;
        int part_time_counter = 0;
		int attendance_counter = 0;
		int month_ticker = 0;
        while ( (total_hrs < 101 && working_days < 21 ) && month_ticker < 31){
                int attendance_checker = (int) (Math.random() * 10 ) % 2;
                switch (attendance_checker){
                        case 0 :
                                int part_time_checker = (int) (Math.random() * 10 ) % 2;
                                switch ( part_time_checker ) {
                                        case 0 :
												part_time_hr += 4;
                                                total_hrs += 12;
												part_time_counter += 1;
												working_days += 1;
												attendance_counter += 1;
												month_ticker += 1;
                                                break;
                                        case 1 :
                                                total_hrs += 8;
												attendance_counter += 1;
												working_days += 1;
												month_ticker += 1;
                                                break;
                                        default :
                                                System.out.println("The Program ran into nuts ! ");
                                                break;
								}		
                                break;
                        case 1 :
								month_ticker += 1;
                               break;
                        default :
                                System.out.println("The System has gone nuts !");
                                break;
            }
        }
        int part_time_wage = part_time_counter * part_time_hr * Wage_per_hr;
        int total_wage = attendance_counter * Wage_per_hr * Working_hrs  + part_time_wage ;
		System.out.println("Your Total Hours are" + total_hrs);
        System.out.println("Your total Pay for "+ attendance_counter +" Days, with " + part_time_hr + " Part Hours is " + total_wage );





    }

}
