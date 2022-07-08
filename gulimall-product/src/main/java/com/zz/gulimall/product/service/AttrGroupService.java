package com.zz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.common.utils.PageUtils;
import com.zz.gulimall.product.entity.AttrGroupEntity;
import com.zz.gulimall.product.vo.AttrGroupWithAttrsVo;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-09 18:24:22
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);
}

