public class Aspirant extends Student{
    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        }
        else {
            return 180;
        }
    }
}
