/* Description : A student wants to pay his tuition through myNEU account;
 * 
 * Objects in this scenario (with state and behaviors):
 * 
 * 		Object : Student
 * 			State : name, NUID, studentAccount
 * 			Behavior : logOnSchoolWebsite(), makePaymentToSchool()
 *
 * 		Object : SchoolWebsite
 * 			State : contain all student accounts
 * 			Behavior : getStudentAccount(), acceptPaymentFromStudent(), generateReceiptForStudent()
 * 
 * 		Object : StudentAccount
 * 			State : NUID, tuition
 * 			Behavior : getTuition()
 * 
 *  	Object : Tuition
 * 			State : name, NUID
 * 
 * 		Object : Receipt
 * 			State : name
 * 		
 * 		Object : Money
 * 			State : amount
 */

public class PayTuition {
	public static void main(String args[]) {
		Student Ruby = new Student();
		Ruby.name = "Ruby";
		Ruby.NUID = "012345678";
		
		SchoolWebsite myNEUWebsite = new SchoolWebsite();
		
		Ruby.logOnSchoolWebsite(myNEUWebsite);
		StudentAccount RubyAccount = myNEUWebsite.getStudentAccount(Ruby.NUID);
		
		Tuition RubyTuition = RubyAccount.getTuition();
		Money paymentFromRuby = Ruby.makePaymentToSchool(myNEUWebsite, RubyTuition);
		myNEUWebsite.acceptPaymentFromStudent(Ruby, paymentFromRuby);		
		Receipt receiptForRuby = myNEUWebsite.generateReceiptForStudent(Ruby, paymentFromRuby);
	}
}

class Student {
	String name;
	String NUID;
	void logOnSchoolWebsite(SchoolWebsite sw){}
	Money makePaymentToSchool(SchoolWebsite sw, Tuition t){}	
}

class SchoolWebsite {
	StudentAccount[] studentAccounts; 
	StudentAccount getStudentAccount(String NUID){}
	void acceptPaymentFromStudent(Student s, Money m){}
	Receipt generateReceiptForStudent(Student s, Money m){}
}

class StudentAccount {
	float tuition;
	String NUID;
	Tuition getTuition(){}
}

class Tuition {
	String name;
	String NUID;
}

class Money {
	float amount;
}

class Receipt {
	String name;
}

