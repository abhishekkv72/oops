
public class Main {
	public static void main(String args[]){

		AdminDepartment adminDepartment = new AdminDepartment();
		HRDepartment hrDepartment = new HRDepartment();
		TechDepartment techDepartment = new TechDepartment();	
		
		System.out.println("Welcome to "+ adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println("\n\n");

		System.out.println("Welcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println("\n\n");

		System.out.println("Welcome to " + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.doActivity());
		System.out.println(techDepartment.isTodayAHoliday());

	    }

}
