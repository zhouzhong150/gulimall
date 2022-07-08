package com.zz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.common.utils.PageUtils;
import com.zz.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-09 18:24:21
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    Long[] findCatelogPath(Long catelogId);

    void updateCascade(CategoryEntity category);
}

