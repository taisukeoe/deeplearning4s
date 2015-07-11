package org.deeplearning4s.plot

import org.deeplearning4j.plot.Tsne
import org.deeplearning4j.plot.Tsne.Builder

object TsneAt {
  def apply(maxIter: Int = 1000,
            realMin: Double = 1e-12f,
            initialMomentum: Double = 5e-1f,
            finalMomentum: Double = 5e-1f,
            momentum: Double = 5e-1f,
            switchMomentumIteration: Int = 100,
            normalize: Boolean = true,
            usePca: Boolean = false,
            stopLyingIteration: Int = 100,
            tolerance: Double = 1e-5f,
            learningRate: Double = 1e-1f,
            useAdaGrad: Boolean = false,
            perplexity: Double = 30,
            minGain: Double = 1e-1f): Tsne =
    new Builder()
      .minGain(minGain)
      .perplexity(perplexity)
      .useAdaGrad(useAdaGrad)
      .learningRate(learningRate)
      .tolerance(tolerance)
      .stopLyingIteration(stopLyingIteration)
      .usePca(usePca)
      .normalize(normalize)
      .setMaxIter(maxIter)
      .setRealMin(realMin)
      .setInitialMomentum(initialMomentum)
      .setFinalMomentum(finalMomentum)
      .setMomentum(momentum)
      .setSwitchMomentumIteration(switchMomentumIteration)
      .build()
}
