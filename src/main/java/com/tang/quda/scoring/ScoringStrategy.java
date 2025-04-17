package com.tang.quda.scoring;

import com.tang.quda.model.entity.App;
import com.tang.quda.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 *
 * @author tang
 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}