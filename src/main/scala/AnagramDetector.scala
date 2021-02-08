package org.anagrams.application

object AnagramDetector extends App {
  def isAnagram(textA: String, textB: String): Boolean = {
    val a: String = formatText(textA).sortWith(_ < _)
    val b: String = formatText(textB).sortWith(_ < _)
    if (a == b) {
      true;
    } else {
      false;
    }
  }

  def formatText(text: String): String = {
    text.toLowerCase().replace(" ", "")
  }
}
