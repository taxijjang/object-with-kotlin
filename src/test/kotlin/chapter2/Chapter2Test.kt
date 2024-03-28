package chapter2

import org.osds.chapter2.entity.*
import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalTime
import kotlin.test.Test

class Chapter2Test {

    @Test
    fun `영화 생성`() {
        // given
        val avator = Movie(
            title = "아바타",
            runningTime = Duration.ofMinutes(120),
            fee = Money.wons(10000),
            discountPolicy = AmountDiscountPolicy(
                discountAmount = Money.wons(800),
                mutableListOf(
                    SequenceCondition(1),
                    SequenceCondition(10),
                    PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                    PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59)),
                )
            )
        )

        // when


        // then


    }

}