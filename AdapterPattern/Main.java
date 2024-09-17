public class Main{
    public static void main(String[]args){

        attendanceSystem AttendanceSystem = new attendanceSystem();
        gradingSystem GradingSystem = new gradingSystem();
        librarySystem LibrarySystem = new librarySystem();

        schoolManagementApp attendanceSystem = new AttendanceSystemAdapter(AttendanceSystem);
        schoolManagementApp gradingSystem = new GradingSystemAdapter (GradingSystem);
        schoolManagementApp librarySystem = new LibrarySystemAdapter (LibrarySystem);

        
        attendanceSystem.integrateSystem();
        gradingSystem.integrateSystem();
        librarySystem.integrateSystem();

    }
}