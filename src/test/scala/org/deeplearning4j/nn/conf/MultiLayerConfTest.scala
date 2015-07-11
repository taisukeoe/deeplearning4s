package org.deeplearning4j.nn.conf

import org.deeplearning4j.nn.conf.NeuralNetConfiguration.Builder
import org.deeplearning4j.nn.conf.`override`.ConfOverride
import org.deeplearning4s.nn.multilayer.MultiLayerConf
import org.nd4j.linalg.api.ndarray.INDArray
import org.scalatest.FlatSpec
import scala.collection.JavaConverters._

class MultiLayerConfTest extends FlatSpec {
  "MultiLayerConf" should "set each property to MultiLayerConfiguration instance correctly" in {
    val hiddenLayerSizesV: Array[Int] = Array(1)
    val useDropConnectV: Boolean = true
    val pretrainV: Boolean = true
    val useRBMPropUpAsActivationsV: Boolean = true
    val dampingFactorV: Double = 1000D
    val backwardV: Boolean = true
    val inputPreProcessorsV: Map[Int, InputPreProcessor] = Map(1 -> new InputPreProcessor {
      override def preProcess(input: INDArray): INDArray = ???
    })
    val preProcessorsV: Map[Int, OutputPreProcessor] = Map(2 -> new OutputPreProcessor {
      override def preProcess(output: INDArray): INDArray = ???
    })
    val confsV: Seq[NeuralNetConfiguration] = List(new NeuralNetConfiguration())
    val confOverridesV: Map[Int, ConfOverride] = Map(1 -> new ConfOverride {
      override def overrideLayer(i: Int, builder: Builder): Unit = ???
    })

    val mlc = MultiLayerConf(hiddenLayerSizesV,
      useDropConnect = useDropConnectV,
      pretrain = pretrainV,
      useRBMPropUpAsActivations = useRBMPropUpAsActivationsV,
      dampingFactor = dampingFactorV,
      backward = backwardV,
      inputPreProcessors = inputPreProcessorsV,
      preProcessors = preProcessorsV,
      confs = confsV,
      confOverrides = confOverridesV
    )

    assert(mlc.hiddenLayerSizes == hiddenLayerSizesV)
    assert(mlc.useDropConnect == useDropConnectV)
    assert(mlc.pretrain == pretrainV)
    assert(mlc.useRBMPropUpAsActivations == useRBMPropUpAsActivationsV)
    assert(mlc.dampingFactor == dampingFactorV)
    assert(mlc.backward == backwardV)
    assert(mlc.inputPreProcessors == inputPreProcessorsV.map{case (i,p) => Integer.valueOf(i)->p}.asJava)
    assert(mlc.getProcessors == preProcessorsV.map{case (i,p) => Integer.valueOf(i)->p}.asJava)
    assert(mlc.confs == confsV.asJava)
  }
}
