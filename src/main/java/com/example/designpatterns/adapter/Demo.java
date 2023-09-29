package com.example.designpatterns.adapter;

public class Demo {

    public static void main(String[] args) {
        CustomerAdapter adapter=new CustomerAdapter();
        populateCustomerData(adapter);
        BusinessCardDesigner designer=new BusinessCardDesigner();
        ;

        System.out.println(designer.designCard(adapter));

        System.out.println("****************************************");

        Employee employee=new Employee();
        populateCustomerData(employee);
        CustomerObjectAdapter objectAdapter=new CustomerObjectAdapter(employee);
        System.out.println(designer.designCard(objectAdapter));
    }

    public static void populateCustomerData(Employee employee) {
        employee.setFullName("Juan Martinez");
        employee.setJobTitle("Director");
        employee.setOfficeLocation("Santo Domingo");
    }
}
