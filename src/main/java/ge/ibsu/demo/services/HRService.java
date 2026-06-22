package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Department;
import ge.ibsu.demo.repositories.DepartmentRepository;
import ge.ibsu.demo.repositories.EmployeeRepository;
import ge.ibsu.demo.repositories.EmployeeSummary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HRService {
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public HRService(DepartmentRepository deptRepo, EmployeeRepository empRepo) {
        this.departmentRepository = deptRepo;
        this.employeeRepository = empRepo;
    }

    public List<Department> getAllDeptsWithEmployees() {
        return departmentRepository.findAllWithEmployees();
    }

    public List<EmployeeSummary> getEmployeeSummaries() {
        return employeeRepository.findAllBy();
    }

    @Transactional
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
