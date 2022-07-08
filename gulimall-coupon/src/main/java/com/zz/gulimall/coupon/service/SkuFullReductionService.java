package com.zz.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.common.to.SkuReductionTo;
import com.zz.common.utils.PageUtils;
import com.zz.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-10 08:54:55
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);
}

