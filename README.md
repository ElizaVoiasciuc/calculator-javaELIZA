# calculator-javaELIZA
1. Numărul total de linii de cod LOC (pentru proiectul complet, adică pentru toate fişierele în mod colectiv):
214 (Calculator.java= 188 și Start.java = 26)

2. Complexitatea ciclomatică a metodelor evaluateExpression şi Calculate.
Calculator::evaluateExpression	 12
Calculator::Calculate		 12	 

Am folosit instrumentul Codalyze din Visual Studio Code, din care intelegem ca metoda evaluateExpression are complexitatea ciclomatica 12.
Aceeasi complexitate ciclomatica o are si metoda Calculate.

3. Complexitatea  cognitivă a metodelor evaluateExpression şi Calculate.
    * metoda evaluateExpression *
  Avand in vedere ca sunt prezente mai multe constructii pentru controlul fluxului precum bucle for, blocuri condiţionate if-else, dar si imbricării suplimentare ale acestora, codul acestei metode este considerat complex. Am calculat o complexitate cognitiva de 14 puncte:
* primul bloc conditionat if =1 punct
* bucla for si imbricărea suplimentara if = 1+2 puncte
* bucla for = 1 punct
  * bloc conditionat if/ else if /else  =2+2+2 puncte
  * pentru ultima avem imbricărea suplimentara try = 3 puncte
 
  * metoda Calculate *
 Avand in vedere ca sunt prezente mai multe  blocuri condiţionate if-else, cu imbricării suplimentare, codul acestei metode este considerat complex. Am calculat o complexitate cognitiva de 15 puncte dupa cum urmeaza:
* bloc conditionat if =1 punct
* bloc conditionat if =1 punct
   * imbricărea suplimentara if= 2 puncte
   * imbricărea suplimentara else = 2 puncte
* bloc conditionat if =1 punct
* bloc conditionat if =1 punct
* bloc conditionat if =1 punct
   * imbricărea suplimentara if= 2 puncte
   * imbricărea suplimentara else = 2 puncte
* bloc conditionat if =1 punct
* bloc conditionat if =1 punct

Putem concluziona că codurile acestor metode au o complexitate cognitiva relativ ridicată. Metoda metoda evaluateExpression efectuează mai mulți pași pentru a calcula valoarea expresiei date ca parametru de intrare. Complexitatea este sporită și mai mult de faptul că metoda trebuie să gestioneze cazuri diferite în funcție de prezența diferitelor operații aritmetice în expresie. Acest lucru  face codul dificil de înțeles deoarece  necesită o monitorizare atentă.  Metoda „Calculate” folosește diferiți algoritmi pentru a efectua operații matematice (adunare, scădere,înmulțire, împărțire) și manipulare a listelor de „numere” și „operații” pentru a calcula rezultatul final.
    
   
