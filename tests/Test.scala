object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(58, 84, 13, 14, 6)
    assert(Policy.score(signalcase_1) == 116)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(81, 81, 9, 20, 8)
    assert(Policy.score(signalcase_2) == 141)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(107, 78, 19, 12, 13)
    assert(Policy.score(signalcase_3) == 220)
    assert(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(57, 43, 12, 90)
    assert(DomainReviewLens.score(domainReview) == 211)
    assert(DomainReviewLens.lane(domainReview) == "ship")
  }
}
