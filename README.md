# calculator-javaELIZA
1. Numărul total de linii de cod LOC (pentru proiectul complet, adică pentru toate fişierele în mod colectiv):
214 (Calculator.java= 188 și Start.java = 26)

2. Complexitatea ciclomatică a metodelor evaluateExpression şi Calculate.
Calculator::evaluateExpression	 12
Calculator::Calculate		 12	 

Am folosit instrumentul Codalyze din Visual Studio Code, din care intelegem ca metoda "evaluateExpression" are complexitatea ciclomatica 12. Aceeasi complexitate ciclomatica o are si metoda Calculate. Interpretarea rezultatelor obţinute urmarind scalele definite de Thomas McCabe, autorul complexităţii ciclomatice  este: 11–20 – cod moderat complex (risc moderat);

3. Complexitatea  cognitivă a metodelor evaluateExpression şi Calculate.
   
     Metoda evaluateExpression 
      
Avand in vedere ca sunt prezente mai multe constructii pentru controlul fluxului precum bucle for, blocuri condiţionate if-else, dar si imbricării suplimentare ale acestora, codul acestei metode este considerat complex. Am calculat o complexitate cognitiva de 14 puncte:
* primul bloc conditionat if =1 punct
* bucla for si imbricărea suplimentara if = 1+2 puncte
* bucla for = 1 punct
  - bloc conditionat if/ else if /else  =2+2+2 puncte
  - pentru ultima avem imbricărea suplimentara try = 3 puncte
 
     Metoda Calculate 
    
Avand in vedere ca sunt prezente mai multe  blocuri condiţionate if-else, cu imbricării suplimentare, codul acestei metode este considerat complex. Am calculat o complexitate cognitiva de 15 puncte dupa cum urmeaza:
* bloc conditionat if =1 punct
* bloc conditionat if =1 punct
   - imbricărea suplimentara if= 2 puncte
   - imbricărea suplimentara else = 2 puncte
* bloc conditionat if =1 punct
* bloc conditionat if =1 punct
* bloc conditionat if =1 punct
   - imbricărea suplimentara if= 2 puncte
   - imbricărea suplimentara else = 2 puncte
* bloc conditionat if =1 punct
* bloc conditionat if =1 punct

Putem concluziona că aceste metode au o complexitate cognitiva relativ ridicată. Metoda "evaluateExpression" efectuează mai mulți pași pentru a calcula valoarea expresiei date ca parametru de intrare. Complexitatea este sporită și mai mult de faptul că metoda trebuie să gestioneze cazuri diferite în funcție de prezența diferitelor operații aritmetice în expresie. Acest lucru  face codul dificil de înțeles deoarece  necesită o monitorizare atentă. Metoda "Calculate" folosește diferiți algoritmi pentru a efectua operații matematice (adunare, scădere,înmulțire, împărțire) și manipulare a listelor de "numere" și "operații" pentru a calcula rezultatul final.

4.Efectuaţi o revizuire informală a codului şi o analiză statică (fără a rula codul). Formulaţi concluziile sub forma unui raport în următorul format:
fişier – numărul liniei de cod – observaţie

            Analiza informala a codului

Programul este scris în limbajul Java.
La pornirea programului, sa stabilit că programul funcționează.
Programul are o licență care ne permite controlul complet, modificarea,citirea si executia, scrierea, autorizatii speciale.
Este format din două fișiere: Start.java și Calculator.java. Aceste două fișiere fac parte din același program, unde Start.java este clasa care conține metoda principală „main” care se execută la pornirea programului și prin care se realizează interacțiunea cu utilizatorii, în timp ce „Calculator.java” este clasa care conține logica pentru executarea operațiilor matematice la intrarea utilizatorului în consola „Start.java” și unde este tipărit rezultatul.
Efectuarea operațiunilor matematice prin introducerea expresiei de catre utilizator se face printr-o buclă infinită în „Start.java” și continuă până când utilizatorul tasteaza „exit” pentru a ieși din program.

          Analiză statică
          
Calculator.java - nr liniei de cod: 4 - Add a private constructor to hide the implicit public one.( ne cere sa adaugam un constructor privat pentru a ascunde cel implicit)
Calculator.java - nr liniei de cod: 18 - Rename method "ToString" to prevent any misunderstanding/clash with method "toString" defined in superclass "java.lang.Object". ( ne sugereaza sa redenumim metoda pentru a evita confuzia cu alta metoda car ese numeste "toString")
Calculator.java - nr liniei de cod: 24 - Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. ( ne zice sa redenumim metoda)
Calculator.java - nr liniei de cod: 70 - Immediately return this expression instead of assigning it to the temporary variable "textResult". (putem returna imediat expresia pentru a evita ocuparea inutila a spatiului in memorie in loc sa cream o vatiabila temporara)
Calculator.java - nr liniei de cod: 74 - Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. ( ne zice sa redenumim metoda)
Calculator.java - nr liniei de cod: 183 - Remove this redundant jump. ( nu este nevoie de 'return' la finalul programului deci de spune ca e inutil sa-l folosim, si ca putem sa-l stergem)

Start.java- nr liniei de cod: 6 - Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'.
Start.java- nr liniei de cod: 8 si 19- Replace this use of System.out or System.err by a logger. (Clasa System conține mai multe câmpuri și metode utile de clasă. Nu poate fi instanțiată. Printre facilitățile oferite de clasa System se numără fluxurile de intrare standard, de ieșire standard și de ieșire de eroare; acces la proprietăți definite extern și variabile de mediu; un mijloc de încărcare a fișierelor și bibliotecilor; și o metodă de utilitate pentru copierea rapidă a unei porțiuni dintr-o matrice.)

      
