package com.atguigu.gulimail.order.service

import com.atguigu.common.utils.PageUtils
import com.atguigu.gulimail.order.entity.OrderReturnApplyEntity
import com.baomidou.mybatisplus.extension.service.IService

/**
 * 订单退货申请
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
interface OrderReturnApplyService : IService<OrderReturnApplyEntity> {

    fun queryPage(params: MutableMap<String, Any>): PageUtils
}

