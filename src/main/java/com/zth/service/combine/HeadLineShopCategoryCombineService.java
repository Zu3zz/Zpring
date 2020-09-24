package com.zth.service.combine;

import com.zth.entity.dto.MainPageInfoDTO;
import com.zth.entity.dto.Result;

/**
 * @author 3zZ.
 * @date  2020/9/25.
 */
public interface HeadLineShopCategoryCombineService {
    Result<MainPageInfoDTO> getMainPageInfo();
}
