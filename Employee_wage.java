public class Employee_wage{

    public static void main(String[] args) {

	int attendance_checker = (Math.random() *100 ) % 2;
	if( attendance_checker == 1 ) {
		System.out.println("The Employee is Present");
	}
	else{
		System.out.println("The Employee is absent");
	}	
    }

}
