fun main() {
    // write your code here
    val numOfCompanies = readln().toInt()

    val listCompanyIncome = mutableListOf<Int>()
    val listTaxPercentage = mutableListOf<Int>()
    val listTaxValue = mutableListOf<Float>()

    for (i in 1..numOfCompanies) {
        listCompanyIncome.add(readln().toInt())
    }

    for (i in 1..numOfCompanies) {
        listTaxPercentage.add(readln().toInt())
    }

    for (i in listCompanyIncome.indices) {
        listTaxValue.add((listCompanyIncome[i] * listTaxPercentage[i]).toFloat())
    }

    println(listTaxValue.indexOf(listTaxValue.maxOrNull()) + 1)
}