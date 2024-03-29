package com.atguigu.gulimail.member.service.impl

import com.atguigu.common.utils.PageUtils
import com.atguigu.common.utils.Query
import com.atguigu.gulimail.member.dao.MemberCollectSpuDao
import com.atguigu.gulimail.member.entity.MemberCollectSpuEntity
import com.atguigu.gulimail.member.service.MemberCollectSpuService
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.baomidou.mybatisplus.core.metadata.IPage
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.springframework.stereotype.Service

@Service("memberCollectSpuService")
class MemberCollectSpuServiceImpl : ServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity>(),
    MemberCollectSpuService {

    override fun queryPage(params: MutableMap<String, Any>): PageUtils {
        val page: IPage<MemberCollectSpuEntity> = this.page(
            Query<MemberCollectSpuEntity>().getPage(params),
            QueryWrapper()
        )

        return PageUtils(page)
    }

}