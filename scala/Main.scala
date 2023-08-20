object Main {

  //ЧАСТЬ А
  def main(args: Array[String]): Unit = {
    val x = "Hello, Scala!"
    println(x)

    println(x.reverse)//вывод фразы справа налево

    val y="HELLO,SCALA!"
    println(y.toLowerCase())//вывод фразы в нижнем регистре
    println()

    println("Enter the number of sumbol")
    val num=scala.io.StdIn.readInt()//ввод номера символа, который требуется удалить
    println(remove(x,num))
    println()

    val len=x.length()//длина строки
    val str=remove(x,len-1)//удаляем последний символ
    println(str +" and goodbye python!")//добавляем фразу
  }

  def remove(x:String,n:Int): String = {//функция для удаления символа
    x.take(n)+x.drop(n+1)
  }


  //ЧАСТЬ В

  //Ежемесячный оклад сотрудника после вычета налогов
  def month_sal(sal: Double, prem: Double, food: Double): Double = {
    val res = (sal + sal * prem + food) / 12
    res
  }

  println("Monthly salary:")
  println(month_sal(300, 20, 100))
  println()

  //Напишите программу, которая рассчитывает для каждого сотрудника отклонение (в процентах) от среднего значения оклада на уровне всего отдела.
  val salary = List(100, 150, 200, 80, 120, 75)

  def dev(sal: Double): Double = {
    val res = sal / (salary.sum / salary.length) * 100 - 100
    res
  }
  println("Deviation:")
  println(salary.map(sal => dev(sal)).mkString(", "))
  println()

  // Попробуйте рассчитать новую зарплату сотрудника, добавив (или отняв, если сотрудник плохо себя вел)
  // необходимую сумму с учетом результатов прошлого задания. Добавьте его зарплату в список и вычислите значение самой высокой зарплаты и самой низкой.
  val dop = List(1, -6, -23, 15, 3, -10)
  val new_sal = (salary, dop).zipped.map(_ + _).sorted

  println("min salary: " + new_sal.head + ", max salary: " + new_sal.last)
  println()

  //добавить два значения и отсортировать список сотрудников по уровню оклада от меньшего к большему
 val plus_2 = salary ::: List(350, 90)
  println("New salary list with two new workers: " + plus_2.sorted.mkString(", "))
  println()

  // Взяли в команду еще одного сотрудника с окладом 130 тысяч.
  // Вычислите самостоятельно номер сотрудника в списке так, чтобы сортировка не нарушилась, и добавьте его на это место.
  val id: Int = plus_2.sorted.indexWhere(element => element > 130)
  println("ID new worker:"+ id)
  println("New salary list: " + (plus_2.sorted.take(id) ++ List(130) ++ plus_2.sorted.drop(id)).mkString(", "))
  println()

  //вывести номера сотрудников из полученного списка, которые попадают под категорию middle.
  println("Salary bracket")
  println("Enter the upper bound")
  val max_bound: Int = scala.io.StdIn.readInt()
  println("Enter the lower bound")
  val min_bound: Int = scala.io.StdIn.readInt()
  var i: Int = 0
  val lst = plus_2.sorted
  print("Salary list for middle: ")
  while (i < plus_2.length) {
    if (lst(i) > min_bound && lst(i) < max_bound) print(i + " ")
    i += 1
  }
  println()

  //проиндексировать зарплату каждого сотрудника на уровень инфляции  — 7 %.
  val ind: Double = 0.07

  def fun(sal: Double): Double = {
    val res = sal * (1 + ind)
    res
  }
  println("Changed salary list: " + plus_2.map(sal => fun(sal)).mkString(", "))
}






