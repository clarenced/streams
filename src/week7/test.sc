package week7

object test {
  val problem = new Pouring(Vector(4, 9))         //> problem  : week7.Pouring = week7.Pouring@140aa23
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with we
                                                  //| ek7.test.problem.Move] = Vector(Empty(0), Empty(1), Fill(0), Fill(1), Pour(0,
                                                  //| 1), Pour(1,0))
  
  problem.pathSets.take(3).toList                 //> res1: List[Set[week7.test.problem.Path]] = List(Set(--> Vector(0, 0)), Set(P
                                                  //| our(0,1)--> Vector(0, 0), Fill(0)--> Vector(4, 0), Empty(0)--> Vector(0, 0),
                                                  //|  Fill(1)--> Vector(0, 9), Pour(1,0)--> Vector(0, 0), Empty(1)--> Vector(0, 0
                                                  //| )), Set(Pour(1,0) Empty(0)--> Vector(0, 0), Empty(0) Fill(0)--> Vector(4, 0)
                                                  //| , Pour(0,1) Fill(0)--> Vector(4, 0), Fill(0) Pour(1,0)--> Vector(0, 0), Fill
                                                  //| (1) Empty(1)--> Vector(0, 0), Pour(0,1) Pour(0,1)--> Vector(0, 0), Fill(0) F
                                                  //| ill(0)--> Vector(4, 0), Pour(0,1) Pour(1,0)--> Vector(0, 0), Pour(0,1) Fill(
                                                  //| 1)--> Vector(0, 9), Pour(1,0) Empty(1)--> Vector(0, 0), Empty(1) Empty(1)-->
                                                  //|  Vector(0, 0), Empty(1) Pour(1,0)--> Vector(0, 0), Fill(1) Fill(1)--> Vector
                                                  //| (0, 9), Empty(0) Pour(1,0)--> Vector(0, 0), Empty(0) Empty(0)--> Vector(0, 0
                                                  //| ), Empty(1) Fill(0)--> Vector(4, 0), Pour(1,0) Pour(0,1)--> Vector(0, 0), Em
                                                  //| pty(0) Fill(1)--> Vector(0, 9), Pour(0,1) Empty(1)--> Vector(0, 0), Fill(1) 
                                                  //| Pour(1,0)--> Vector(9, 5
                                                  //| Output exceeds cutoff limit.
  problem.solution(6)                             //> res2: Stream[week7.test.problem.Path] = Stream(Fill(1) Pour(1,0) Pour(1,0) P
                                                  //| our(0,1)--> Vector(6, 5), ?)

}