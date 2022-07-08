package com.zz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.common.utils.PageUtils;
import com.zz.gulimall.product.entity.AttrEntity;
import com.zz.gulimall.product.vo.AttrGroupRelationVo;
import com.zz.gulimall.product.vo.AttrRespVo;
import com.zz.gulimall.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-09 18:24:22
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    void saveAttr(AttrVo attr);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);
}

