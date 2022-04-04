package com.Akhilesh_Sahu;

public class Project1 {
    public static void main(String[] args) {
        String arr[][]={
              //  {"Emp N0", "Emp Name","join Date","Designation", "Department","Basic","HRA","IT"},
                {"1001", "Ashish","01/04/2009","e","R&D","20000", "8000","3000"},
                {"1002", "Sushma","23/08/2012","c","PM","30000", "12000","9000"},
                {"1003", "Rahul","12/11/2008","k","Acct","10000", "8000","1000"},
                {"1004", "Chahat","29/01/2013","r","Front Desk","12000", "6000","2000"},
                {"1005", "Ranjan","16/07/2005","m","Engg","50000", "20000","20000"},
                {"1006", "Suman","1/1/2000","e","Manufacturing","23000", "9000","4000"},
                {"1007", "Tanmay","12/06/2006","c","PM","29000", "12000","10000"},
        };
        String empNo=args[0];
        int empN=Integer.parseInt(empNo);
        if(empN>=1001 && empN<=1007) {

            String empName = null;
            String department = null;
            String designation = null;
            String designationCode = null;
            String basic = null;
            String hRA = null;
            String iT = null;
            String dA = null;
            int salary = 0;
            for (int k = 0; k < arr.length; k++) {
                if (empNo.equals(arr[k][0])) {
                    empName = arr[k][1];
                    department = arr[k][4];
                    designationCode = arr[k][3];
                    basic = arr[k][5];
                    hRA = arr[k][6];
                    iT = arr[k][7];
                    break;
                }

            }


            switch (designationCode) {
                case "e": {
                    designation = "Engineer";
                    dA = "20000";
                    break;
                }
                case "c": {
                    designation = "Consultant";
                    dA = "32000";
                    break;
                }
                case "k": {
                    designation = "Clerk";
                    dA = "12000";
                    break;
                }
                case "r": {
                    designation = "Receptionist";
                    dA = "15000";
                    break;
                }
                case "m": {
                    designation = "Manager";
                    dA = "40000";
                }
            }
            salary = (Integer.parseInt(basic) + Integer.parseInt(hRA) + Integer.parseInt(dA) - Integer.parseInt(iT));
       /* for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }*/
            System.out.print("empNo empName department designation salary");
            System.out.println();
            System.out.print(empNo + " " + empName + " " + department + " " + designation + " " + salary);
        }
        else {
        System.out.println("There is no employee with empid: "+empN);}
    }
}
