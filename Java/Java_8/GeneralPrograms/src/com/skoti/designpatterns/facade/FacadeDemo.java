package com.skoti.designpatterns.facade;

public class FacadeDemo {

    public static void main(String[] args) {

        HelperFacade.generateReport(HelperFacade.DBType.MONGO,HelperFacade.ReportType.PDF);
        HelperFacade.generateReport(HelperFacade.DBType.POSTGRES,HelperFacade.ReportType.HTML);
    }
}
