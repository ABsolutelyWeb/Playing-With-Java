package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFomatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    private String getFormatEmp() {
        return getOutput();
    }
}
