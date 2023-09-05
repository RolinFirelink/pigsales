package com.rolin.pigsale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rolin.pigsale.dto.SetmealDto;
import com.rolin.pigsale.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 批量删除套餐
     * @param ids
     */
    public void deleteWithDish(List<Long> ids);

    /**
     * 根据id查询套餐信息
     * @param ids
     * @return
     */
    public SetmealDto getByIdWithDish(Long ids);

    /**
     * 修改套餐信息
     * @param setmealDto
     */
    public void updateWithDish(SetmealDto setmealDto);

}
