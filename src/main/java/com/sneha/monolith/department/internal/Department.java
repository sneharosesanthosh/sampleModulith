package com.sneha.monolith.department.internal;

import com.sneha.monolith.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

}
