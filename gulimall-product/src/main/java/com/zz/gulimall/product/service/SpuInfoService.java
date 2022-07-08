package com.zz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.common.utils.PageUtils;
import com.zz.gulimall.product.entity.SpuInfoEntity;
import com.zz.gulimall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-09 18:24:20
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    public void saveBaseSpuInfo(SpuInfoEntity infoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);
}

