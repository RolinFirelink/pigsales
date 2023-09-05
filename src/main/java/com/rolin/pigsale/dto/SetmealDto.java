package com.rolin.pigsale.dto;

import com.rolin.pigsale.entity.Setmeal;
import com.rolin.pigsale.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
