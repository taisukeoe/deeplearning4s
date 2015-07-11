package org.deeplearning4s.nn.multilayer

import org.deeplearning4j.nn.conf.MultiLayerConfiguration.Builder
import org.deeplearning4j.nn.conf.`override`.ConfOverride
import org.deeplearning4j.nn.conf.{InputPreProcessor, MultiLayerConfiguration, NeuralNetConfiguration, OutputPreProcessor}

import scala.collection.JavaConverters._

object MultiLayerConf {
  def apply(
             hiddenLayerSizes: Array[Int],
             useDropConnect: Boolean = false,
             pretrain: Boolean = false,
             useRBMPropUpAsActivations: Boolean = false,
             dampingFactor: Double = 100D,
             backward: Boolean = false,
             inputPreProcessors: Map[Int, InputPreProcessor] = Map.empty,
             preProcessors: Map[Int, OutputPreProcessor] = Map.empty,
             confs: Seq[NeuralNetConfiguration] = Nil,
             confOverrides: Map[Int, ConfOverride] = Map.empty
             ): MultiLayerConfiguration = {
    val builder = new Builder()
      .hiddenLayerSizes(hiddenLayerSizes: _*)
      .useDropConnect(useDropConnect)
      .pretrain(pretrain)
      .useRBMPropUpAsActivations(useRBMPropUpAsActivations)
      .dampingFactor(dampingFactor)
      .backward(backward)
      .inputPreProcessors(inputPreProcessors.map { case (i, p) => (int2Integer(i), p)}.toMap.asJava)
      .preProcessors(preProcessors.map { case (i, p) => (int2Integer(i), p)}.toMap.asJava)
      .confs(confs.asJava)

    confOverrides.collect { case (i, co) =>
      builder.`override`(i, co)
    }
    builder.build()
  }
}
