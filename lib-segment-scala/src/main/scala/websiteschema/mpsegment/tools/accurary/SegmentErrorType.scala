package websiteschema.mpsegment.tools.accurary

object SegmentErrorType extends Enumeration {
  type SegmentErrorType = Value
  val ContainDisambiguate, NER_NR, NER_NS, UnknownWord, Other = Value
}
