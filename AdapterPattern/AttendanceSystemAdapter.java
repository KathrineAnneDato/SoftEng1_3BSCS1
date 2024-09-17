public class AttendanceSystemAdapter implements schoolManagementApp{
    private attendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(attendanceSystem attendanceSystem){
        this.attendanceSystem = attendanceSystem;
    }
    public void integrateSystem(){
        attendanceSystem.markAttendance();
}
}