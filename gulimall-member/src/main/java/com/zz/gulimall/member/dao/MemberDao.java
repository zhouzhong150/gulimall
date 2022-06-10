package com.zz.gulimall.member.dao;

import com.zz.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zz
 * @email 1097449124@qq.com
 * @date 2022-06-10 09:10:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
