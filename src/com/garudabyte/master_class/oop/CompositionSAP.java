package com.garudabyte.master_class.oop;

public class CompositionSAP {
    public static void main(String[] args) {
        String expenseType = "Reimbursement";
        FileHeader fileHeader = new FileHeader(expenseType);
        FileContent fileContent= new FileContent(expenseType);
        SAPFormatter sapGenerator = new SAPFormatter(fileHeader,fileContent);
        sapGenerator.exportFileToCSV();
    }
}

class SAP{
    private String expenseType;

    protected SAP(String expenseType) {
        this.expenseType = expenseType;
    }
}

class SAPFormatter{
    private FileHeader fileHeader;
    private FileContent fileContent;

    public SAPFormatter(FileHeader fileHeader, FileContent fileContent) {
        this.fileHeader = fileHeader;
        this.fileContent = fileContent;
    }

    public void exportFileToCSV(){
        fileHeader.getContent();
        fileContent.getContent();
    }
}

class FileHeader extends SAP{
    protected FileHeader(String expenseType) {
        super(expenseType);
    }

    protected void getContent(){
        System.out.println("Header");
    }
}
class FileContent extends SAP{
    public FileContent(String expenseType) {
        super(expenseType);
    }

    protected void getContent(){
        System.out.println("Content");
    }
}





