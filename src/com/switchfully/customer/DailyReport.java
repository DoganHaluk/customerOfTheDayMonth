package com.switchfully.customer;

public class DailyReport {
    private ReportType type;

    public DailyReport(ReportType type) {
        super();
        setReportType(type);
    }

    public void setReportType(ReportType type) {
        this.type = type;
    }
}
