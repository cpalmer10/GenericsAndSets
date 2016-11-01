/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Chris
 */
public class Startup {
    public static void main(String[] args) {
        Employee e1 = new Employee("Palmer", "Chris", "123-45-6789");
        Employee e2 = new Employee("Boyer", "Will", "123-45-6790");
        Employee e3 = new Employee("Palmer", "Chris", "123-45-6789");
        Employee e4 = new Employee("Doe", "John", "987-65-4321");
        
        List employees = new ArrayList();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        Employee employee = (Employee)employees.get(2);
        System.out.println(employee);
        System.out.println("-------------");
        System.out.println("New Loop");
        System.out.println("-------------");
        for(Object e : employees){
            Employee em1 = (Employee)e;
            System.out.println(em1);
        }
        System.out.println("-------------");
        System.out.println("Old Loop");
        System.out.println("-------------");
        for(int i = 0; i < employees.size() - 1; i++){
            Employee em2 = (Employee)employees.get(i);
            System.out.println(em2);
        }
        System.out.println("-------------");
        System.out.println("Remove Employee: "); 
        System.out.println("--------------");
        employees.remove(1);
       
       for(Object e : employees){
            Employee em1 = (Employee)e;
            System.out.println(em1);            
        }
       System.out.println(employees.size());
       
        System.out.println("-------------");
        System.out.println("----------------");
        System.out.println("Add Employee Back In: ");
        employees.add(new Employee("Smith", "Bob", "111-11-1111"));
        for(Object e : employees){
            Employee em1 = (Employee)e;
            System.out.println(em1);            
        }
        System.out.println(employees.size());
        System.out.println("-------------------------");
        System.out.println("Replace Existing Employee:");
         System.out.println("-------------");
        employees.set(2, new Employee("Baker", "Bob", "222-22-2222"));
        for(Object e : employees){
            Employee em1 = (Employee)e;
            System.out.println(em1);            
        }
    }
}
