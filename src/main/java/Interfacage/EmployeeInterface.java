/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfacage;

import java.util.List;

/**
 *
 * @author khali
 */
public interface EmployeeInterface {
    public void createEmployee(Employee em); // vous devez ajouter un employé
    public void updateEmployee(Employee em); // {} interdit
    public List<Employee> listerEmployee();
    public void deleteEmployee(int id);
    public Employee findById(int id);
    public Employee findByNom(String nom);
    
}
