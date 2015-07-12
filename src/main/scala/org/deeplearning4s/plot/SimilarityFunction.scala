package org.deeplearning4s.plot

/*
  Since SimilarityFunction can be one of the followings: eucidean, cosinesimilarity, manhattan, dot, it would be union type of them.

  https://github.com/deeplearning4j/deeplearning4j/blob/5fc4fd12d9251eff5e00a1816fd9ec185cf9cdb4/deeplearning4j-core/src/main/java/org/deeplearning4j/clustering/sptree/DataPoint.java#L68-L88
 */
sealed abstract class SimilarityFunction(val name:String)
case object Eucidean extends SimilarityFunction("eucidean")
case object CosineSimilarity extends SimilarityFunction("cosinesimilarity")
case object Manhattan extends SimilarityFunction("manhattan")
case object Dot extends SimilarityFunction("dot")
