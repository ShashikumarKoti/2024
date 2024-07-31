package com.example.skoti;

import com.example.skoti.model.Employee;
import com.example.skoti.repo.EmployeeRepository;
import com.example.skoti.service.EmployeeServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

//Not using MockitoExtension here
public class EmployeeServiceTestWithoutUsingMockitoRunner {

    @InjectMocks
    private EmployeeServiceImpl employeeServiceImpl;

    @Mock
    private EmployeeRepository employeeRepository;

    private Employee employee;


    @Before
    public void setUp() {
        //Upon initialization of junit tests below line initializes the mock objects.
        MockitoAnnotations.openMocks(this);

        employee = Employee.builder()
                .id(219L)
                .firstName("sassy")
                .lastName("koti")
                .email("sk@gmail.com")
                .build();
    }

    @DisplayName("JUnit for saveEmployee method")
    @Test
    public void saveEmployeeTest() throws Exception {
        when(employeeRepository.findByEmail(employee.getEmail()))
                .thenReturn(Optional.empty());
        when(employeeRepository.save(employee)).thenReturn(employee);

        Employee saveEmployee = employeeServiceImpl.saveEmployee(employee);
        System.out.println(saveEmployee);
        assertThat(saveEmployee).isNotNull();
    }

    @DisplayName("JUnit for getAllEmployees method")
    @Test
    public void getAllEmployeesTest() {
        Employee employee1 = Employee.builder()
                .id(2L)
                .firstName("Tony")
                .lastName("Stark")
                .email("tony@gmail.com")
                .build();

        when(employeeRepository.findAll()).thenReturn(List.of(employee, employee1));
        List<Employee> allEmployees = employeeServiceImpl.getAllEmployees();

        assertThat(allEmployees).isNotNull();
        assertThat(allEmployees.size()).isEqualTo(2);
        assertEquals(2, employeeServiceImpl.getAllEmployees().size());
    }

    @DisplayName("JUnit test for getEmployeeById method")
    @Test
    public void getEmployeeByIdTest() {
        when(employeeRepository.findById(employee.getId())).thenReturn(Optional.of(employee));

        Employee savedEmployee = employeeServiceImpl.getEmployeeByID(employee.getId()).get();

        System.out.println(savedEmployee);
        assertEquals(219L, savedEmployee.getId());
    }

    @DisplayName("JUnit test for updateEmployee method")
    @Test
    public void updateEmployeeTest() {
        when(employeeRepository.save(employee)).thenReturn(employee);

        employee.setEmail("sk11@gmail.com");
        Employee updatedEmployee = employeeServiceImpl.updateEmployee(employee);
        System.out.println(updatedEmployee);

        assertEquals("sk11@gmail.com", updatedEmployee.getEmail());
    }

    @DisplayName("JUnit test for deleteEmployee method")
    @Test
    public void deleteEmployeeTest() {
        doNothing().when(employeeRepository).deleteById(employee.getId());

        employeeServiceImpl.deleteEmployee(employee.getId());

        verify(employeeRepository, times(1)).deleteById(employee.getId());
    }
}
