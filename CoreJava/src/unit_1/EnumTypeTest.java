package unit_1;

enum Gender {
	Male,
	Female
} 

enum WeekDay{
	SUN,
	MON,
	TUE,
	WED,
	THU,
	FRI,
	SAT
}
public class EnumTypeTest {
	//Gender 	// Values (Male, Female)
	//WeekDay 	// Values (SUN, ...., SAT)
	//Month	  	// Values (JAN, DEC)
	//RESULT	// Values (PASS, FAIL)
	//COLOR		// Values (RED, GREEN, BLUE) 	
	public static void main(String[] args) {
		
		//Declare
		boolean result;//possible values
		byte bn; //-128 to 127 //possible values range		
		Gender gender;
		WeekDay day;
		
		gender = Gender.Male;
		System.out.println(gender);		
		
		day = WeekDay.WED;
		System.out.println(day);		
	}

}
