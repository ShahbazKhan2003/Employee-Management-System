package com.example.ems.service;

import com.example.ems.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
  EmployeeDto createEmployee(EmployeeDto employeeDto);
  EmployeeDto getEmployeeById(Long employeeId);
  List<EmployeeDto> getAllEmployees();
  EmployeeDto updateEmployee(Long employeeId , EmployeeDto updatedEmployee);
  EmployeeDto deleteEmployee(Long employeeId);
}
