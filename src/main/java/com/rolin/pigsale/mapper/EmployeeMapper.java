package com.rolin.pigsale.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rolin.pigsale.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
