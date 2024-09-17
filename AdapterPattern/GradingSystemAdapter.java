public class GradingSystemAdapter implements schoolManagementApp{
    private gradingSystem gradingSystem;

    public GradingSystemAdapter(gradingSystem gradingSystem){
        this.gradingSystem = gradingSystem;
    }
    public void integrateSystem(){
        gradingSystem.recordGrades();
}
}