package org.deeplearning4s.optimize

import org.deeplearning4j.nn.api.Model
import org.deeplearning4j.nn.conf.NeuralNetConfiguration
import org.deeplearning4j.optimize.Solver
import org.deeplearning4j.optimize.api.IterationListener

import scala.collection.JavaConverters._

object SolverAt {
      def apply(conf:NeuralNetConfiguration,
                 model:Model,listeners:Seq[IterationListener] = Nil):Solver  =
        new Solver.Builder().configure(conf).model(model).listeners(listeners.asJava).build()
}
