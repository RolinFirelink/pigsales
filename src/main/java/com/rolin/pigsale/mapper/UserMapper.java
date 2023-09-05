package com.rolin.pigsale.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rolin.pigsale.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
