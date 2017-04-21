val h = List(1,3,4,6,2)
print(h)
h.foldLeft("")(_ + _)
h.foldRight("")(_ + _)
h.foldLeft("!")(_ + _)
h.foldRight("!")(_ + _)


def tail[A](ls: List[A]): List[A] = ls match {
  case Nil => throw new IllegalArgumentException
  case a :: tail => tail

}

val fg = List(1,4,6,8,4)

tail(h)