public class Doctor {
    public static void treatment(String patientname, int age) {
        System.out.println("This is Doctor class");

        System.out.println("Patient name: " + patientname);
        System.out.println("Age: " + age);
		

        Nurse.assist(patientname);
    }
}
