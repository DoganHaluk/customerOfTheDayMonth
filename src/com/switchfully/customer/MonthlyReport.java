package com.switchfully.customer;

public class MonthlyReport {
    private ReportType type;

    public MonthlyReport(ReportType type) {
        super();
        setReportType(type);
    }

    public void setReportType(ReportType type) {
        this.type = type;
    }
}
