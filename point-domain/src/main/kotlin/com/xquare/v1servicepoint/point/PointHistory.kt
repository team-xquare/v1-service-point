package com.xquare.v1servicepoint.point

import com.xquare.v1servicepoint.annotation.Aggregate
import java.util.*

@Aggregate
class PointHistory(
    val id: UUID,

    val pointId: UUID,

    val userId: UUID
)
