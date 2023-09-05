package com.rolin.pigsale.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rolin.pigsale.entity.Employee;
import com.rolin.pigsale.mapper.EmployeeMapper;
import com.rolin.pigsale.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService{
}
