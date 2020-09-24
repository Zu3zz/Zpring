package com.zth.service.solo;

import com.zth.entity.bo.ShopCategory;
import com.zth.entity.dto.Result;

import java.util.List;

/**
 * @author 3zZ.
 * Date: 2020/9/25.
 */
public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(int shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);

    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);
}
