package ge.ibsu.demo.controllers;

import ge.ibsu.demo.entities.Department;
import ge.ibsu.demo.repositories.EmployeeSummary;
import ge.ibsu.demo.services.HRService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hr")
public class HRController {
    private final HRService hrService;

    public HRController(HRService hrService) {
        this.hrService = hrService;
    }

    @GetMapping("/departments")
    public List<Department> getDepartments() {
        return hrService.getAllDeptsWithEmployees();
    }

    @GetMapping("/employees/summary")
    public List<EmployeeSummary> getEmployeeSummaries() {
        return hrService.getEmployeeSummaries();
    }

    @PostMapping("/departments")
    public Department addDepartment(@RequestBody Department department) {
        return hrService.addDepartment(department);
    }
}
