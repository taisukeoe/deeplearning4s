package org.deeplearning4j.plot

import org.deeplearning4s.plot.TsneAt
import org.scalatest.FlatSpec

class TsneAtTest extends FlatSpec {
  "TsneAt" should "set each property to Tsne instance correctly" in {
    val maxIteraV = 10000
    val realMinV = 1e-13f
    val initialMomentumV = 5e-2f
    val finalMomentumV = 5e-3f
    val momentumV = 5e-4f
    val switchMomentumIterationV = 1000
    val normalizeV = false
    val usePcaV = false
    val stopLyingIterationV = 1000
    val toleranceV = 1e-6f
    val learningRateV = 1e-2f
    val useAdaGradV = true
    val perplexityV = 300
    val minGainV = 1e-2f

    val tsne = TsneAt(
      maxIter = maxIteraV,
      realMin = realMinV,
      initialMomentum = initialMomentumV,
      finalMomentum = finalMomentumV,
      momentum = momentumV,
      switchMomentumIteration = switchMomentumIterationV,
      normalize = normalizeV,
      usePca = usePcaV,
      stopLyingIteration = stopLyingIterationV,
      tolerance = toleranceV,
      learningRate = learningRateV,
      useAdaGrad = useAdaGradV,
      perplexity = perplexityV,
      minGain = minGainV)

    assert(tsne.maxIter == maxIteraV)
    assert(tsne.realMin == realMinV)
    assert(tsne.initialMomentum == initialMomentumV)
    assert(tsne.finalMomentum == finalMomentumV)
    assert(tsne.momentum == momentumV)
    assert(tsne.switchMomentumIteration == switchMomentumIterationV)
    assert(tsne.normalize == normalizeV)
    assert(tsne.usePca == usePcaV)
    assert(tsne.stopLyingIteration == stopLyingIterationV)
    assert(tsne.tolerance == toleranceV)
    assert(tsne.learningRate == learningRateV)
    assert(tsne.useAdaGrad == useAdaGradV)
    assert(tsne.perplexity == perplexityV)
    assert(tsne.minGain == minGainV)
  }
}
