package week7

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  val problem = new Pouring(Vector(4, 9));System.out.println("""problem  : week7.Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with week7.test.problem.Move] = """ + $show(res$0));$skip(37); val res$1 = 
  
  problem.pathSets.take(3).toList;System.out.println("""res1: List[Set[week7.test.problem.Path]] = """ + $show(res$1));$skip(22); val res$2 = 
  problem.solution(6);System.out.println("""res2: Stream[week7.test.problem.Path] = """ + $show(res$2))}

}