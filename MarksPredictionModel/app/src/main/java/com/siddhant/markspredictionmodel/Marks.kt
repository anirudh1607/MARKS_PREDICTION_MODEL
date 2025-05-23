data class GivenMarks(
    val minutes: Int,
    val marks: Double,
    var hours: Double? = 0.0,
)

data class PredictedResult(
    val predictedMarks: Double,
    val suggestion: String
)

object PredictiveModel{
    var m = 0.0
    var c = 0.0
    init{
        val model = arrayListOf(
            GivenMarks(30, 25.0),
            GivenMarks(40, 30.0),
            GivenMarks(50, 35.0),
            GivenMarks(60, 40.0),
            GivenMarks(70, 45.0),
            GivenMarks(80, 45.0),
            GivenMarks(90, 45.0),
            GivenMarks(100, 45.0),
            GivenMarks(110, 45.0),
            GivenMarks(120, 46.0),
            GivenMarks(130, 47.0),
            GivenMarks(140, 48.0),
            GivenMarks(150, 49.0),
            GivenMarks(160, 50.0),
            GivenMarks(170, 51.0),
            GivenMarks(180, 52.0),
            GivenMarks(190, 53.0),
            GivenMarks(200, 54.0),
            GivenMarks(210, 55.0),
            GivenMarks(220, 56.0),
            GivenMarks(230, 57.0),
            GivenMarks(240, 58.0),
            GivenMarks(250, 59.0),
            GivenMarks(260, 60.0),
            GivenMarks(270, 61.0),
            GivenMarks(280, 62.0),
            GivenMarks(290, 63.0),
            GivenMarks(300, 64.0),
            GivenMarks(310, 65.0),
            GivenMarks(320, 66.0),
            GivenMarks(330, 67.0),
            GivenMarks(340, 68.0),
            GivenMarks(350, 69.0),
            GivenMarks(360, 70.0),
            GivenMarks(370, 71.0),
            GivenMarks(380, 72.0),
            GivenMarks(390, 73.0),
            GivenMarks(400, 74.0),
            GivenMarks(410, 75.0),
            GivenMarks(420, 76.0),
            GivenMarks(430, 77.0),
            GivenMarks(450, 78.0),
            GivenMarks(460, 79.0),
            GivenMarks(470, 80.0),
            GivenMarks(480, 81.0),
            GivenMarks(490, 82.0),
            GivenMarks(500, 83.0),
            GivenMarks(510, 84.0),
            GivenMarks(520, 85.0),
            GivenMarks(530, 86.0),
            GivenMarks(540, 87.0),
            GivenMarks(550, 88.0),
            GivenMarks(560, 89.0),
            GivenMarks(570, 90.0),
            GivenMarks(580, 91.0),
            GivenMarks(590, 92.0),
            GivenMarks(600, 92.0),
            GivenMarks(610, 92.0),
            GivenMarks(620, 92.0),
            GivenMarks(630, 92.0),
            GivenMarks(640, 92.0),
            GivenMarks(650, 92.0),
            GivenMarks(660, 92.0),
            GivenMarks(670, 93.0),
            GivenMarks(680, 94.0),
            GivenMarks(690, 94.0),
            GivenMarks(700, 94.0),
            GivenMarks(700, 94.0),
            GivenMarks(710, 95.0),
            GivenMarks(720, 95.0),
            GivenMarks(730, 95.0),
            GivenMarks(740, 95.0),
            GivenMarks(750, 95.0),
            GivenMarks(760, 95.0),
            GivenMarks(770, 95.0),
            GivenMarks(780, 95.0),
            GivenMarks(790, 96.0),
            GivenMarks(800, 96.0),
            GivenMarks(810, 97.0),
            GivenMarks(820, 98.0),
            GivenMarks(830, 98.0),
            GivenMarks(840, 98.0),
            GivenMarks(850, 98.0),
            GivenMarks(860, 98.0),
            GivenMarks(870, 98.0),
            GivenMarks(880, 98.0),
            GivenMarks(890, 98.0),
            GivenMarks(900, 87.0),
            GivenMarks(910, 86.0),
            GivenMarks(920, 85.0),
            GivenMarks(930, 84.0),
            GivenMarks(940, 83.0),
            GivenMarks(950, 82.0),
            GivenMarks(960, 82.0),
            GivenMarks(970, 82.0),
            GivenMarks(980, 82.0),
            GivenMarks(990, 82.0),
            GivenMarks(1000, 70.0),
            GivenMarks(1010, 70.0),
            GivenMarks(1020, 70.0),
            GivenMarks(1030, 70.0),
            GivenMarks(1040, 70.0),
            GivenMarks(1050, 70.0),
            GivenMarks(1060, 70.0),
            GivenMarks(1070, 70.0),
            GivenMarks(1080, 70.0),
            GivenMarks(1090, 70.0),
            GivenMarks(1100, 69.0),
            GivenMarks(1110, 69.0),
            GivenMarks(1120, 69.0),
            GivenMarks(1130, 69.0),
            GivenMarks(1140, 68.0),
            GivenMarks(1150, 67.0),
            GivenMarks(1160, 66.0),
            GivenMarks(1170, 65.0),
            GivenMarks(1180, 64.0),
            GivenMarks(1190, 63.0),
            GivenMarks(1200, 62.0),
            GivenMarks(1210, 61.0),
            GivenMarks(1220, 60.0),
            GivenMarks(1230, 60.0),
            GivenMarks(1240, 60.0),
            GivenMarks(1250, 60.0),
            GivenMarks(1260, 60.0),
            GivenMarks(1270, 60.0),
            GivenMarks(1280, 60.0),
            GivenMarks(1290, 60.0),
            GivenMarks(1300, 60.0),
        )
        model.forEach { it.hours = it.minutes/60.0 }
        val sumX = model.sumOf { it.hours?:0.0 }
        val sumY = model.sumOf { it.marks }
        val sumOfXY = model.map { ((it.hours ?: 0.0) * it.marks) }.sum()
        val productOfSumXSumY = sumX * sumY
        val sumOfSqX = model.sumOf { (it.hours?.times(2)) ?: 0.0 }
        val sumOfXSq = sumX.times(2)
        val n = model.count()
        m = ((n * sumOfXY) - productOfSumXSumY)/((n * sumOfSqX) - sumOfXSq)
        c = (sumY - (m * sumX))/n
    }

    fun predictMarks(noOfHours: Double): PredictedResult{
        val minutes = noOfHours * 60
        val predictedMarks = (m * noOfHours) + c
        return PredictedResult(
            if(predictedMarks > 99) 98.0 else predictedMarks,
            when{
                (minutes < 360) -> "You need to work Hard"
                (minutes > 360 && minutes < 700) -> "You are doing good. Keep focus on your goals"
                (minutes > 700 && minutes < 900) -> "You are doing great"
                (minutes > 900 && minutes < 1000) -> "You are doing great. But rest is also the part of process."
                (minutes > 1000) -> "You are over burdening yourself. Have some relax and review what you have done."
                else -> "Keep it Up"
            }
        )
    }
}