package com.zz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.common.utils.PageUtils;
import com.zz.gulimall.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-09 18:24:21
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveProductAttr(List<ProductAttrValueEntity> collect);

    List<ProductAttrValueEntity> baseAttrlistforspu(Long spuId);

    void updateSpuAttr(Long spuId, List<ProductAttrValueEntity> entities);
}

