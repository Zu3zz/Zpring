package com.zth.service.solo;

import com.zth.entity.bo.HeadLine;
import com.zth.entity.dto.Result;

import java.util.List;

/**
 * @author 3zZ.
 * Date: 2020/9/25.
 */
public interface HeadLineService {
    Result<Boolean> addHeadLine(HeadLine headLine);

    Result<Boolean> removeHeadLine(int headLineId);

    Result<Boolean> modifyHeadLine(HeadLine headLine);

    Result<HeadLine> queryHeadLineById(int headLineId);

    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize);
}
