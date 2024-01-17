package com.atguigu.gulimail.order.dao

import com.atguigu.gulimail.order.entity.OrderReturnReasonEntity
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper

/**
 * 退货原因
 *
 * @author liu
 * @email liu@gmail.com
 * @date 2024-01-17 22:17:23
 */
@Mapper
interface OrderReturnReasonDao : BaseMapper<OrderReturnReasonEntity>
