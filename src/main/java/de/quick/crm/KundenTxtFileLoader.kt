package de.quick.crm

import java.io.File

class KundenTxtFileLoader {
  fun getKundenTxt(): String {
    return File("src/main/resources/kunden.txt").readText(Charsets.UTF_8)
  }
}