public class InformationStudent {
    final String notScholor = "Không đủ điều kiện đạt học bổng";
    final String good = "8 triệu";
    final String excellent = "17 triệu";
    final private double gpa;
    final private int drl;
    final private int credit;

    public InformationStudent(double _gpa, int _drl, int _credit) {
        this.gpa = _gpa;
        this.drl = _drl;
        this.credit = _credit;
    }

    public double getGpa() {
        return gpa;
    }

    public int getDrl() {
        return drl;
    }

    public int getCredit() {
        return credit;
    }

    public String checkScholarship() {
        if (gpa < 3.2 || drl < 80 || credit < 13) {
            return notScholor;
        }
        if (gpa < 3.6) {
            return good;
        }
        if( drl < 90) {
            return good;
        }
        else {
            return excellent;
        }
    }
}
