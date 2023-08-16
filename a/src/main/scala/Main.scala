object Main {
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

}
