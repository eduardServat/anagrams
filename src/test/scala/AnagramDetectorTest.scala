package org.anagrams.application

import org.scalatest.FunSuite

class AnagramDetectorTest extends FunSuite {
  test("AnagramDetector.isAnagram") {
    assert(AnagramDetector.isAnagram("New York Times", "Monkeys Write") === true)
  }
}
