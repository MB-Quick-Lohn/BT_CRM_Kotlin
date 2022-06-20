package de.quick.crm

/**
 * zeigt auf der Konsole ein (oder zwei) Tabellen, die einen Überblick geben, wie sich die Kundenversionen aufteilen
 */
class KundenService {
  fun zeigeVerteilungDerKundenversionen() {
    val fileContent = KundenTxtFileLoader().getKundenTxt()
    println(fileContent)
  }
}