package com.rolin.pigsale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rolin.pigsale.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
