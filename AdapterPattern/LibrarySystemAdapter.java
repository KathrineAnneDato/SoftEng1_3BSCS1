public class LibrarySystemAdapter implements schoolManagementApp{
    private librarySystem librarySystem;

    public LibrarySystemAdapter(librarySystem librarySystem){
        this.librarySystem = librarySystem;
    }
    public void integrateSystem(){
        librarySystem.manageBooks();
}
}