package org.deeplearning4j.optimize

import org.deeplearning4j.nn.conf.NeuralNetConfiguration
import org.deeplearning4j.optimize.listeners.ScoreIterationListener
import org.deeplearning4s.optimize.SolverAt
import org.deeplearning4s.plot.BarnesHutTsneAt
import org.scalatest.FlatSpec

class SolverAtTest extends FlatSpec {
  "SolverAt" should "create a solver to return optimizer without exception" in {
    val conf = new NeuralNetConfiguration()
    val model = BarnesHutTsneAt()
    val listeners = Seq(new ScoreIterationListener())

    SolverAt(conf, model, listeners).getOptimizer
  }
}