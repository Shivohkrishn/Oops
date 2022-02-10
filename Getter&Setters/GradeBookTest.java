public class GradeBookTest{
    public static void main(String[] args) {
        GradeBook grd = new GradeBook("Mobile Computing","Xiaoming Liu, Ph.D.");
        System.out.println(grd.displayMessage());
        GradeBook grd2 = new GradeBook(grd);
        grd2.setCourseName("MC");
        System.out.println(grd2.displayMessage());

    }
}