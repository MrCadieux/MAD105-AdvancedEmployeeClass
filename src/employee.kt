import java.text.DecimalFormat

class employee constructor(name: String,
                           position: PositionTitle,
                           salary: Boolean,
                           payRate: Double,
                           shift: Int) {
    var weeklyPay = 0.0
    val dollarAmount = DecimalFormat("#,###.00")

    var name: String = name
        get() = field
        set(value) {
            field = value
        }
    var position: PositionTitle = position
        get() = field
        set(value) {
            field = value
        }
    var salary: Boolean = salary
        get() = field
        set(value) {
            field = value
        }
    var payRate: Double = payRate
        get() = field
        set(value) {
            field = value
        }
    var shift: Int = shift
        get() = field
        set(value) {
            field = value
        }

    init {
        println("Employee Added: $name")
    }

    //Calculates the payRate, overTime, and weeklyPay
    fun calculate(hoursIn: Double){
        //5% for 2nd shift 10% for 3rd shift
        if (shift == 2){
            payRate = payRate+0.05*payRate
        }
        if (shift == 3){
            payRate = payRate+0.1*payRate
        }
        //Determine overtime for non-administration
        //Update weeklyPay for employee
        if (salary == false && hoursIn>40){
            var overTime = hoursIn-40
            weeklyPay = payRate*hoursIn+((1.5*payRate)*overTime)
        }
        else {
            weeklyPay = payRate*hoursIn
        }
        var formattedWeeklyPay = dollarAmount.format(weeklyPay)

        println("This week, $name made: $$formattedWeeklyPay\n")

    }

    fun display(){
        var formattedPayRate: String =""
        formattedPayRate=dollarAmount.format(payRate)

        println("$name works in $position earning $formattedPayRate per hour")
        print("$position is ")
        if (salary==true){
            print("a salaried position. ")
        }
        else{
            print("not a salaried position. ")
        }
        println("$name works shift #$shift")
    }
}