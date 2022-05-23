package com.masai;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails()
	{
		System.out.println("courseId: "+courseId);
		System.out.println("courseName: "+courseName);
		System.out.println("courseFee: "+courseFee);
	}
	
	static void authenticate(String username, String password)
	{
		if(username.equals("Admin") && password.equals("1234"))
		{
			Course obj = new Course();
			
//			obj.courseId=courseId;
//			obj.courseName=courseName;
//			obj.courseFee=courseFee;
		}
	}
	
//	public class Scanner{
//		Scanner scanner = new Scanner(System.in);
//		int cId;
//		String cName;
//		int cFee;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
