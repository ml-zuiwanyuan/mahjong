package websiteschema.mpsegment.tools.accurary

import websiteschema.mpsegment.core.{SegmentResult, WordAtom}
import websiteschema.mpsegment.dict.POSUtil

class NerNameErrorAnalyzer extends AbstractErrorAnalyzer {

  override def analysis(expect: WordAtom, possibleErrorWord: String): Boolean = {
    var foundError = false
    if (possibleErrorWord.replaceAll(" ", "").equals(expect.word)) {
      if (expect.pos == POSUtil.POS_NR) {
//        println(possibleErrorWord + " -- " + expect.word)
        increaseOccur()
        addErrorWord(expect.word)
        foundError = true
      }
    }
    return foundError
  }
}