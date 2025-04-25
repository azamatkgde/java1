package variable.meerim.CreditApplication;

import java.time.LocalDate;

public class PassportData {
    private String series;
    private String number;
    private String issuedBy;
    private LocalDate issuedDate;
    private String departmentCode;

    public PassportData() {
    }

    public PassportData(String series,String number,String issuedBy,LocalDate issuedDate, String departmentCode) {
        this.series = series;
        this.number = number;
        this.issuedBy = issuedBy;
        this.issuedDate = issuedDate;
        this.departmentCode = departmentCode;

    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "series:" + series + "\n"+
                "number:" + number + "\n"+
                "issuedBy:" + issuedBy + "\n"+
                "issuedDate:" + issuedDate + "\n"+
                "departmentCode:" + departmentCode + "\n";
                }
    }

