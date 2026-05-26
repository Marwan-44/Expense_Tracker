fun main () {

    var category: String
    var expense: Double
    var choose = 0

    label@while (true) {

        try {
            println("Choose option : \n1-> Add expense \n2-> Show all Category \n3-> Search by expense \n4-> Remove expense \n5-> Exit")
            println("---------------------")
            choose = readlnOrNull()!!.toInt()
            println("---------------------")
        }
        catch (e:Exception){
            println("---------------------")
            println("Please Enter Valid number")
            println("---------------------")

        }


        when (choose) {

            1 -> {
                var count = 0

                try {
                    println("How many Category :")
                    count = readln().toInt()
                    println("---------------------")
                }
                catch (e : Exception){
                    println("---------------------")
                    println("Please Enter Valid number")
                    println("---------------------")
                }

                for (i in 1..count) {
                    print("Enter Category $i :")
                    category = readlnOrNull()!!
                    try {
                        print("Add an Expense of Category $i :")
                        expense = readlnOrNull()!!.toDouble()
                        println("---------------------")
                        data_map(category, expense)
                    }
                    catch (e : Exception){
                        println("---------------------")
                        println("Please Enter Valid number")
                        println("---------------------")
                    }
                }
            }

            2 -> {
                data.forEach { (_, data) ->
                    println("category ${data.category} is ${data.expense}$")
                    println("---------------------")
                }
            }

            3 -> {
                var search = ""
                try {
                    print("Which Category you want to search for : ")
                    search = readlnOrNull()!!
                    println("---------------------")
                }
                catch (e : Exception){
                    println("---------------------")
                    println("Please Enter Valid Name")
                    println("---------------------")
                }


                if (search in  data.keys){
                    val search_value = data[search]


                    if (search_value!= null){
                        println("Category ${search_value.category} and There Expenses are ${search_value.expense} $")
                        println("---------------------")
                    }
                }
                else{
                    println("not found")
                    println("---------------------")
                }

            }

            4 -> {
                print("Which Category do you want to remove some of expense : ")
                val remove_category = readln()
                println("---------------------")

                if (remove_category in data){

                    print("Hou much ? ")
                    val remove_expense = readln().toDouble()
                    println("---------------------")

                    val remover = data[remove_category]

                    if (remover != null) {
                        if (remove_expense < remover.expense) {
                            remover.expense -= remove_expense

                            println("new total for ${remover.category} is ${remover.expense}")
                            println("---------------------")
                        }
                        else{
                            println("Please Enter number is less than your expense of [${remover.category}]")
                            println("---------------------")
                        }
                    }
                }

                else{
                    println("Category [$remove_category] not found!")
                    println("---------------------")
                }
            }

            5->{
                println("Thanks for using my application")
                println("---------------------")
                break@label
            }
            else->{
                println("Please choose number in options !")
                println("---------------------")
            }
        }
    }
}


val data = mutableMapOf<String,Data>()
data class Data(val category : String, var expense : Double)

fun data_map (name : String , price : Double){

    if (data.containsKey(name)){
        data[name]!!.expense += price
    }
    else{
        data[name] = Data(name,price)
    }
}